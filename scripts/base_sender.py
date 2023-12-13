from concurrent import futures
from google.cloud import pubsub_v1
from typing import Callable

project_id = "windy-celerity-408010"
topic_id = "lab03-topic01"

publisher = pubsub_v1.PublisherClient()
topic_path = publisher.topic_path(project_id, topic_id)
publish_futures = []

def get_callback(
    publish_future: pubsub_v1.publisher.futures.Future, data: str
) -> Callable[[pubsub_v1.publisher.futures.Future], None]:
    def callback(publish_future: pubsub_v1.publisher.futures.Future) -> None:
        try:
            print(publish_future.result(timeout=60))
        except futures.TimeoutError:
            print(f"Publishing {data} timed out.")

    return callback

for i in range(10):
    data = "{\
	 'sensor_type': 'temperature',\
	 'sensor_value': 12,\
	 'time_stamp': 'Lviv',\
	 'location': 'ABOBA'}"
    publish_future = publisher.publish(topic_path, data.encode("utf-8"))
    publish_future.add_done_callback(get_callback(publish_future, data))
    publish_futures.append(publish_future)

futures.wait(publish_futures, return_when=futures.ALL_COMPLETED)

print(f"Published messages with error handler to {topic_path}.")

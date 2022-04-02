package ua.lviv.iot.manager;

import java.util.List;

import ua.lviv.iot.model.Music;

public interface IMusicShopManager {
	List<Music> findByGenreForCD(String genre);
	void sortByIncreasingDuration(List<Music> list);
	void sortByDecreasingDuration(List<Music> list);
	void sortByIncreasingSize(List<Music> list);
	void sortByDecreasingSize(List<Music> list);
}

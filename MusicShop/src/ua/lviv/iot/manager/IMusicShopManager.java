package ua.lviv.iot.manager;

import java.util.List;

import ua.lviv.iot.model.Music;

public interface IMusicShopManager {
	List<Music> findByGenreForCD(String genre);
	List<Music> getSortedByIncreasingDuration(List<Music> list);
	List<Music> getSortedByDecreasingDuration(List<Music> list);
	List<Music> getSortedByIncreasingSize(List<Music> list);
	List<Music> getSortedByDecreasingSize(List<Music> list);
}

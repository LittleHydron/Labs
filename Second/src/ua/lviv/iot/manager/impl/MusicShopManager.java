package ua.lviv.iot.manager.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ua.lviv.iot.manager.IMusicShopManager;
import ua.lviv.iot.model.Music;

public class MusicShopManager implements IMusicShopManager{
	Map<String, List<Music>> content = new HashMap<>();

	@Override
	public List<Music> findByGenreForCD(String genre) {
		return null;
	}

	@Override
	public void sortByIncreasingDuration(List<Music> list) {
		
	}

	@Override
	public void sortByDecreasingDuration(List<Music> list) {
		
	}

	@Override
	public void sortByIncreasingSize(List<Music> list) {
		
	}

	@Override
	public void sortByDecreasingSize(List<Music> list) {
		
	}
	
}

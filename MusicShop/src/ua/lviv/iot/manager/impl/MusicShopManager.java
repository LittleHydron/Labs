package ua.lviv.iot.manager.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ua.lviv.iot.manager.IMusicShopManager;
import ua.lviv.iot.model.Music;

public class MusicShopManager implements IMusicShopManager{
	Map<String, List<Music>> content = new HashMap<>();

	@Override
	public List<Music> findByGenreForCD(String genre) {
		List<Music> list = new LinkedList<>();
		content.get(genre).forEach(music->{
			if (music.getGenre().equals(genre)) list.add(music);
		});
		return list;
	}

	@Override
	public List<Music> getSortedByIncreasingDuration(List<Music> list) {
		Collections.sort(list, new Comparator<Music>() {
			@Override
			public int compare(Music m1, Music m2) {
				if (m1.getDurationInMinutes() < m2.getDurationInMinutes()) {
					return -1;
				}else {
					if (m1.getDurationInMinutes() == m2.getDurationInMinutes()) {
						return 0;
					}else return 1;
				}
			}
		});
		return list;
	}

	@Override
	public List<Music> getSortedByDecreasingDuration(List<Music> list) {
		Collections.sort(list, new Comparator<Music>() {
			@Override
			public int compare(Music m1, Music m2) {
				if (m1.getDurationInMinutes() > m2.getDurationInMinutes()) {
					return -1;
				}else {
					if (m1.getDurationInMinutes() == m2.getDurationInMinutes()) {
						return 0;
					}else return 1;
				}
			}
		});
		return list;
	}

	@Override
	public List<Music> getSortedByIncreasingSize(List<Music> list) {
		 Collections.sort(list, new Comparator<Music>() {
			@Override
			public int compare(Music m1, Music m2) {
				if (m1.getSizeInMb() < m2.getSizeInMb()) {
					return -1;
				}else {
					if (m1.getSizeInMb() == m2.getSizeInMb()) {
						return 0;
					}else return 1;
				}
			}
		});
		return list;
	}

	@Override
	public List<Music> getSortedByDecreasingSize(List<Music> list) {
		Collections.sort(list, new Comparator<Music>() {
			@Override
			public int compare(Music m1, Music m2) {
				if (m1.getSizeInMb() > m2.getSizeInMb()) {
					return -1;
				}else {
					if (m1.getSizeInMb() == m2.getSizeInMb()) {
						return 0;
					}else return 1;
				}
			}
		});
		return list;
	}
}

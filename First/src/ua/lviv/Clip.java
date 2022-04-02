package ua.lviv;

import java.util.Date;

public record Clip(String creatorsName, String songName, String tags, int duration, int numberOfViews, double sizeInBm, Date dateOfCreation){
	
	private static String resource = "Youtube";
	
	public static void setResource(String _resource) {
		resource = _resource;
	}
	public static String getResource(){
		return resource;
	}
	
	public Clip() {
		this("Pasha", "GimnUkrainy", "#the_best_song_of_all_time#download_and_listen_every_day",  73, 4000000, 31, new Date());
		System.out.print("Constructor of zero parameters was called\n");
	}
	public Clip(String creatorsName, String songName, String tags) {
		this(creatorsName, songName, tags,  73, 4000000, 31, new Date());
		System.out.print("Constructor of three parameters was called\n");
	}
	
	@Override
	public String toString(){
		String returnValue = "'" + songName + "' by " + creatorsName + " was viewed " + numberOfViews + " times. Tags: ";
		if (tags.length() > 0) {
			returnValue += tags.charAt(0);
			for (int i=1; i<tags.length(); i++) {
				if (tags.charAt(i) == '#') returnValue += ", ";
				returnValue += tags.charAt(i);
			}
		}
		returnValue += '\n';
		return  returnValue;
	}
}

package ua.lviv.iot.model;

public class Music {
	private String genre, name, author;
	private double durationInMinutes, sizeInMb;

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getDurationInMinutes() {
		return durationInMinutes;
	}
	public void setDurationInMinutes(double durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	public double getSizeInMb() {
		return sizeInMb;
	}
	public void setSizeInMb(double sizeInMb) {
		this.sizeInMb = sizeInMb;
	}
}

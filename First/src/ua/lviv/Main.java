package ua.lviv;

import java.util.Date;

public class Main {
	public static void print(String s, Clip... args) {
		System.out.println();
		for (Clip arg: args) {
			System.out.print(arg.toString());
		}
	}
	
	public static void main(String[] args) {
		Clip c1 = new Clip(),
			 c2 = new Clip("Wellboy", "Gusy", "#Oh_my_God#What_is_that"),
			 c3 = new Clip("Yarmak", "BackToTheGame", "#Feat_with_TrickyNicky", 320, 587000, 34, new Date(12L));
		print("\n", c1, c2, c3);
	}
}
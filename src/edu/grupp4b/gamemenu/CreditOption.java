package edu.grupp4b.gamemenu;

import java.util.Scanner;

public class CreditOption {

	public static void selectCredits() {
		Scanner s = new Scanner(System.in);
		System.out.println("        TIC-TAC-TOE\n" + "Lisa...........Lead Designer\n"
				+ "Rasmus.........Lead Designer\n" + "Victoria.......Lead Designer\n"
				+ "Oskar............UX Designer\n" + "Special thanks to\n" + "orangeFreeSounds for audio\n"
				+ "https://freesound.org/people/orangefreesounds/");
		System.out.println();
		
		System.out.println("\nPress any key to return to the menu.");
		System.out.print(">");
		s.hasNextLine();
		System.out.println("Returning to to Game Menu...");		
	}
}

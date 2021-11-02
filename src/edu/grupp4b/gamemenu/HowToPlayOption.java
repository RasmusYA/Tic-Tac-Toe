package edu.grupp4b.gamemenu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HowToPlayOption {
	public static void selectHowToPlay() throws InterruptedException {
		System.out.println("HOW TO PLAY");
		String howto1 = "oxoxoxoxoxo\n"
				+ "The game board consists of a grid of 3 horizontal rows and 3 vertical columns:";
		for (int j = 0; j < howto1.length(); j++) {
			System.out.print(howto1.charAt(j));
			Thread.sleep(40);
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println();
		System.out.println("\n" + "         COLUMNS  \n" + "        1   2   3 \n" + "     1    |   |   \n"
				+ "  R    ---+---+---\n" + "  O  2    |   |   \n" + "  W    ---+---+---\n"
				+ "  S  3    |   |   \n");

		TimeUnit.SECONDS.sleep(2);

		String howto2 = "You place your mark by entering a number 1-3.  First for which row and then once more for choice of column.\n"
				+ "oxoxoxoxo\n"
				+ "Example: Player X presses '2' for row and '3' for column, resulting in this game state:";
		for (int k = 0; k < howto2.length(); k++) {
			System.out.print(howto2.charAt(k));
			Thread.sleep(40);
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println();
		System.out.println("\n" + "        COLUMNS  \n" + "       1   2   3 \n" + "    1    |   |   \n"
				+ " R    ---+---+---\n" + " O  2    |   | X  \n" + " W    ---+---+---\n"
				+ " S  3    |   |   \n");
		System.out.println();
		try {
			System.out.println("\nPress any number key to return to the menu.");
			System.out.print(">");
			Scanner s2 = new Scanner(System.in);
			s2.nextInt();
			s2.close();
		} catch (Exception f) {
			System.out.print(" ");
		}
	}
}

package edu.grupp4b.gamemenu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HowToPlayOption {
	public static void selectHowToPlay() throws InterruptedException {

		Scanner s = new Scanner(System.in);
		/*
		 * Spelmekaniken förklaras med löpande text via inbyggda metoden Thread.sleep.
		 * sleep används också för att göra korta pauser mellan de olika instruktionerna.
		 */
		System.out.println("HOW TO PLAY");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("oxoxoxoxoxo");
		String howto1 = "The game board consists of a grid of 3 horizontal rows and 3 vertical columns:";
		for (int j = 0; j < howto1.length(); j++) {
			System.out.print(howto1.charAt(j));
			Thread.sleep(40);
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println();
		System.out.println("\n" + "         COLUMNS  \n" + "        1   2   3 \n" + "     1    |   |   \n"
				+ "  R    ---+---+---\n" + "  O  2    |   |   \n" + "  W    ---+---+---\n" + "  S  3    |   |   \n");

		TimeUnit.SECONDS.sleep(2);
		String howto2 = "You place your mark by entering a number 1-3.  First for which row and then once more for choice of column.";

		for (int k = 0; k < howto2.length(); k++) {
			System.out.print(howto2.charAt(k));
			Thread.sleep(40);
		}
		System.out.println("\noxoxoxoxo");
		TimeUnit.SECONDS.sleep(1);
		String howto3 = "Example: Player X presses '2' for row and '3' for column, resulting in this game state:";
		for (int k = 0; k < howto3.length(); k++) {
			System.out.print(howto3.charAt(k));
			Thread.sleep(40);
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println();
		System.out.println("\n" + "        COLUMNS  \n" + "       1   2   3 \n" + "    1    |   |   \n"
				+ " R    ---+---+---\n" + " O  2    |   | X  \n" + " W    ---+---+---\n" + " S  3    |   |   \n");

		/*
		 * Användaren får mata in valfri input för att återgå till menyn.
		 * en exception gör att samma resultat ges om input inte är en siffra.
		 */
		System.out.println();
		System.out.println("\nPress any key to return to the menu.");
		System.out.print(">");
//		try {
			s.hasNextLine();
//			s.nextInt();
//
			System.out.println("Returning to to Game Menu...");
//			s.close();
//		} catch (Exception e) {
//			System.out.println("Returning to to Game Menu...");
//
//		}
	}
}

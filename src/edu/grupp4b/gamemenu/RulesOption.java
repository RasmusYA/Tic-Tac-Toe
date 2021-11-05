package edu.grupp4b.gamemenu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RulesOption {
	public static void selectRules() {
		Scanner s = new Scanner(System.in);
		try {
			// Läser från .txt-filen Rules
			var input = new BufferedReader(new FileReader("Rules.txt"));

			while (true) {
				String rad = input.readLine();
				if (rad == null)
					break;
				System.out.println(rad);
			}
			input.close();
			// Felmeddelande om det skulle vara något krångel med .txt-filen
		} catch (Exception e) {
			System.out.print("Reading error: The rulebook file couldn't be located");
		}
		/*
		 * Användaren får mata in valfri input för att återgå till menyn. en exception
		 * gör att samma resultat ges om input inte är en siffra.
		 */
		System.out.println("\nPress any key to return to the menu.");
		System.out.print(">");
//		try {
		s.hasNextLine();
		// s.next();
//
		System.out.println("Returning to to Game Menu...");
//			s.close();
//		} catch (Exception e) {
//			System.out.println("Returning to to Game Menu...");

//	}
	}
}

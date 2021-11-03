package edu.grupp4b.gamemenu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class RulesOption {
	public static void selectRules(){
		Scanner s3 = new Scanner(System.in);
	try {
		var input = new BufferedReader(new FileReader("Rules.txt"));

		while (true) {
			String rad = input.readLine();
			if (rad == null)
				break;
			System.out.println(rad);
		}
	} catch (Exception e) {
		System.out.print("Reading error: The rulebook file couldn't be located");
	}
	try {
		System.out.println("\nPress any number key to return to the menu.");
		System.out.print(">");
		s3.nextInt();
		
	} catch (Exception f) {
		System.out.print(" ");
	}
}
}

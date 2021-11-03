package edu.grupp4b.game;

import java.util.Scanner;

public class SelectSlot {

	// Spelar får välja rad och kolumn vart de vill lägga sin nästa
	// spelpjäs som retunerar en sträng med rad + column
	public static String selectSlot(Scanner scanner) {
		System.out.println("Select row.");
		System.out.print(">");
		String num1 = scanner.next();
		System.out.println("Select column.");
		System.out.print(">");
		String num2 = scanner.next();
		String userInput = num1 + num2;

		return userInput;
	}
}
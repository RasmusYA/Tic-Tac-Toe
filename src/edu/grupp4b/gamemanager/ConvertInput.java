package edu.grupp4b.gamemanager;

public class ConvertInput {
	
	// Konverterar det som användaren skriver, till exempel row: 1 och column: 3
	// Input blir då 13, denna function konverterar detta till 2.
	public static int convertInputToInt(String userInput) {
		int boardNumber = switch (userInput) {
		case "11" -> 0;
		case "12" -> 1;
		case "13" -> 2;

		case "21" -> 3;
		case "22" -> 4;
		case "23" -> 5;

		case "31" -> 6;
		case "32" -> 7;
		case "33" -> 8;
		default -> 100;
		};
		return boardNumber;
	}
}

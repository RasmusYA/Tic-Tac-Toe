package edu.grupp4b.gamemenu;

import java.io.*;
import java.util.*;
import edu.grupp4b.game.*;

public class GameMenu {

	public static void main(String[] args) throws InterruptedException, IOException {

		String welcome = "Welcome to Tic-Tac-Toe!";
		for (int i = 0; i < welcome.length(); i++) {
			System.out.print(welcome.charAt(i));
			Thread.sleep(40);
		}

		int i = 1;
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		// Meny-loop som pressenterar menyval.
		do {

			String menu = ("\n O-------------------X\n" + " |Choose an Option:  |\n" + " |(1) -- Start Game  |\n"
					+ " |(2) -- How to Play |\n" + " |(3) -- Rules       |\n" + " |(4) -- Sound Option|\n"
					+ " |(5) -- Credits     |\n" + " |(6) -- Exit        |\n" + " X-------------------O");
			System.out.println(menu);
			System.out.print(">");
			String choice = s.nextLine();

			// switch/case låter användaren göra val med hjälp av sifferinmatning.
			switch (choice) {
			/*
			 * Case 1, 2, 3 och 4 anropar metoder från andra klasser i programmet och
			 * resulterar till att man tas vidare till andra delar av programmet.
			 */
			case "1":
				Game.startGame();
				break;
			case "2":
				HowToPlayOption.selectHowToPlay();
				break;
			case "3":
				RulesOption.selectRules();
				break;
			case "4":
				Scanner s4 = new Scanner(System.in);
				SoundOption.selectSound(s4);
				break;
			case "5":
				CreditOption.selectCredits();
				break;
			case "6":
				System.out.println("Program shutdown. Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Please, 1, 2, 3, 4, 5 or 6 only.");
			}

		} while (i == 1);
		s.close();
		s2.close();
	}
}

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
		//Meny-loop som låter användaren välja alternativ via sifferinmatning
		int i = 1;
		Scanner s = new Scanner(System.in);
		do {

			String menu = ("\n O-------------------X\n" + " |Choose an Option:  |\n" + " |(1) -- Start Game  |\n"
					+ " |(2) -- How to Play |\n" + " |(3) -- Rules       |\n" + " |(4) -- Sound Option|\n"
					+ " |(5) -- Credits     |\n" + " |(6) -- Exit        |\n" + " X-------------------O");
			System.out.println(menu);
			System.out.print(">");
			String choice = s.nextLine();

			switch (choice) {
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
				System.out.println("        TIC-TAC-TOE\n" + "Lisa...........Lead Designer\n"
						+ "Rasmus.........Lead Designer\n" + "Victoria.......Lead Designer\n"
						+ "Oskar............UX Designer\n" + "Special thanks to\n" + "orangeFreeSounds for audio\n"
						+ "https://freesound.org/people/orangefreesounds/");
				System.out.println();
				try {
				System.out.println("\nPress any key to return to the menu.");
				System.out.print(">");
				Scanner s5 = new Scanner(System.in);
				s5.nextInt();
				}
				catch(Exception h){
				System.out.print("");
				}
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
	}
}

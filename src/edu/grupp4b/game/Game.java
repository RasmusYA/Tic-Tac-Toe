package edu.grupp4b.game;

import java.util.Scanner;

import edu.grupp4b.enemy.*;
import edu.grupp4b.gameboard.GameBoard;
import edu.grupp4b.gamemanager.Score;

public class Game {

	public static void startGame() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		boolean playAgain = true;
		int round = 1;
		boolean starter = true;

		// Sätter spelarens och motståndarens Tag till X eller O
		char playerTag = GamerTagChoice.ChoosePlayer(scanner);
		char enemyTag = ' ';
		if (playerTag == 'X')
			enemyTag = 'O';
		else {
			enemyTag = 'X';
			starter = false;
		}

		// Spel-loop
		while (playAgain) {
			GameBoard.initializeNewGame(); // Återställer spelbräder, alla slots blir tomma
			GameBoard.showGameBoard(); // Visar spelbrädet
			while (true) {
				boolean addSlot = false;
				boolean enemyAddSlot = false;

				// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
				if (GameEndCheck.EndCheck(playerTag, enemyTag))
					break;

				// Startar rundan beroende på vem som börjar (X börjar alltid)
				// Vid nästa "slag" får nästa börja (rad 49), det vill säga O
				PlayRound.go(starter, addSlot, enemyAddSlot, scanner, playerTag, enemyTag);

				GameBoard.showGameBoard();

				// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
				if (GameEndCheck.EndCheck(playerTag, enemyTag))
					break;

				PlayRound.go(!starter, addSlot, enemyAddSlot, scanner, playerTag, enemyTag);

				GameBoard.showGameBoard();
			}
			System.out.println("Wanna play again? Press Y for yes and N for no.");
			System.out.print(">");
			String option = scanner.next();
			option = option.toUpperCase();

			if (option.equals("N")) {
				playAgain = false;
				System.out.println("Your game will now end, welcome back! ");
				// Reset score
				Score.resetScore();
			}
			round++;
			//Skriver inte ut rundan om spelet avslutas
			if (!option.equals("N")) {
				System.out.println("\n O------------X\n" + " |    ROUND   |\n" + " |      " + round + "     |\n"
						+ " X------------O");
			}
			if (starter) {
				starter = false;
			} else {
				starter = true;
			}
		}
	}
}
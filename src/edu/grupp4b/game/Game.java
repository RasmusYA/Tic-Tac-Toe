package edu.grupp4b.game;

import java.util.Scanner;

import edu.grupp4b.enemy.*;
import edu.grupp4b.gameboard.GameBoard;

public class Game {

	public static void startGame() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		boolean playAgain = true;

		// Sätter spelarens och motståndarens Tag till X eller O
		char playerTag = GamerTagChoice.ChoosePlayer(scanner);
		char enemyTag = ' ';
		if (playerTag == 'X')
			enemyTag = 'O';
		else {
			enemyTag = 'X';
		}

		// Spel-loop
		while (playAgain) {
			GameBoard.initializeNewGame(); // Återställer spelbräder, alla slots blir tomma
			GameBoard.showGameBoard(); // Visar spelbrädet
			System.out.println("First select a Row and then Column");
			while (true) {
				boolean addSlot = false;
				boolean enemyAddSlot = false;

				// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
				if (GameEndCheck.EndCheck(playerTag, enemyTag))
					break;

				while (!addSlot) {
					try {
						// addSlot retunerar sant eller falskt om där man vill placera sin spelpjäs är
						// upptagen eller inte.
						// Om platsen är tom retunerar den sant.
						String userInput = SelectSlot.selectSlot(scanner);
						addSlot = GameBoard.AddToGameBoard(ConvertInput.convertInputToInt(userInput), playerTag, true);
					}
					// OM användaren matar in något annat än mellan 1-3
					catch (ArrayIndexOutOfBoundsException ex) {
						// scanner.nextLine(); // ------- TEST -------
						System.out.println("Sorry, slot does not exist.");
					}

				}
				GameBoard.showGameBoard();

				// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
				if (GameEndCheck.EndCheck(playerTag, enemyTag))
					break;

				// Repliker från fienden
				EnemyLines.EnemySass();

				// Enemy turn
				while (!enemyAddSlot) {

					// enemyAddSlot = GameBoard.AddToGameBoard(Enemy.enemyTurn(), enemyTag, false);
					enemyAddSlot = GameBoard.AddToGameBoard(EnemySmarter.enemyAI(playerTag, enemyTag), enemyTag, false);

				}
				GameBoard.showGameBoard();
			}
			System.out.println("Wanna play again? Press Y for yes and N for no: ");
			String option = scanner.next();
			option = option.toUpperCase();

			if (option.equals("N")) {
				playAgain = false;
				System.out.println("your game will now end, welcome back! ");

			}
		}
	}
}

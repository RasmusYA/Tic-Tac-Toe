package edu.grupp4b.game;

import java.util.Scanner;

import edu.grupp4b.enemy.EnemyLines;
import edu.grupp4b.enemy.EnemySmarter;
import edu.grupp4b.gameboard.GameBoard;

public class PlayRound {

	public static void go(boolean starter, boolean addSlot, boolean enemyAddSlot, Scanner scanner, char playerTag,
			char enemyTag) throws InterruptedException {

		if (starter) {
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
		} else {
			EnemyLines.EnemySass();
			while (!enemyAddSlot) {
				// Repliker från fienden
				// enemyAddSlot = GameBoard.AddToGameBoard(Enemy.enemyTurn(), enemyTag, false);
				enemyAddSlot = GameBoard.AddToGameBoard(EnemySmarter.enemyAI(playerTag, enemyTag), enemyTag, false);

			}
		}
	}
}
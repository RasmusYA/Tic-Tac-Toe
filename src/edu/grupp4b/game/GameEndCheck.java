package edu.grupp4b.game;
import edu.grupp4b.enemy.EnemyLines;
import edu.grupp4b.gameboard.CheckIfWinner;
import edu.grupp4b.gameboard.GameBoard;
import edu.grupp4b.gamemanager.Score;

public class GameEndCheck {
	
	public static boolean EndCheck(char playerTag, char enemyTag) throws InterruptedException {
		
		// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
		if (CheckIfWinner.checkWinner(playerTag)) {
			Score.playerWin++;
			System.out.println(
					"\n O-------------------------X\n"
					+ " | You defeated the enemy! |\n"
					+ " |     Congratulation!!    |\n"
					+ " X-------------------------O");
			EnemyLines.EnemyLoserLines();
			Score.showScore();
			return true;

		} else if (CheckIfWinner.checkWinner(enemyTag)) {
			Score.enemyWin++;
			System.out.println(
					"\n O-------------------------------X\n"
					+ " |            You lost..         |\n"
					+ " | Long live the evil conqueror! |\n"
					+ " X-------------------------------O");

			EnemyLines.EnemyWinnerLines();
			Score.showScore();
			return true;

		} else if (GameBoard.checkIfSlotsFull()) {
			Score.tie++;
			System.out.println("It's a tie!");
			EnemyLines.EnemyTieLines();
			Score.showScore();
			return true;
		}
		return false;
	}
}

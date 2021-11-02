package edu.grupp4b.game;
import edu.grupp4b.enemy.EnemyLines;
import edu.grupp4b.gameboard.CheckIfWinner;
import edu.grupp4b.gameboard.GameBoard;

public class GameEndCheck {
	static int playerWin = 0; static int enemyWin = 0; static int tie = 0;
	
	public static boolean EndCheck(char playerTag, char enemyTag) throws InterruptedException {
		
		// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
		if (CheckIfWinner.checkWinner(playerTag)) {
			playerWin++;
			System.out.println(
					"\n O-------------------------X\n"
					+ " | You defeated the enemy! |\n"
					+ " |     Congratulation!!    |\n"
					+ " X-------------------------O");
			EnemyLines.EnemyLoserLines();
			Score(playerWin, enemyWin, tie);
			return true;

		} else if (CheckIfWinner.checkWinner(enemyTag)) {
			enemyWin++;
			System.out.println(
					"\n O-------------------------------X\n"
					+ " |            You lost..         |\n"
					+ " | Long live the evil conqueror! |\n"
					+ " X-------------------------------O");

			EnemyLines.EnemyWinnerLines();
			Score(playerWin, enemyWin, tie);
			return true;

		} else if (GameBoard.checkIfSlotsFull()) {
			tie++;
			System.out.println("It's a tie!");
			Score(playerWin, enemyWin, tie);
			return true;
			
		}
		
		return false;
	}
	
	public static void Score(int playerWin, int enemyWin, int tie) {
		System.out.println("       ---> SCORE <---");
		System.out.println(" Player: " + playerWin + " | Enemy: " + enemyWin + " | Tie: " + tie + "\n");
	}
}

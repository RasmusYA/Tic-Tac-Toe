
public class GameEndCheck {

	public static boolean EndCheck(char playerTag, char enemyTag) throws InterruptedException {
		int playerWin = 0; int enemyWin = 0; int tie = 0;
	
		
		// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
		if (GameBoard.checkWinner(playerTag)) {
			playerWin++;
			System.out.println(
					"\n O------------------------X\n"
					+ " | You defeated the evil! |\n"
					+ " |     Congratulation!!   |\n"
					+ " X------------------------O");
			EnemyLines.EnemyLoser();
			Score(playerWin, enemyWin, tie);
			return true;

		} else if (GameBoard.checkWinner(enemyTag)) {
			enemyWin++;
			System.out.println(
					"\n O-------------------------------X\n"
					+ " |            You lost..         |\n"
					+ " | Long live the evil conqueror! |\n"
					+ " X-------------------------------O");
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

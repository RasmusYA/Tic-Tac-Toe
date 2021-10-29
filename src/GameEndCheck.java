
public class GameEndCheck {

	public static boolean EndCheck(char playerTag, char enemyTag) {
		
	
		
		// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
		if (GameBoard.checkWinner(playerTag)) {
			System.out.println(
					"\n O------------------------X\n"
					+ " | You defeated the evil! |\n"
					+ " |     Congratulation!!   |\n"
					+ " X------------------------O");
			return true;

		} else if (GameBoard.checkWinner(enemyTag)) {
			System.out.println(
					"\n O-------------------------------X\n"
					+ " |            You lost..         |\n"
					+ " | Long live the evil conqueror! |\n"
					+ " X-------------------------------O");
			return true;

		} else if (GameBoard.checkIfSlotsFull()) {
			System.out.println("It's a tie!");
			return true;
			
		}
		return false;
	}
}

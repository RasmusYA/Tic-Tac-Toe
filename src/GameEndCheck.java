
public class GameEndCheck {

	public static boolean EndCheck(char playerTag, char enemyTag) {
		
	
		
		// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
		if (GameBoard.checkWinner(playerTag)) {
			System.out.println("You defeated the evil! \nCongrtulation!");
			return true;

		} else if (GameBoard.checkWinner(enemyTag)) {
			System.out.println("\tThe evil has won!");
			return true;

		} else if (GameBoard.checkIfSlotsFull()) {
			return true;
			
		}
		return false;
	}
}

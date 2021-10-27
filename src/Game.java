import java.util.Scanner;

public class Game {

	public static void startGame() {
		Scanner scanner = new Scanner(System.in);
		// Sätter spelarens och motståndarens Tag till X eller O
		char playerTag = GamerTagChoice.ChoosePlayer(scanner);
		char computerTag = ' ';
		if (playerTag == 'X')
			computerTag = 'O';
		else {
			computerTag = 'X';
		}

		boolean slotIsFull = false; // Tillfällig variabel för test
		boolean threeInRow = false; // Tillfällig variabel för test

		GameBoard.initializeNewGame(); // Återställer spelbräder, alla slots blir tomma
		GameBoard.showGameBoard(); // Visar spelbrädet
		System.out.println("First select a Row and then Column");

		// TODO --> Om alla platser är upptagna eller någon har 3 i rad så sätt boolean
		// till false;
		while (!slotIsFull) {
			boolean addSlot = false;
			boolean enemyAddSlot = false;

			// Stops game if all slots in board are full
			if (GameBoard.checkIfSlotsFull())
				break;

			while (!addSlot) {
				try {
					// addSlot retunerar sant eller falskt om där man vill placera sin spelpjäs är
					// upptagen eller inte.
					// Om platsen är tom retunerar den sant.
					String userInput = selectSlot(scanner);
					addSlot = GameBoard.AddToGameBoard(convertInputToInt(userInput), playerTag);
				}
				// OM användaren matar in något annat än mellan 1-3
				catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("Sorry, slot does not exist.");
				}

				// Stops game if all slots in board are full
				if (GameBoard.checkIfSlotsFull())
					break;

				// Enemys turn
				while (!enemyAddSlot) {
					enemyAddSlot = GameBoard.AddToGameBoard(Enemy.enemyTurn(), computerTag);
				}
			}
			GameBoard.showGameBoard();
		}

		
		// Game Over
		System.out.println("Game Over");

		
		// Present winner/looser/ draw or tie

		
	}

	// Spelar får välja rad och kolumn vart de vill lägga sin nästa
	// spelpjäs som retunerar en sträng med rad + column
	public static String selectSlot(Scanner scanner) {
		System.out.print("Select row: ");
		String num1 = scanner.next();
		System.out.print("Select column: ");
		String num2 = scanner.next();
		String userInput = num1 + num2;

		return userInput;
	}

	// Konverterar det som användaren skriver, till exempel row: 1 och column: 3
	// Input blir då 13, denna function konverterar detta till 2.
	public static int convertInputToInt(String userInput) {
		int boardNumber = switch (userInput) {
		case "11" -> 0;
		case "12" -> 1;
		case "13" -> 2;

		case "21" -> 3;
		case "22" -> 4;
		case "23" -> 5;

		case "31" -> 6;
		case "32" -> 7;
		case "33" -> 8;
		default -> 100;
		};
		return boardNumber;
	}
}

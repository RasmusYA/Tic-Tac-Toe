import java.util.Scanner;

public class Game {

	public static void startGame() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		// Sätter spelarens och motståndarens Tag till X eller O
		char playerTag = GamerTagChoice.ChoosePlayer(scanner);
		char enemyTag = ' ';
		if (playerTag == 'X')
			enemyTag = 'O';
		else {
			enemyTag = 'X';
		}

		GameBoard.initializeNewGame(); // Återställer spelbräder, alla slots blir tomma
		GameBoard.showGameBoard(); // Visar spelbrädet
		System.out.println("First select a Row and then Column");

		// Spel-loop
		while (true) {
			boolean addSlot = false;
			boolean enemyAddSlot = false;

			// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
			if (GameBoard.checkIfSlotsFull() || GameBoard.checkWinner(playerTag) || GameBoard.checkWinner(enemyTag))
				break;

			while (!addSlot) {
				try {
					// addSlot retunerar sant eller falskt om där man vill placera sin spelpjäs är
					// upptagen eller inte.
					// Om platsen är tom retunerar den sant.
					String userInput = selectSlot(scanner);
					addSlot = GameBoard.AddToGameBoard(convertInputToInt(userInput), playerTag, true);
				}
				// OM användaren matar in något annat än mellan 1-3
				catch (ArrayIndexOutOfBoundsException ex) {
					// scanner.nextLine(); // ------- TEST -------
					System.out.println("Sorry, slot does not exist.");
				}

			}
			GameBoard.showGameBoard();
			

			// Bryter spelet om alla platser på spelbrädet är fulla eller någon har vunnit
			if (GameBoard.checkWinner(playerTag)) {
				System.out.println("\tYou defeated the evil! \nCongrtulation!");

			} else if (GameBoard.checkWinner(enemyTag)) {
				System.out.println("the evil has won!");

			} else if (GameBoard.checkIfSlotsFull()) {
				break;
			}

			// Repliker från fienden
			EnemyLines.EnemySass();

			// Enemy turn
			while (!enemyAddSlot) {
				enemyAddSlot = GameBoard.AddToGameBoard(Enemy.enemyTurn(), enemyTag, false);
			}

			GameBoard.showGameBoard();
		}

		// TODO Lägg till något snitsigt när spelet är över
		System.out.println("Game Over");

		// TODO Present winner/looser/ draw or tie

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

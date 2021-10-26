import java.util.Scanner;

public class Game {

	public static void startGame() {
		Scanner scanner = new Scanner(System.in);
		
		char gamerTag = GamerTagChoice.ChoosePlayer(scanner);
		char computerTag = ' ';
		if(gamerTag == 'X')
			computerTag = 'O';
		else {
			computerTag = 'X';
		}

		
		boolean slotIsFull = false; // Tillfällig variabel för test
		boolean threeInRow = false; // Tillfällig variabel för test
		
		GameBoard.initializeNewGame(); //Återställer spelbräder, alla slots blir tomma
		GameBoard.showGameBoard(); //Visar spelbrädet
		System.out.println("First select a Row and then Column");
		
		while(!slotIsFull || threeInRow) {
			boolean addSlot = false;	
		while(!addSlot) {
			try {
				String userInput = selectSlot(scanner);
				addSlot = GameBoard.AddToGameBoard(convertInputToInt(userInput), gamerTag);
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Sorry, slot does not exist.");
			}
		}
		System.out.println("Computers turn");
		GameBoard.slot[0] = 'O';
		GameBoard.showGameBoard();
			
	
		}
		
	}
	public static String selectSlot(Scanner scanner) {
		System.out.print("Select row: ");
		String num1 = scanner.next();
		System.out.print("Select column: ");
		String num2 = scanner.next();
		String userInput = num1 + num2;

		return userInput;
	}
	
	//Konverterar det som användaren skriver, till exempel row: 1 och column: 3
	//Input blir då 13, denna function konverterar detta till 2.
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

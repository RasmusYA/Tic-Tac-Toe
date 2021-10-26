
public class Game {

	// public static void game() {
	public static void main(String[] args) {
		GameBoard.initializeNewGame();
		GameBoard.showGameBoard();
		
		char gamerTag = 'X';

		String userInput = "";
		System.out.println("First select a Row and then Column");
		System.out.println("Select row: 2");
		System.out.println("Select column: 3");
		userInput = "" + 2 + 3;
		
		if(GameBoard.slot[convertInputToInt(userInput)-1] != ' ') {
			System.out.println("Sorry, slot is occupied");
		} else {
			System.out.println("Sucess, you added your gamertag " + gamerTag);
		}
		
		
		
		int test1 = convertInputToInt(userInput);
		int test2 = convertInputToInt(userInput) -1;
		GameBoard.slot[convertInputToInt(userInput)-1] = gamerTag;
		System.out.println("Test: " + test1);
		System.out.println("Test: " + test2);
		
		
		if(GameBoard.slot[convertInputToInt(userInput)-1] != ' ') {
			System.out.println("Sorry, slot is occupied");
		} else {
			System.out.println("Sucess, you added your gamertag " + gamerTag);
		}
		
		GameBoard.showGameBoard();
		
	}
	
	public static int convertInputToInt(String userInput){
		int boardNumber = switch (userInput) {
		case "11" -> 1;
		case "12" -> 2;
		case "13" -> 3;
		
		case "21" -> 4;
		case "22" -> 5;
		case "23" -> 6;
		
		case "31" -> 7;
		case "32" -> 8;
		case "33" -> 9;
		default -> 100;
		};
		return boardNumber;
	}
	

	
	
}

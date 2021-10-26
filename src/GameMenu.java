import java.util.*;

public class GameMenu {

	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe!");

		Scanner s = new Scanner(System.in);
		System.out.println(" O-------------------X");
		System.out.println(" |Choose an option:  |");
		System.out.println(" |(1) -- Start game  |\n |(2) -- How to Play |\n |(3) -- Exit\t     |");
		System.out.println(" X-------------------O");

		int val = s.nextInt();

		while (val >1 ) {

			if (val < 1 || val > 3) {

			}

			else if (val == 1) {
				Game.startGame();	
			} else if (val == 2) {
				System.out.println(" # The game is played on a on a 3 by 3 grid of 9 empty squares.");
				System.out.println(
						" # Two players alternate marking empty squares,\n   one player marking Xs and the other player marking Os.");
				System.out.println(
						" # The first player to get 3 of their marks in a row\n   (up, down, across, or diagonally) is the winner.");
				System.out.println(
						" # When all 9 squares are full, the game is over.\n   If no player has 3 marks in a row, the game ends in a tie.");
				
			} else if (val == 3) {
				System.out.println("Program shutdown. Goodbye!");
				System.exit(0);
			}
			break;
		}
	}
}
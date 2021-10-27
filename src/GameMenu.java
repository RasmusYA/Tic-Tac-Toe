import java.util.*;

public class GameMenu {

	public static void main(String[] args) throws InterruptedException {
		String welcome = "Welcome to Tic-Tac-Toe!";
		for (int i = 0; i < welcome.length(); i++) {
		      System.out.print(welcome.charAt(i));
		      Thread.sleep(40);
		
		}
		int i=1;
		Scanner s = new Scanner(System.in);
		do {
		
		String menu = ("\n O-------------------X\n"
		+ " |Choose an Option:  |\n"
		+ " |(1) -- Start Game  |\n"
		+ " |(2) -- How to Play |\n"
		+ " |(3) -- Credits     |\n"
		+ " |(4) -- Exit        |\n"
		+ " X-------------------O");
		System.out.println (menu);
		System.out.print(">");
		String choice = s.nextLine();
		
		switch (choice) {
		case "1":
			Game.startGame();
			break;
		case "2":
			System.out.println("  RULES");
			System.out.println("# The game is played on a on a 3 by 3 grid of 9 empty squares.\n"
			+"# Two players alternate marking empty squares,\n"
			+"  one player marking Xs and the other player marking Os.\n"
			+"# The first player to get 3 of their marks in a row\n"
			+"  (up, down, across, or diagonally) is the winner.\n"
			+"# When all 9 squares are full, the game is over.\n"
			+ "  If no player has 3 marks in a row, the game ends in a tie.");
			System.out.println("\nPress any number key to return to the menu.");
			System.out.print(">");
			Scanner s2 = new Scanner(System.in);
			s2.nextInt();
				 break;
			 
		case "3":
			System.out.println("        TIC-TAC-TOE\n"
					+"Lisa...........Lead Designer\n"
					+"Rasmus.........Lead Designer\n"
					+"Victoria.......Lead Designer\n"
					+"Oskar...............Designer");
			break;
		case "4":
			System.out.println("Program shutdown. Goodbye!");
			System.exit(0);
			break;
		default:
            System.out.println("Please, 1, 2, 3, or 4 only.");	
	} 
			
} while(i==1);
		s.close();	
}	
}

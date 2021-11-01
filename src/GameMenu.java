import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class GameMenu {

	public static void main(String[] args) throws InterruptedException, IOException{
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
		+ " |(3) -- Rules       |\n"
		+ " |(4) -- Credits     |\n"
		+ " |(5) -- Exit        |\n"
		+ " X-------------------O");
		System.out.println (menu);
		System.out.print(">");
		String choice = s.nextLine();
		
		switch (choice) {
		case "1":
			Game.startGame();
			break;
		case "2":
			String howto1 = "The game board consists of a criss-cross of 3 horizontal rows and 3 vertical columns:"; 
			for (int j = 0; j < howto1.length(); j++) {
			      System.out.print(howto1.charAt(j));
			      Thread.sleep(40);
			}
			TimeUnit.SECONDS.sleep(1);
			System.out.println();
			System.out.println("\n"
			+ "         COLUMNS  \n"
			+ "        1   2   3 \n"		
			+ "     1    |   |   \n"	
			+ "  R    ---+---+---\n"
			+ "  O  2    |   |   \n"	
			+ "  W    ---+---+---\n" 
			+ "  S  3    |   |   \n");
			System.out.println();
			TimeUnit.SECONDS.sleep(2);
			
			String howto2 = "You place your mark by entering a number 1-3.  First for which row and then once more for choice of column.\n"
					+ "Example: Player X presses '2' for row and '3' for column, resulting in this game state:";
			for (int k = 0; k < howto2.length(); k++) {
			      System.out.print(howto2.charAt(k));
			      Thread.sleep(40);
			}
			TimeUnit.SECONDS.sleep(1);
			System.out.println();
			System.out.println("\n"
			+ "        COLUMNS  \n"
			+ "       1   2   3 \n"		
			+ "    1    |   |   \n"	
			+ " R    ---+---+---\n"
			+ " O  2    |   | X  \n"	
			+ " W    ---+---+---\n" 
			+ " S  3    |   |   \n");
			System.out.println();
			break;
			
		case "3":
			try {
				var input = new BufferedReader (new FileReader("Rules.txt"));
			
		int radNr = 0;
		while (true) {
			String rad = input.readLine();
			if (rad == null)
				break;
			radNr++;
			System.out.println(radNr + ": " + rad);
			}
		}
		catch(Exception e){
			System.out.print("Reading error: The rulebook file couldn't be located");
		}
			System.out.println("\nPress any number key to return to the menu.");
			System.out.print(">");
			Scanner s2 = new Scanner(System.in);
			s2.nextInt();
				 break;
			 
		case "4":
			String title = "TIC-TAC-TOE";
			for (int j = 0; j < welcome.length(); j++) {
			      System.out.print(title.charAt(j));
			      Thread.sleep(40);
			}
			
			System.out.println("        TIC-TAC-TOE\n"
					+"Lisa...........Lead Designer\n"
					+"Rasmus.........Lead Designer\n"
					+"Victoria.......Lead Designer\n"
					+"Oskar............UX Designer");
			break;
		case "5":
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

import java.io.*;
import java.util.*;

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
			 
		case "3":
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

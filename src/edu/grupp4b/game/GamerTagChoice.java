import java.util.Scanner;

public class GamerTagChoice {
	
	public static char ChoosePlayer(Scanner scanner) {

		System.out.println("Start the game by choosing if you want to play as Xs or Os.");
		System.out.print("Write X or O to choose: ");
		Scanner s = scanner;
		String gamerChoice = s.next();
		gamerChoice = gamerChoice.toUpperCase();

		while (!"X".equals(gamerChoice) && !"O".equals(gamerChoice)) {
			System.out.println("Invalid choice!");
			System.out.print("Write X or O to choose: ");
			gamerChoice = s.next();
			gamerChoice = gamerChoice.toUpperCase();
		}

		if (gamerChoice.equals("X")) {
			System.out.println("You will plays as X.");
			return 'X';
		} else if (gamerChoice.equals("O")) {
			System.out.println("You will plays as O.");
			return 'O';
		}
		return 'X';
		
	}
}
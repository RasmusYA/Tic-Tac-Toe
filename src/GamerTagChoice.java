import java.util.Scanner;

public class GamerTagChoice {
	
	public static void main(String[] args) {

		System.out.println("Start the game by choosing if you want to play as Xs or Os.");
		System.out.print("Write X or O to choose: ");
		Scanner s = new Scanner(System.in);
		String gamerChoice = s.nextLine();
		gamerChoice = gamerChoice.toUpperCase();

		while (!"X".equals(gamerChoice) && !"O".equals(gamerChoice)) {
			System.out.println("Invalid choice!");
			System.out.print("Write X or O to choose: ");
			gamerChoice = s.nextLine();
			gamerChoice = gamerChoice.toUpperCase();
		}

		s.close();

		if (gamerChoice.equals("X")) {
			char gamerTag = 'X';
			char computerTag = 'O';
			System.out.println("You will plays as X.");

		} else if (gamerChoice.equals("O")) {
			char gamerTag = 'O';
			char computerTag = 'X';
			System.out.println("You will plays as O.");
		}
	}
}
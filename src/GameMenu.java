import java.util.*;
public class GameMenu {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe");
		
		Scanner s = new Scanner(System.in);
		System.out.println("O------------------X");
		System.out.println("|[1] -- Start game |\n|[2] -- How to Play|\n|[3] -- Exit	   |");
		System.out.println("X------------------O");
		int val = s.nextInt();

		while (val != 3) {

		    if (val < 1 || val > 3) {

		        
		        val = s.nextInt();
		    }

		    else if(val == 1) {
		        
		    }
		    else if(val == 2) {
		        
		    }
		    else if(val == 3) {
		        
		    }
		    
		}
	}
}
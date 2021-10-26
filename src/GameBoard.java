
public class GameBoard {
	
	static char[] slot = new char[9];
	
	public static void initializeNewGame() {
		
		for (int i = 0; i < slot.length; i++) {
			slot[i] = ' ';
		}
	}
	
	public static void AddToGameBoard(){
		
	}
	

	public static void showGameBoard(){
		
		System.out.println("     1   2   3\n");		
		System.out.println("1    " + slot[0] + " | " + slot[1] + " | " + slot[2]);	
		System.out.println("    ---+---+---");
		System.out.println("2    " + slot[3] + " | " + slot[4] + " | " + slot[5]);	
		System.out.println("    ---+---+---"); 
		System.out.println("3    " + slot[6] + " | " + slot[7] + " | " + slot[8]);
		
	}
	
}
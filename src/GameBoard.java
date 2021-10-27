public class GameBoard {
	
	static char[] slot = new char[9];
	
	//Anropas i början av spelet och sätter nollar/tömmer alla slots/platser
	public static void initializeNewGame() {
		
		for (int i = 0; i < slot.length; i++) {
			slot[i] = ' ';
		}
	}
	
	//Metod för att lägga till sin spelpjäs på spelbrädet, kontrollerar om platsen är tom
	//Om platsen är tom får man lägga sin spelpjäs, annars får man försöka igen.
	//Retunerar sant eller falskt om man får placera sin spelpjäs
	public static boolean AddToGameBoard(int number, char gamerTag){
			if(slot[number] == ' ') {
				System.out.println("Sucess, you added your gamertag " + gamerTag + ".");
				slot[number] = gamerTag;
				return true;
			} else {
				System.out.println("Sorry, slot is occupied. Try again");
				return false;
			}			
	}
	
	//Visar spelbrädet
	public static void showGameBoard(){
		System.out.println("     1   2   3\n");		
		System.out.println("1    " + slot[0] + " | " + slot[1] + " | " + slot[2]);	
		System.out.println("    ---+---+---");
		System.out.println("2    " + slot[3] + " | " + slot[4] + " | " + slot[5]);	
		System.out.println("    ---+---+---"); 
		System.out.println("3    " + slot[6] + " | " + slot[7] + " | " + slot[8]);
		
	}
	
}
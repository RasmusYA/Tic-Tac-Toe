package edu.grupp4b.gameboard;

public class CheckIfWinner {
	
	public static boolean checkWinner(char gameTag) {
		char tag = gameTag;
		//Vinstkontroll. Går igenom potentiellt vinstutslag på GameBoard mellan rundor. 

		// Horisontellt
		if ((GameBoard.slot[0] == tag && GameBoard.slot[1] == tag && GameBoard.slot[2] == tag) || (GameBoard.slot[3] == tag && GameBoard.slot[4] == tag && GameBoard.slot[5] == tag)
				|| (GameBoard.slot[6] == tag && GameBoard.slot[7] == tag && GameBoard.slot[8] == tag) ||
				// Vertikalt
				(GameBoard.slot[0] == tag && GameBoard.slot[3] == tag && GameBoard.slot[6] == tag)
				|| (GameBoard.slot[1] == tag && GameBoard.slot[4] == tag && GameBoard.slot[7] == tag)
				|| (GameBoard.slot[2] == tag && GameBoard.slot[5] == tag && GameBoard.slot[8] == tag) ||
				// Diagonalt
				(GameBoard.slot[0] == tag && GameBoard.slot[4] == tag && GameBoard.slot[8] == tag)
				|| (GameBoard.slot[2] == tag && GameBoard.slot[4] == tag && GameBoard.slot[6] == tag)) {
			return true;
		}
		return false;
	}
}

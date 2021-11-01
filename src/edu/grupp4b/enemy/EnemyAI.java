package edu.grupp4b.enemy;
import edu.grupp4b.gameboard.GameBoard;

public class EnemyAI {

	public static void EnemyWinningMoves(char[] slot, char playerTag,
			char enemyTag) {
		
GameBoard.showGameBoard();
GameBoard.initializeNewGame();

		for (int i = 0; i < slot.length; i++) {
			// enemy winning row 1
			if (slot[0] == enemyTag && slot[1] == enemyTag) {
				slot[2] = enemyTag;
			} else if (slot[0] == enemyTag && slot[2] == enemyTag) {
				slot[1] = enemyTag;
			} else if (slot[1] == enemyTag && slot[2] == enemyTag) {
				slot[0] = enemyTag;
			// enemy winning row 2
			} else if (slot[3] == enemyTag && slot[4] == enemyTag) {
				slot[5] = enemyTag;
			} else if (slot[3] == enemyTag && slot[5] == enemyTag) {
				slot[4] = enemyTag;
			} else if (slot[4] == enemyTag && slot[5] == enemyTag) {
				slot[3] = enemyTag;
			// enemy winning row 3
			} else if (slot[6] == enemyTag && slot[7] == enemyTag) {
				slot[8] = enemyTag;
			} else if (slot[6] == enemyTag && slot[8] == enemyTag) {
				slot[7] = enemyTag;
			} else if (slot[7] == enemyTag && slot[8] == enemyTag) {
				slot[6] = enemyTag;
				
			// enemy winning column 1
			} else if (slot[0] == enemyTag && slot[3] == enemyTag) {
		    	slot[6] = enemyTag;
			} else if (slot[0] == enemyTag && slot[6] == enemyTag) {
		    	slot[3] = enemyTag;
			} else if (slot[3] == enemyTag && slot[6] == enemyTag) {
		    	slot[0] = enemyTag;
		    // enemy winning column 2
			} else if (slot[1] == enemyTag && slot[4] == enemyTag) {
		    	slot[7] = enemyTag;
			} else if (slot[1] == enemyTag && slot[7] == enemyTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == enemyTag && slot[7] == enemyTag) {
		    	slot[1] = enemyTag;
		    // enemy winning column 3
			} else if (slot[2] == enemyTag && slot[5] == enemyTag) {
		    	slot[8] = enemyTag;
			} else if (slot[2] == enemyTag && slot[8] == enemyTag) {
		    	slot[5] = enemyTag;
			} else if (slot[5] == enemyTag && slot[8] == enemyTag) {
		    	slot[2] = enemyTag;
		    	
		    // enemy winning diagonally  1
			} else if (slot[0] == enemyTag && slot[4] == enemyTag) {
		    	slot[8] = enemyTag;
			} else if (slot[0] == enemyTag && slot[8] == enemyTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == enemyTag && slot[8] == enemyTag) {
		    	slot[0] = enemyTag;
		    // enemy winning diagonally  2
			} else if (slot[2] == enemyTag && slot[4] == enemyTag) {
		    	slot[6] = enemyTag;
			} else if (slot[2] == enemyTag && slot[6] == enemyTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == enemyTag && slot[6] == enemyTag) {
		    	slot[2] = slot[enemyTag];

			}else 
				Enemy.enemyTurn();
		}
	}
	
	public static void EnemyBlockingMoves(char[] showGameBoard, char initializeNewGame, char[] slot, char playerTag,
			char enemyTag) {
		for (int i = 0; i < slot.length; i++) {
			// enemy winning row 1
			if (slot[0] == playerTag && slot[1] == playerTag) {
				slot[2] = enemyTag;
			} else if (slot[0] == playerTag && slot[2] == playerTag) {
				slot[1] = enemyTag;
			} else if (slot[1] == playerTag && slot[2] == playerTag) {
				slot[0] = enemyTag;
			// enemy winning row 2
			} else if (slot[3] == playerTag && slot[4] == playerTag) {
				slot[5] = enemyTag;
			} else if (slot[3] == playerTag && slot[5] == playerTag) {
				slot[4] = enemyTag;
			} else if (slot[4] == playerTag && slot[5] == playerTag) {
				slot[3] = enemyTag;
			// enemy winning row 3
			} else if (slot[6] == playerTag && slot[7] == playerTag) {
				slot[8] = enemyTag;
			} else if (slot[6] == playerTag && slot[8] == playerTag) {
				slot[7] = enemyTag;
			} else if (slot[7] == playerTag && slot[8] == playerTag) {
				slot[6] = enemyTag;
				
			// enemy winning column 1
			} else if (slot[0] == playerTag && slot[3] == playerTag) {
		    	slot[6] = enemyTag;
			} else if (slot[0] == playerTag && slot[6] == playerTag) {
		    	slot[3] = enemyTag;
			} else if (slot[3] == playerTag && slot[6] == playerTag) {
		    	slot[0] = enemyTag;
		    // enemy winning column 2
			} else if (slot[1] == playerTag && slot[4] == playerTag) {
		    	slot[7] = enemyTag;
			} else if (slot[1] == playerTag && slot[7] == playerTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == playerTag && slot[7] == playerTag) {
		    	slot[1] = enemyTag;
		    // enemy winning column 3
			} else if (slot[2] == playerTag && slot[5] == playerTag) {
		    	slot[8] = enemyTag;
			} else if (slot[2] == playerTag && slot[8] == playerTag) {
		    	slot[5] = enemyTag;
			} else if (slot[5] == playerTag && slot[8] == playerTag) {
		    	slot[2] = enemyTag;
		    	
		    // enemy winning diagonally  1
			} else if (slot[0] == playerTag && slot[4] == playerTag) {
		    	slot[8] = enemyTag;
			} else if (slot[0] == playerTag && slot[8] == playerTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == playerTag && slot[8] == playerTag) {
		    	slot[0] = enemyTag;
		    // enemy winning diagonally  2
			} else if (slot[2] == playerTag && slot[4] == playerTag) {
		    	slot[6] = enemyTag;
			} else if (slot[2] == playerTag && slot[6] == playerTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == playerTag && slot[6] == playerTag) {
		    	slot[2] = enemyTag;

			}else 
				Enemy.enemyTurn();
		}
	}	
}
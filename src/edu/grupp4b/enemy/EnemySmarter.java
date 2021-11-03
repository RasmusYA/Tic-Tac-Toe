package edu.grupp4b.enemy;

import edu.grupp4b.gameboard.*;

public class EnemySmarter {

	public static int enemyAI(char playerTag, char enemyTag) throws InterruptedException {
		// enemyAI aktiveras om fienden har två i rad och kan vinna eller om spelaren har två i rad och behöver blockas.
		// Annars körs Enemy för slumpplacering
	
	        // enemy winning row 1
		if (GameBoard.slot[0] == enemyTag && GameBoard.slot[1] == enemyTag && GameBoard.slot[2] == ' ') {
			return 2;
		} else if (GameBoard.slot[0] == enemyTag && GameBoard.slot[2] == enemyTag && GameBoard.slot[1] == ' ') {
			return 1;
		} else if (GameBoard.slot[1] == enemyTag && GameBoard.slot[2] == enemyTag && GameBoard.slot[0] == ' ') {
			return 0;
			
			// enemy winning row 2
		} else if (GameBoard.slot[3] == enemyTag && GameBoard.slot[4] == enemyTag && GameBoard.slot[5] == ' ') {
			return 5;
		} else if (GameBoard.slot[3] == enemyTag && GameBoard.slot[5] == enemyTag && GameBoard.slot[4] == ' ') {		
			return 4;
		} else if (GameBoard.slot[4] == enemyTag && GameBoard.slot[5] == enemyTag && GameBoard.slot[3] == ' ') {
			return 3;
			
			// enemy winning row 3
		} else if (GameBoard.slot[6] == enemyTag && GameBoard.slot[7] == enemyTag && GameBoard.slot[8] == ' ') {
			return 8;
		} else if (GameBoard.slot[6] == enemyTag && GameBoard.slot[8] == enemyTag && GameBoard.slot[7] == ' ') {
			return 7;
		} else if (GameBoard.slot[7] == enemyTag && GameBoard.slot[8] == enemyTag && GameBoard.slot[6] == ' ') {
			return 6;
			
			// enemy winning column 1
		} else if (GameBoard.slot[0] == enemyTag && GameBoard.slot[3] == enemyTag && GameBoard.slot[6] == ' ') {
			return 6;
		} else if (GameBoard.slot[0] == enemyTag && GameBoard.slot[6] == enemyTag && GameBoard.slot[3] == ' ') {
			return 3;
		} else if (GameBoard.slot[3] == enemyTag && GameBoard.slot[6] == enemyTag && GameBoard.slot[0] == ' ') {
			return 0;
			
			// enemy winning column 2
		} else if (GameBoard.slot[1] == enemyTag && GameBoard.slot[4] == enemyTag && GameBoard.slot[7] == ' ') {
			return 7;
		} else if (GameBoard.slot[1] == enemyTag && GameBoard.slot[7] == enemyTag && GameBoard.slot[4] == ' ') {
			return 4;
		} else if (GameBoard.slot[4] == enemyTag && GameBoard.slot[7] == enemyTag && GameBoard.slot[1] == ' ') {
			return 1;
			
			// enemy winning column 3
		} else if (GameBoard.slot[2] == enemyTag && GameBoard.slot[5] == enemyTag && GameBoard.slot[8] == ' ') {
			return 8;
		} else if (GameBoard.slot[2] == enemyTag && GameBoard.slot[8] == enemyTag && GameBoard.slot[5] == ' ') {
			return 5;
		} else if (GameBoard.slot[5] == enemyTag && GameBoard.slot[8] == enemyTag && GameBoard.slot[2] == ' ') {
			return 2;
			
			// enemy winning diagonally 1
		} else if (GameBoard.slot[0] == enemyTag && GameBoard.slot[4] == enemyTag && GameBoard.slot[8] == ' ') {	
			return 8;
		} else if (GameBoard.slot[0] == enemyTag && GameBoard.slot[8] == enemyTag && GameBoard.slot[4] == ' ') {
			return 4;
		} else if (GameBoard.slot[4] == enemyTag && GameBoard.slot[8] == enemyTag && GameBoard.slot[0] == ' ') {
			return 0;
			
			// enemy winning diagonally 2
		} else if (GameBoard.slot[2] == enemyTag && GameBoard.slot[4] == enemyTag && GameBoard.slot[6] == ' ') {
			return 6;
		} else if (GameBoard.slot[2] == enemyTag && GameBoard.slot[6] == enemyTag && GameBoard.slot[4] == ' ') {
			return 4;
		} else if (GameBoard.slot[4] == enemyTag && GameBoard.slot[6] == enemyTag && GameBoard.slot[2] == ' ') {
			return 2;
			
			//BLOCK LINES
			// enemy block row 1
		} else if(GameBoard.slot[0] == playerTag && GameBoard.slot[1] == playerTag && GameBoard.slot[2] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 2;
		} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[2] == playerTag && GameBoard.slot[1] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 1;
		} else if (GameBoard.slot[1] == playerTag && GameBoard.slot[2] == playerTag && GameBoard.slot[0] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 0;
			
			// enemy block row 2
		} else if (GameBoard.slot[3] == playerTag && GameBoard.slot[4] == playerTag && GameBoard.slot[5] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 5;
		} else if (GameBoard.slot[3] == playerTag && GameBoard.slot[5] == playerTag && GameBoard.slot[4] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 4;
		} else if (GameBoard.slot[4] == playerTag && GameBoard.slot[5] == playerTag && GameBoard.slot[3] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 3;
			
			// enemy block row 3
		} else if (GameBoard.slot[6] == playerTag && GameBoard.slot[7] == playerTag && GameBoard.slot[8] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 8;
		} else if (GameBoard.slot[6] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[7] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 7;
		} else if (GameBoard.slot[7] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[6] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 6;

			// enemy block column 1
		} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[3] == playerTag && GameBoard.slot[6] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 6;
		} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[6] == playerTag && GameBoard.slot[3] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 3;
		} else if (GameBoard.slot[3] == playerTag && GameBoard.slot[6] == playerTag && GameBoard.slot[0] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 0;
			
			// enemy block column 2
		} else if (GameBoard.slot[1] == playerTag && GameBoard.slot[4] == playerTag && GameBoard.slot[7] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 7;
		} else if (GameBoard.slot[1] == playerTag && GameBoard.slot[7] == playerTag && GameBoard.slot[4] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 4;
		} else if (GameBoard.slot[4] == playerTag && GameBoard.slot[7] == playerTag && GameBoard.slot[1] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 1;
			
			// enemy block column 3
		} else if (GameBoard.slot[2] == playerTag && GameBoard.slot[5] == playerTag && GameBoard.slot[8] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 8;
		} else if (GameBoard.slot[2] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[5] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 5;
		} else if (GameBoard.slot[5] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[2] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 2;

			// enemy block diagonally 1
		} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[4] == playerTag && GameBoard.slot[8] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 8;
		} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[4] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 4;
		} else if (GameBoard.slot[4] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[0] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 0;
			
			// enemy block diagonally 2
		} else if (GameBoard.slot[2] == playerTag && GameBoard.slot[4] == playerTag && GameBoard.slot[6] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 6;
		} else if (GameBoard.slot[2] == playerTag && GameBoard.slot[6] == playerTag && GameBoard.slot[4] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 4;
		} else if (GameBoard.slot[4] == playerTag && GameBoard.slot[6] == playerTag && GameBoard.slot[2] == ' ') {
			EnemyLines.EnemyBlockLines();
			return 2;
		} else {
			return Enemy.enemyTurn();
		}
	}
}

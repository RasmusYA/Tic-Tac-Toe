package edu.grupp4b.enemy;

import edu.grupp4b.gameboard.*;

public class EnemySmarter {

	public static int blockPlayer(char gameTag) {
		char playerTag = gameTag;
		
			if (GameBoard.slot[0] == playerTag && GameBoard.slot[1] == playerTag && GameBoard.slot[2] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 2");
				return 2;
			} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[2] == playerTag && GameBoard.slot[1] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 1");
				return 1;
			} else if (GameBoard.slot[1] == playerTag && GameBoard.slot[2] == playerTag && GameBoard.slot[0] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 0");
				return 0;
			// enemy winning row 2
			} else if (GameBoard.slot[3] == playerTag && GameBoard.slot[4] == playerTag && GameBoard.slot[5] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED!  PICK SLOT 5");
				return 5;
			} else if (GameBoard.slot[3] == playerTag && GameBoard.slot[5] == playerTag && GameBoard.slot[4] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 4");
				return 4;
			} else if (GameBoard.slot[4] == playerTag && GameBoard.slot[5] == playerTag && GameBoard.slot[3] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 3");
				return 3;
			// enemy winning row 3
			} else if (GameBoard.slot[6] == playerTag && GameBoard.slot[7] == playerTag && GameBoard.slot[8] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 8");
				return 8;
			} else if (GameBoard.slot[6] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[7] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 7");
				return 7;
			} else if (GameBoard.slot[7] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[6] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 6");
				return 6;
				
			// enemy winning column 1
			} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[3] == playerTag && GameBoard.slot[6] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 6");
				return 6;
			} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[6] == playerTag && GameBoard.slot[3] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 3");
				return 3;
			} else if (GameBoard.slot[3] == playerTag && GameBoard.slot[6] == playerTag && GameBoard.slot[0] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 0");
				return 0;
		    // enemy winning column 2
			} else if (GameBoard.slot[1] == playerTag && GameBoard.slot[4] == playerTag && GameBoard.slot[7] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 7");
				return 7;
			} else if (GameBoard.slot[1] == playerTag && GameBoard.slot[7] == playerTag && GameBoard.slot[4] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 4");
				return 4;
			} else if (GameBoard.slot[4] == playerTag && GameBoard.slot[7] == playerTag && GameBoard.slot[1] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 1");
				return 1;
		    // enemy winning column 3
			} else if (GameBoard.slot[2] == playerTag && GameBoard.slot[5] == playerTag && GameBoard.slot[8] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 8");
				return 8;
			} else if (GameBoard.slot[2] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[5] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED!  PICK SLOT 5");
				return 5;
			} else if (GameBoard.slot[5] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[2] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 2");
				return 2;
		    	
		    // enemy winning diagonally  1
			} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[4] == playerTag && GameBoard.slot[8] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 8");
				return 8;
			} else if (GameBoard.slot[0] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[4] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 4");
				return 4;
			} else if (GameBoard.slot[4] == playerTag && GameBoard.slot[8] == playerTag && GameBoard.slot[0] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 0");
				return 0;
		    // enemy winning diagonally  2
			} else if (GameBoard.slot[2] == playerTag && GameBoard.slot[4] == playerTag && GameBoard.slot[6] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 6");
				return 6;
			} else if (GameBoard.slot[2] == playerTag && GameBoard.slot[6] == playerTag && GameBoard.slot[4] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 4");
				return 4;
			} else if (GameBoard.slot[4] == playerTag && GameBoard.slot[6] == playerTag && GameBoard.slot[2] == ' ') {
				System.out.println("\nMOOAHAHA, CONSIDER YOURSELF BLOCKED! I PICK SLOT 2");
				return 2;
			} else {
			return Enemy.enemyTurn();
		}
	}
}

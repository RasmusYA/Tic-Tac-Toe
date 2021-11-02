package edu.grupp4b.other;

import java.util.Scanner;

import edu.grupp4b.game.GamerTagChoice;

public class LiveCode {

	public static void main(String[] args) {
		// den som v�ljer X ska f� b�rja spela
		int round = 1;
		char playerTag = ' ';
		char enemyTag = ' ';
		System.out.println("Start the game by choosing if you want to play as Xs or Os.");
		System.out.print("Write X or O to choose: ");
		Scanner s = new Scanner(System.in);
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
			playerTag = 'X';
			System.out.println(" U begin!");
			
			
		} else if (gamerChoice.equals("O")) {
			System.out.println("You will plays as O.");
			playerTag = 'O';
			System.out.println(" X begins!");

		} // X b�rjar p� oj�mna tal och O p� j�mna. %2 = 0 �r de X tur.
			//
		if (playerTag == 'X')
			enemyTag = 'O';
		else {
			enemyTag = 'X';
		}			
		while (true) {
			if (round % 2 == 0) {
				System.out.println(" O, it's your turn!");

			} else {
				System.out.println(" X, it's your turn!");
			}
			round++;
			if (round == 10) {
				break;
			}
		}

	}

}

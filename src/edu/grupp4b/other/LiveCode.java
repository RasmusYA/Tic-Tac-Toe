package edu.grupp4b.other;

import java.util.Scanner;

public class LiveCode {

	public static void main(String[] args) {
		// den som väljer X ska få börja spela
		int round = 1;
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

			System.out.println(" U begin!");

		} else if (gamerChoice.equals("O")) {
			System.out.println("You will plays as O.");

			System.out.println(" X begins!");

		} // X börjar på ojämna tal och O på jämna. %2 = 0 är de X tur.
			//
		while (true) {
			if (round % 2 == 0) {
				System.out.println(" ooo its your turn!");

			} else {
				System.out.println(" X, its your turn!");
			}
			round++;
			if (round == 10) {
				break;
			}
		}

	}

}

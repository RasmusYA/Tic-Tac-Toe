package edu.grupp4b.gamemanager;

public class Score {
	public static int playerWin = 0;
	public static int enemyWin = 0;
	public static int tie = 0;
	
	public static void showScore() {
		System.out.println(
				"\n O-------------------------------X\n"
				+ " |        ---> SCORE <---        |\n"
				+ " | Player: " + playerWin + " | Enemy: " + enemyWin + " | Tie: " + tie + " |\n"
				+ " X-------------------------------O");
	}
	
	//Återställer Score efter avslutad omgång.
	public static void resetScore() {
		playerWin = 0;
		enemyWin = 0;
		tie = 0;
	}
	
}

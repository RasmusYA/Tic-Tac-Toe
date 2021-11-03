package edu.grupp4b.enemy;
import java.util.Random;

public class Enemy {

	public static int enemyTurn() {
        //Enemy random slumpar fram placering av enemyTag om inte klassen EnemySmarter väljer placering
		Random random = new Random();

		int theEnemy = random.nextInt(9);
		return theEnemy;
	}
}
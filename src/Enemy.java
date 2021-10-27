import java.util.Random;

public class Enemy {

	public static int enemyTurn() {

		Random random = new Random();

		int theEnemy = random.nextInt(9);
		return theEnemy;
	}
}
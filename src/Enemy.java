
import java.util.Random;

public class Enemy {

	public static void main(String[] args) {

		Random random = new Random();
		int theEnemy = random.nextInt(10);	
		
		System.out.println("I place mine at: " + theEnemy);
	}

}

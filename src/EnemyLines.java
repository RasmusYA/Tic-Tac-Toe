import java.util.Random;
import java.util.concurrent.TimeUnit;

public class EnemyLines {

	public static void EnemySass() throws InterruptedException {

		Random r = new Random();

		String[] enemyLines = new String[10];
		enemyLines[0] = "- HAHA, you thought you could beat me?!";
		enemyLines[1] = "- You fool! Watch this!";
		enemyLines[2] = "- You underestimate the power of the evil!";
		enemyLines[3] = "- My next move is gonnan blow your mind!";
		enemyLines[4] = "- You got nothing on me!";
		enemyLines[5] = "- MOHAHAHA";
		enemyLines[6] = "- You are no match for me!";
		enemyLines[7] = "- Prepare for trouble... And make it double!";
		enemyLines[8] = "- Surrender now, or prepare to fight!";
		enemyLines[9] = "- Tic tack TAKE DOWN!";

		int randomNumber = r.nextInt(enemyLines.length);
		String enemySass = enemyLines[randomNumber];
		
//		System.out.println("The enemy is plotting their next evil move");
//		TimeUnit.SECONDS.sleep(2);
		
		System.out.println();
		System.out.print("\t");
		

		for (int i = 0; i < enemySass.length(); i++) {
			System.out.print(enemySass.charAt(i));
			Thread.sleep(50);
		}
		System.out.println();
		System.out.println();
		
    }
}
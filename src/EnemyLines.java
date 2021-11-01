import java.util.Random;
import java.util.concurrent.TimeUnit;

public class EnemyLines {

	public static void EnemySass() throws InterruptedException {

		Random r = new Random();

		String[] enemyLines = new String[10];
		enemyLines[0] = "- HAHA, you thought you could beat me?!";
		enemyLines[1] = "- You fool! Watch this!";
		enemyLines[2] = "- You underestimate the power of evil!";
		enemyLines[3] = "- My next move is gonnan blow your mind!";
		enemyLines[4] = "- You got nothing on me!";
		enemyLines[5] = "- MOHAHAHA";
		enemyLines[6] = "- You are no match for me!";
		enemyLines[7] = "- Prepare for trouble... And make it double!";
		enemyLines[8] = "- Surrender now, or prepare to fight!";
		enemyLines[9] = "- Tic tack TAKE DOWN!";

		int randomNumber = r.nextInt(enemyLines.length);
		String enemySass = enemyLines[randomNumber];
		
		System.out.println();
	    System.out.println("The enemy is plotting their next evil move:");
	    TimeUnit.SECONDS.sleep(2);
		
		System.out.println();
		System.out.print("\t");
		

		for (int i = 0; i < enemySass.length(); i++) {
			System.out.print(enemySass.charAt(i));
			Thread.sleep(50);
		}
		System.out.println();
		TimeUnit.SECONDS.sleep(1);
	
    }
	
	public static void EnemyLoser() throws InterruptedException {
		
		Random r = new Random();
		
		String[] enemyLines = new String[10];
		enemyLines[0] = "- NooooOOOOoooOOOOOooo!";
		enemyLines[1] = "- You son of a bitch!!";
		enemyLines[2] = "- Face me aganin and I will CRUSH YOU!";
		enemyLines[3] = "- Beginner's luck!";
		enemyLines[4] = "- You cheated.. I KNOW you cheated!";
		enemyLines[5] = "- The evil vill rise again!";
		enemyLines[6] = "- Fucking hell..";
		enemyLines[7] = "- AAARGH!!! Your success won't be final. Your failure will be!";
		enemyLines[8] = "- I'll be back stronger than ever!";
		enemyLines[9] = "- Rematch NOW, coward!!";

		int randomNumber = r.nextInt(enemyLines.length);
		String enemyLoser = enemyLines[randomNumber];
		
		
		System.out.println();
		System.out.print("\t");
		

		for (int i = 0; i < enemyLoser.length(); i++) {
			System.out.print(enemyLoser.charAt(i));
			Thread.sleep(50);
		}
		System.out.println();
		TimeUnit.SECONDS.sleep(1);
		System.out.println();
	}
	
	
	public static void EnemyWinner() throws InterruptedException {
		Random r = new Random();
		
		String[] enemyLines = new String[3];
		enemyLines[0] = "- BOW DOWN TO ME LOSER!";
		enemyLines[1] = "- Mohaha, child's play!";
		enemyLines[2] = "- Looo-ho-ho-oser!";

		int randomNumber = r.nextInt(enemyLines.length);
		String enemyLoser = enemyLines[randomNumber];
		
		
		System.out.println();
		System.out.print("\t");
		

		for (int i = 0; i < enemyLoser.length(); i++) {
			System.out.print(enemyLoser.charAt(i));
			Thread.sleep(50);
		}
		System.out.println();
		TimeUnit.SECONDS.sleep(1);
		System.out.println();
	}
	
}
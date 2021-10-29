import java.util.Random;

public class EnemyLines {

	public static void main(String[] args) throws InterruptedException {

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
		

		 for (int i = 0; i < enemySass.length(); i++) {
		      System.out.print(enemySass.charAt(i));
		      Thread.sleep(50);

		 }
	}
}
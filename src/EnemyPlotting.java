import java.util.concurrent.TimeUnit;

public class EnemyPlotting {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sucess, you added your gamertag X at 1:1 ");

		System.out.println("\n     1   2   3\n");
		System.out.println("1    " + "X" + " | " + " " + " | " + " ");
		System.out.println("    ---+---+---");
		System.out.println("2    " + " " + " | " + "X" + " | " + " ");
		System.out.println("    ---+---+---");
		System.out.println("3    " + "O" + " | " + " " + " | " + " ");

		TimeUnit.SECONDS.sleep(2);

		System.out.println("\nThe enemy is plotting their next evil move \n");

		TimeUnit.SECONDS.sleep(2);

		
		 String welcome = "\t- HAHA you honestly thought you could beat me?!\n\n";
		 for (int i = 0; i < welcome.length(); i++) {
		      System.out.print(welcome.charAt(i));
		      Thread.sleep(50);

		    }
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("The enemy added their gamertag O at 3:3 \n");

		System.out.println("     1   2   3\n");
		System.out.println("1    " + "X" + " | " + " " + " | " + " ");
		System.out.println("    ---+---+---");
		System.out.println("2    " + " " + " | " + "X" + " | " + " ");
		System.out.println("    ---+---+---");
		System.out.println("3    " + "O" + " | " + " " + " | " + "O");

	}

}
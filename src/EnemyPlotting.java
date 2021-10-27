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

		System.out.println("\nThe enemy is plotting it's next evil move ");

		TimeUnit.SECONDS.sleep(3);

		System.out.println("\nHAHA thought you could beat me?!\n");

		TimeUnit.SECONDS.sleep(2);

		System.out.println("     1   2   3\n");
		System.out.println("1    " + "X" + " | " + " " + " | " + " ");
		System.out.println("    ---+---+---");
		System.out.println("2    " + " " + " | " + "X" + " | " + " ");
		System.out.println("    ---+---+---");
		System.out.println("3    " + "O" + " | " + " " + " | " + "O");

	}

}

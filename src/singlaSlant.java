import java.util.Random;
import java.util.Scanner;

public class singlaSlant {

	public static void main(String[] args) {
		// Singla slant
		System.out.println("Vi singlar slant om vem som börjar!");
		System.out.println("Skriv 0 för att välja krona eller 1 för att välja klave!");
		System.out.print(">");
		Scanner s = new Scanner(System.in);
		int guess = s.nextInt();
		s.close();
		Random r = new Random();
		int slumpen = r.nextInt(2);
		System.out.println("*Slanten singlas*");
		if (slumpen == 0 && guess == 0) {
			System.out.println("Det blev krona! Du börjar!");
		} else if (slumpen == 1 && guess == 1) {
			System.out.println("Det blev klave! Du börjar!");
		} else if (slumpen == 0 && guess == 1) {
			System.out.println("Det blev krona! Jag börjar!");
		} else {
			System.out.println("Det blev klave! Jag börjar!");
		}
	}
}
package edu.grupp4b.gamemenu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import edu.grupp4b.other.MusicPlayer;

public class SoundOption {

	public static void selectSound(Scanner scanner) throws InterruptedException {
		System.out.println("Welcome to Sound Options!\n");
		System.out.println("Please enter Y to have the music on while playing or \n"
				+ "Enter N to have the music off");
		System.out.print("> ");
		
		String gamerChoice = scanner.next();
		gamerChoice = gamerChoice.toUpperCase();
		while (!"Y".equals(gamerChoice) && !"N".equals(gamerChoice)) {
			System.out.println("Invalid choice!\n" + "Please enter Y or N");
		}
		if (gamerChoice.equals("Y")) {
			MusicPlayer.playTheTune("262940.wav");
			System.out.println("The music will be on.");
			System.out.println("Returning to to Game Menu..");
			TimeUnit.SECONDS.sleep(2);
		} else if (gamerChoice.equals("N")) {
			System.out.println("The music will be off.");
			System.out.println("Returning to to Game Menu..");
			TimeUnit.SECONDS.sleep(2);
		}
	}
	
}

package edu.grupp4b.other;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//Source: https://www.youtube.com/watch?v=TErboGLHZGA
//Credit: https://freesound.org/people/orangefreesounds/sounds/262940/
//No restrictions or limits of use, just give credits if you use it, I appreciate.
//If you like it and you want more loops like this, leave a comment or send me a message.

public class MusicPlayer {

	public static void playTheTune(String filePath) {
		
		try {
			File musicPath = new File(filePath);

			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				TimeUnit.SECONDS.sleep(1);
			} else {
				System.out.println("Sorry, the audio file seems to be missing..");
			}
		} catch (Exception ex) {
			System.out.println("Sorry, something went wrong with the audio.");
		}
	}
}
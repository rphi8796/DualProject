package controller;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class IOController 
{
	public void playSound()
	{
		try
		{
			File soundFile = new File("/Users/rphi8796/Documents/Java/DualProject/src/sounds/Come On.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
			Clip comeOn = AudioSystem.getClip();
			comeOn.open(audioIn);
			comeOn.start();
		}
		catch(UnsupportedAudioFileException error)
		{
			error.printStackTrace();
		}
		catch (IOException error)
		{
			error.printStackTrace();
		} 
		catch (LineUnavailableException error)
		{
			error.printStackTrace();
		}
	}
}

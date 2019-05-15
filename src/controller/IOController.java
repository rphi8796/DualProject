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
	/**
	 * tries to get the name of a file in the sounds folder and then puts it in a string to initialize an new file.
	 * Then an audioInputStream is initialized by a call to getAudioInputStream() with the parameter of the file
	 * just previously initialized. Then a Clip is created by calling getClip from audioSystem. The new clip is
	 * then opened with the waveform format and audio input stream is supplied to the clip. Then start() is called 
	 * to make sure the clip plays through even if it was interrupted.
	 * 
	 * 
	 * @param fileName that will be played
	 */
	public static void playSound(String fileName)
	{
		try
		{
			File soundFile = new File("/Users/rphi8796/Documents/Java/DualProject/src/sounds/" + fileName + ".wav");
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

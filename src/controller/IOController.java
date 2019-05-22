package controller;

import model.UserData;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOController 
{
	DualController app;
	
	public IOController(DualController app)
	{
		this.app = app;
	}
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
	
	public static void saveUserData(UserData myUser, String saveFile)
	{
		try
		{
			FileOutputStream saveStream = new FileOutputStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(myUser);
			output.close();
			saveStream.close();
		}
		catch(IOException error)
		{
			error.printStackTrace();
		}
	}
	
	public static ArrayList<UserData> loadUserData(String saveFile)
	{
		try
		{
		ArrayList<UserData> saved = new ArrayList<UserData>();
		FileInputStream inputStream = new FileInputStream(saveFile);
		ObjectInputStream input = new ObjectInputStream(inputStream);
		saved = (ArrayList<UserData>) input.readObject();
		input.close();
		inputStream.close();
		return saved;
		}
	}
}

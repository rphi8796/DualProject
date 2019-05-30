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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
			File soundFile = new File("src/sounds/" + fileName + ".wav");
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
	
	/**
	 * Saves the user data with an array in a .dbn file.
	 * @param userList
	 * @param saveFile
	 */
	public static void saveUserData(ArrayList<UserData> userList, String saveFile)
	{
		try
		{
			FileOutputStream saveStream = new FileOutputStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(userList);
			output.close();
			saveStream.close();
		}
		catch(IOException error)
		{
			error.printStackTrace();
		}
	}
	
	/**
	 * Tries to get all the UserData objects from the .dbn file
	 * but does not ruin the program if there is no file.
	 * @param saveFile
	 * @return an arrayList of user results
	 */
	public static ArrayList<UserData> loadUserData(String saveFile) 
	{
		ArrayList<UserData> saved = new ArrayList<UserData>();
		try 
		{
			FileInputStream inputStream = new FileInputStream(saveFile);
			ObjectInputStream input = new ObjectInputStream(inputStream);
			saved = (ArrayList<UserData>) input.readObject();
			input.close();
			inputStream.close();
		} 
		catch(IOException error) 
		{
			
		}
		catch(ClassNotFoundException error)
		{
			error.printStackTrace();
		}
		return saved;
	}
	
	/**
	 * This goes through all of the UserData objects and calls their toString
	 * and then saves that to a text file.
	 * @param fileName
	 * @param copy
	 */
	public static void saveToString(String fileName, ArrayList<UserData> copy)
	{
		try
		{
			String allText = "";
			
			for(UserData plays : copy)
			{
				allText += System.lineSeparator() + plays.toString();
			}
			
			File saveFile = new File(fileName);
			Scanner textScanner = new Scanner(allText);
			PrintWriter saveText = new PrintWriter(saveFile);
			
			while(textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			
			textScanner.close();
			saveText.close();
		}
		catch(IOException error)
		{
			error.printStackTrace();
		}

	}
}

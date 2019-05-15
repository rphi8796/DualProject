package controller;

import java.util.ArrayList;
import java.util.Arrays;

import view.DualFrame;
import view.GamePanel;

import model.Data;
import model.Reminder;

public class DualController 
{
	public DualFrame appFrame;
	public static GamePanel appPanel;
	private ArrayList<String> nameOfFiles;
	private ArrayList<String> nameOfPositions;
	public static int n; 
	public static int score;
	
	
	/**
	 * constructor for DualController. It sets or initializes 
	 * the appFrame, appPanel, n, and score.
	 * 
	 */
	public DualController()
	{
		appFrame = new DualFrame(this);
		appPanel = (GamePanel) appFrame.getContentPane();
		n = 2; //will later become appPanel.getN()
		score = 0;
	}
	
	/**
	 * This initializes the list of file names and the list of positions that 
	 * can be selected so that it easier to create the random lists. This method then
	 * calls createTheLists(), startGame(), and checkTheLists(). I am also having it
	 * print out the random lists just so I can check the program.
	 */
	public void start()
	{
		nameOfFiles = new ArrayList<String>(
				Arrays.asList("ComeOn",
						"Falcon",
						"FalconKick",
						"Punch",
						"ShowMe",
						"Yes"));
		nameOfPositions = new ArrayList<String>(
				Arrays.asList("oneOne", 
						"oneTwo", 
						"oneThree", 
						"twoOne", 
						"twoTwo", 
						"twoThree", 
						"threeOne",
						"threeTwo",
						"threeThree"
						));
		createTheLists();
		startGame();
		checkTheLists();
		System.out.println(Data.positions);
		System.out.println(Data.sounds);
		
	}
	
	/**
	 * initializes new reminders after five seconds and then schedules the
	 * tasks 3 seconds apart. Then it uses a different constructor of reminder
	 * to call the method to set all the buttons on the screen back to white 
	 * after one has been blue for 2 seconds.
	 */
	public void startGame()
	{
		for(int i = 5; i < 65; i+=3)
		{
			new Reminder(i);
		}
		
		for(int i = 7; i < 65; i+= 3)
		{
			new Reminder("Panel", i);
		}
	}
	
	/**
	 * uses a for loop to add twenty values from the possible values.
	 * it creates a permutation of how things will happen. It stores the values
	 * in variables and then adds them to their corresponding list.
	 */
	public void createTheLists()
	{
		for(int i = 0; i < 20; i++)
		{
			int pos = (int) (Math.random() * 9);
			int sound = (int) (Math.random() * 6);
			
			Data.sounds.add(nameOfFiles.get(sound));
			Data.positions.add(nameOfPositions.get(pos));
		}
	}
	
	/**
	 * initializes another constructor of reminder. After this is called, the
	 * panel will switch to the result screens and the computer will check if
	 * the player clicked the right button at the time of a repetition.
	 */
	public void checkTheLists()
	{
		new Reminder();
	}
	
	public static void gradePlayer(ArrayList<String> soundPermutation, ArrayList<String> positionPermutation, 
							ArrayList<String> userSound, ArrayList<String> userPosition)
	{
		for(int soundIndex = n; soundIndex < 20; soundIndex++)
		{
			int previousIndex = soundIndex - n;
			if(soundPermutation.get(soundIndex).equals(soundPermutation.get(previousIndex)))
			{
				if(userSound.get(soundIndex).equals("click"))
				{
					score++;
				}
			}
			else
			{
				if(!(userSound.get(soundIndex).equals("click")))
				{
					score++;
				}
			}
		}
	}
	
}

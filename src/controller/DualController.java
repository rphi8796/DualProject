package controller;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import view.DualFrame;
import view.BasePanel;

import model.Data;
import model.Reminder;
import model.UserData;

public class DualController 
{
	public DualFrame appFrame;
	public static BasePanel appPanel;
	private ArrayList<String> nameOfFiles;
	private ArrayList<String> nameOfPositions;
	public int n; 
	public int score;
	private int outOf;
	private ArrayList<UserData> save;
	private UserData myRecent;
	private final int TIME_INTERVAL = 3;
	private final int NUM_OF_ELEMENTS = 10;
	private final int DELAY = TIME_INTERVAL - 1;
	private final int GAME_DURATION = TIME_INTERVAL * NUM_OF_ELEMENTS;
	private final int PREPARE_TIME = 4;
	
	
	/**
	 * constructor for DualController. It sets or initializes 
	 * the appFrame, appPanel, n, and score.
	 * 
	 */
	public DualController()
	{
		save = new ArrayList<UserData>();
		if(!(IOController.loadUserData("User.dbn").isEmpty()))
		{
			save = IOController.loadUserData("User.dbn");
			myRecent = (save.get(save.size() - 1));
			n = (int) myRecent.getN(); 
			
			if(myRecent.getPercentage() >= 90)
			{
				n += 1;
			}
			else if(myRecent.getPercentage() <= 75 && myRecent.getN() > 1)
			{
				n -= 1;
			}
		}
		else
		{
			n = 1;
		}

		
		score = 0;
		outOf = (NUM_OF_ELEMENTS - n) * 2;
		appFrame = new DualFrame(this);
		appPanel = (BasePanel) (appFrame.getContentPane());
		
	}
	
	private int calculatePercentage(int score, int outOf)
	{
		double percent = ((double) score) / outOf;
		percent = percent + 0.005;
		int output = (int) (percent * 100);
		return output;
	}
	
	public void savePlay()
	{
		String stringDate = "";
		Calendar date = Calendar.getInstance();
		stringDate += (date.get(Calendar.MONTH) + 1) + "/";
		stringDate += date.get(Calendar.DAY_OF_MONTH) + "/";
		stringDate += date.get(Calendar.YEAR);

		UserData play = new UserData(getPercentage(), n, stringDate);
		save.add(play);
		IOController.saveUserData(save, "User.dbn");
		IOController.saveToString("dbn.txt", save);
	}
	
	public void reset()
	{
		n = (int) myRecent.getN(); 
		
		if(myRecent.getPercentage() >= 90)
		{
			n += 1;
		}
		else if(myRecent.getPercentage() <= 75 && myRecent.getN() > 1)
		{
			n -= 1;
		}
		appPanel.getStartPanel().refreshPanel();
		score = 0;
		outOf = (NUM_OF_ELEMENTS - n) * 2;
		Data.soundIndex = 0;
		Data.positionIndex = 0;
		Data.userSoundClicks.clear();
		Data.userPositionClicks.clear();
		Data.positions.clear();
		Data.positions.clear();
	}
	
	/**
	 * This initializes the list of file names and the list of positions that 
	 * can be selected so that it easier to create the random lists. This method then
	 * calls createTheLists(), startGame(), and checkTheLists(). I am also having it
	 * print out the random lists just so I can check the program.nappast9
	 * 
	 * initializes new reminders after five seconds and then schedules the
	 * tasks 3 seconds apart. Then it uses a different constructor of reminder
	 * to call the method to set all the buttons on the screen back to white 
	 * after one has been blue for 2 seconds.
	 */
	public void startGame()
	{
		nameOfFiles = new ArrayList<String>(
				Arrays.asList("c", "h", "j", "k", "l", "o", "q", "r", "t"));
		nameOfPositions = new ArrayList<String>(
				Arrays.asList("oneOne", 
						"oneTwo", 
						"oneThree", 
						"twoOne",  
						"twoThree", 
						"threeOne",
						"threeTwo",
						"threeThree"
						));
		createTheLists();
		System.out.println(Data.positions);
		System.out.println(Data.sounds);
		
		for(int i = PREPARE_TIME; i < PREPARE_TIME + GAME_DURATION; i+=TIME_INTERVAL)
		{
			new Reminder(i);
		}
		
		for(int i = PREPARE_TIME + DELAY; i < PREPARE_TIME + GAME_DURATION; i+=TIME_INTERVAL)
		{
			new Reminder("Panel", i);
		}
		
		checkTheLists();
	}
	
	/**
	 * uses a for loop to add twenty values from the possible values.
	 * it creates a permutation of how things will happen. It stores the values
	 * in variables and then adds them to their corresponding list.
	 */
	public void createTheLists()
	{
		for(int i = 0; i < 10; i++)
		{
			
//			Data.sounds.add(nameOfFiles.get(i % 3));
//			Data.positions.add(nameOfPositions.get(i % 1));
			
			int pos = (int) (Math.random() * nameOfPositions.size());
			int sound = (int) (Math.random() * nameOfFiles.size());
			
			Data.sounds.add(nameOfFiles.get(sound));
			Data.positions.add(nameOfPositions.get(pos));
		}
	}
	
	/**
	 * initializes another constructor of reminder. After this is called, the
	 * panel will switch to the result screens and the computer will check if
	 * the player clicked the right button at the time of a repetition.
	 */
	public void displayResultsScreen()
	{
		appPanel.changeToResults();
	}
	
	public void gradePlayer(ArrayList<String> soundPermutation, ArrayList<String> positionPermutation, 
							ArrayList<String> userSound, ArrayList<String> userPosition)
	{
		for(int soundIndex = n; soundIndex < soundPermutation.size(); soundIndex++)
		{
			int previousIndex = soundIndex - n;
			if((soundPermutation.get(soundIndex)).equals(soundPermutation.get(previousIndex)))
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
		
		for(int positionIndex = n; positionIndex < positionPermutation.size(); positionIndex++)
		{
			int previousIndex = positionIndex - n;
			if(positionPermutation.get(positionIndex).equals(positionPermutation.get(previousIndex)))
			{
				if(userPosition.get(positionIndex).equals("click"))
				{
					score++;
				}
			}
			else
			{
				if(!(userPosition.get(positionIndex).equals("click")))
				{
					score++;
				}
			}
		}
	}
	
	public void checkTheLists()
	{
		new Reminder(this, GAME_DURATION + PREPARE_TIME + 3);
	}
	
	public int getN()
	{
		return n;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public BasePanel getPanel()
	{
		return appPanel;
	}
	
	public int getOutOf()
	{
		return outOf;
	}
	
	public int getPercentage()
	{
		return calculatePercentage(score, outOf);
	}
	
}

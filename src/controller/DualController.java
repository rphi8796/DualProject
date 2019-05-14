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
	
	public void start()
	{
		appFrame = new DualFrame(this);
		appPanel = (GamePanel) appFrame.getContentPane();
	
		
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
	
	public void checkTheLists()
	{
		new Reminder();
	}
}

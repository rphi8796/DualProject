package controller;

import java.util.ArrayList;
import java.util.Arrays;

import view.DualFrame;
import view.GamePanel;

import model.Data;
import model.Reminder;

public class DualController 
{
	DualFrame appFrame;
	GamePanel appPanel;
	ArrayList<Integer> randomPositions;
	ArrayList<Integer> randomSounds;
	ArrayList<String> nameOfFiles;
	ArrayList<String> nameOfPositions;
	
	public void start()
	{
		appFrame = new DualFrame(this);
		appPanel = new GamePanel(this);
	
		Data.sounds = new ArrayList<String>();
		Data.positions = new ArrayList<String>();
		
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
		System.out.println(Data.positions);
		System.out.println(Data.sounds);
		
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
	
}

package controller;

import view.DualFrame;
import view.GamePanel;

import model.Reminder;

public class DualController 
{
	DualFrame appFrame;
	GamePanel appPanel;
	
	public void start()
	{
		appFrame = new DualFrame(this);
		appPanel = new GamePanel(this);
		
		for (int i = 2; i <= 10; i = i + 2)
		{
			new Reminder(i);
		}
	}
	

	
	
}

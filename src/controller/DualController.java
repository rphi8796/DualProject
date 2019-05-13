package controller;

import view.DualFrame;
import view.GamePanel;

public class DualController 
{
	DualFrame appFrame;
	GamePanel appPanel;
	IOController appError;
	
	public void start()
	{
		appFrame = new DualFrame(this);
		appPanel = new GamePanel(this);
		appError = new IOController();
		appError.playSound();
	}
	

	
	
}

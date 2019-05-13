package controller;

import view.DualFrame;
import view.GamePanel;

public class DualController 
{
	DualFrame appFrame;
	GamePanel appPanel;
	
	public void start()
	{
		appFrame = new DualFrame(this);
		appPanel = new GamePanel(this);
	}
	
	
}

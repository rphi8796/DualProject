package model;

import java.util.Timer;
import java.util.TimerTask;
import controller.DualController;

public class PanelTask extends TimerTask
{
	private Timer timer;
	
	public PanelTask(Timer timer)
	{
		super();
		this.timer = timer;
	}
	
	public void run()
	{
		DualController.appPanel.setButtonsToWhite();
	}
}

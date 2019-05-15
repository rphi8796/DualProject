package model;

import java.util.Timer;
import java.util.TimerTask;
import controller.DualController;

public class PanelTask extends TimerTask
{
	private Timer timer;
	
	/**
	 * Uses TimerTask's constructor. the
	 * member timer is then set to the parameter.
	 * 
	 * @param timer
	 */
	public PanelTask(Timer timer)
	{
		super();
		this.timer = timer;
	}
	
	/**
	 * calls the action that should happen at the scheduled time.
	 * In this case the panel resets before another position changes
	 * color.
	 */
	public void run()
	{
		DualController.appPanel.setButtonsToWhite();
	}
}

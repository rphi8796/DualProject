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
		if(Data.soundClicked)
		{
			Data.userSoundClicks.add("click");
			Data.soundClicked = false;
		}
		else
		{
			Data.userSoundClicks.add("no");
		}
		
		if(Data.positionClicked)
		{
			Data.userPositionClicks.add("click");
			Data.positionClicked = false;
		}
		else
		{
			Data.userPositionClicks.add("no");
		}
	}
}

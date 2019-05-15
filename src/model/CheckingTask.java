package model;

import java.util.Timer;
import java.util.TimerTask;

import controller.DualController;

public class CheckingTask extends TimerTask
{
	private Timer timer;
	
	/**
	 * Uses TimerTask's constructor. the
	 * member timer is then set to the parameter.
	 * 
	 * @param timer
	 */
	public CheckingTask(Timer timer)
	{
		super();
		this.timer = timer;
	}
	
	/**
	 * calls the action that should happen at the scheduled time.
	 * In this case the checking task changes calls for the panel to 
	 * display the results and then it calls the gradeUser method from
	 * the controller so the score can be displayed.
	 */
	public void run()
	{
		System.out.println(Data.userPositionClicks);
		System.out.println(Data.userSoundClicks);
		DualController.gradePlayer(Data.sounds, Data.positions, Data.userSoundClicks, Data.userPositionClicks);
		timer.cancel();
	}
}

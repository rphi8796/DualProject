package model;

import java.util.Timer;
import java.util.TimerTask;

import controller.DualController;

public class CheckingTask extends TimerTask
{
	private Timer timer;
	private DualController app;
	
	/**
	 * Uses TimerTask's constructor. the
	 * member timer is then set to the parameter.
	 * 
	 * @param timer
	 */
	public CheckingTask(Timer timer, DualController app)
	{
		super();
		this.timer = timer;
		this.app = app;
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
		app.gradePlayer(Data.sounds, Data.positions, Data.userSoundClicks, Data.userPositionClicks);
		System.out.println(app.getScore());
		app.getPanel().getReviewPanel().setResultsText();
		app.displayResultsScreen();
		timer.cancel();
	}
}

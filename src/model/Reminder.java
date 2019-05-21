package model;

import java.util.Timer;

import controller.DualController;
import model.GameTask;

public class Reminder 
{
	Timer timer;
	Timer timerOne;
	Timer timerTwo;
	
	/**
	 * uses seconds to determine how long the intervals
	 * should be for the sounds and positions.
	 * 
	 * @param seconds
	 */
	public Reminder(int seconds)
	{
		timer = new Timer();
		timer.schedule(new GameTask(timer), seconds * 1000);
	}
	
	/**
	 * checks the game after it finishes in 65 seconds.
	 */
	public Reminder(DualController app)
	{
		timerOne = new Timer();
		timerOne.schedule(new CheckingTask(timerOne, app), 86 * 1000);
	}
	
	/**
	 * checks to see if it is a panel task with the string and then
	 * the seconds determine the intervals between each time all 
	 * the squares on the panel are set to white.
	 * 
	 * @param panel
	 * @param seconds
	 */
	public Reminder(String panel, int seconds)
	{
		timerTwo = new Timer();
		timerTwo.schedule(new PanelTask(timerTwo), seconds * 1000);
	}
}

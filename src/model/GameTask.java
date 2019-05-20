package model;

import java.util.Timer;
import java.util.TimerTask;
import controller.DualController;
import controller.IOController;

public class GameTask extends TimerTask
{
	private Timer timer;
	
	/**
	 * Uses TimerTask's constructor. The
	 * member, timer, is then set to the parameter.
	 * 
	 * @param timer
	 */
	public GameTask(Timer timer)
	{
		super();
		this.timer = timer;
	}
	
	/**
	 * calls the action that should happen at the scheduled time.
	 * In this case the sounds and positions both progress through their
	 * respective permutations. Then the lists are added to track the 
	 * actions of the player.
	 */
	public void run()
	{
		IOController.playSound(Data.sounds.get(Data.soundIndex));
		Data.soundIndex++;
		DualController.appPanel.getGamePanel().changeColor(Data.positions.get(Data.positionIndex));
		Data.positionIndex++;
		timer.cancel();
		
	}
}

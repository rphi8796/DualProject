package model;

import java.util.Timer;
import java.util.TimerTask;

public class CheckingTask extends TimerTask
{
	private Timer timer;
	
	public CheckingTask(Timer timer)
	{
		super();
		this.timer = timer;
	}
	
	public void run()
	{
		System.out.println(Data.userPositionClicks);
		System.out.println(Data.userSoundClicks);
	}
}

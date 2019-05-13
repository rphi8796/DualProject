package model;

import java.util.Timer;
import java.util.TimerTask;

import controller.IOController;



public class GameTask extends TimerTask
{
	private Timer timer;
	
	public GameTask(Timer timer)
	{
		super();
		this.timer = timer;
	}
	
	public void run()
	{
		IOController.playSound("ComeOn");
	}
}

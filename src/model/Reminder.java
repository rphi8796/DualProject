package model;

import java.util.Timer;
import model.GameTask;

public class Reminder 
{
	Timer timer;
	public Reminder(int seconds)
	{
		timer = new Timer();
		timer.schedule(new GameTask(timer), seconds * 1000);
	}
}

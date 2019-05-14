package model;

import java.util.Timer;
import model.GameTask;

public class Reminder 
{
	Timer timer;
	Timer timerOne;
	Timer timerTwo;
	public Reminder(int seconds)
	{
		timer = new Timer();
		timer.schedule(new GameTask(timer), seconds * 1000);
	}
	
	public Reminder()
	{
		timerOne = new Timer();
		timerOne.schedule(new CheckingTask(timerOne), 25 * 1000);
	}
	
	public Reminder(String panel, int seconds)
	{
		timerTwo = new Timer();
		timerTwo.schedule(new PanelTask(timerTwo), seconds * 1000);
	}
}

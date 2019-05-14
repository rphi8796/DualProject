package model;

import java.util.Timer;
import java.util.TimerTask;
import controller.DualController;
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
		IOController.playSound(Data.sounds.get(Data.soundIndex));
		Data.soundIndex++;
		DualController.appPanel.changeColor(Data.positions.get(Data.positionIndex));
		Data.positionIndex++;
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
		timer.cancel();
		
	}
}

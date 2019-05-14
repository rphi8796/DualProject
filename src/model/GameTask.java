package model;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import view.GamePanel;
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
	}
}

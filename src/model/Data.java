package model;

import java.util.ArrayList;

public class Data 
{
	public static ArrayList<String> sounds;
	public static ArrayList<String> positions;
	public static ArrayList<String> userSoundClicks;
	public static ArrayList<String> userPositionClicks;
	public static boolean soundClicked;
	public static boolean positionClicked;
	
	public Data()
	{
		sounds = new ArrayList<String>();
		positions = new ArrayList<String>();
		userSoundClicks = new ArrayList<String>(); 
		userPositionClicks= new ArrayList<String>(); 
		soundClicked = false;
		positionClicked = false;
	}
}

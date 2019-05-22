package model;

import java.io.Serializable;

public class UserData implements Serializable
{
	private int percentage;
	private int level;
	private int date;
	
	public UserData(int score, int level, int date)
	{
		this.percentage = score;
		this.level = level;
		this.date = date;
	}
	
	public UserData()
	{
		this.percentage = -99;
		this.level = -98;
		this.date = -97;
		
	}
	
	public String toString()
	{
		String output = "You got " + percentage +"% with a "
				+ "level of " + level + " on " + date;
		return output;
	}
	
	public int getPercentage()
	{
		return percentage;
	}
	
	
}

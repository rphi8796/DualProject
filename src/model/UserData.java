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
		this.percentage = 0;
		this.level = 1;
		this.date = 1;
		
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
	
	public int getN()
	{
		return level;
	}
	
	public int getData()
	{
		return date;
	}
	
	
}

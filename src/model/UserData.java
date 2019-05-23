package model;

import java.io.Serializable;

public class UserData implements Serializable
{
	private int percentage;
	private int level;
	private String date;
	
	public UserData(int score, int level, String date)
	{
		this.percentage = score;
		this.level = level;
		this.date = date;
	}
	
	public UserData()
	{
		this.percentage = 0;
		this.level = 1;
		this.date = "01/01/2000";
		
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
	
	public String getData()
	{
		return date;
	}
	
	
}

package model;

import java.io.Serializable;

public class UserData implements Serializable
{
	private int percentage;
	private int level;
	private String date;
	
	/**
	 * Constructs an object that can save the results of a user's game
	 * @param score
	 * @param level
	 * @param date
	 */
	public UserData(int score, int level, String date)
	{
		this.percentage = score;
		this.level = level;
		this.date = date;
	}
	
	/**
	 * default constructor
	 */
	public UserData()
	{
		this.percentage = 0;
		this.level = 1;
		this.date = "01/01/2000";
		
	}
	
	/**
	 * This takes the data members and prints them out with the 
	 * explanationn of what they mean
	 */
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
	
	public String getDate()
	{
		return date;
	}
	
	
}

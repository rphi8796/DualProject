package view;

import controller.DualController;
import model.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GamePanel extends JPanel
{
	private DualController app;
	private SpringLayout appLayout;
	
	private JButton oneOne;
	private JButton oneTwo;
	private JButton oneThree;
	private JButton twoOne;
	private JButton twoTwo;
	private JButton twoThree;
	private JButton threeOne;
	private JButton threeTwo;
	private JButton threeThree;
	private JButton sound;
	private JButton position;
	private JButton back;
	
	public GamePanel(DualController app)
	{
		super();
		
		this.app = app;
		appLayout = new SpringLayout();
		

		oneOne = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, oneOne, 34, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, oneOne, 88, SpringLayout.WEST, this);
		oneTwo = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, oneTwo, 34, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, oneTwo, 32, SpringLayout.EAST, oneOne);
		oneThree = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, oneThree, 34, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, oneThree, 30, SpringLayout.EAST, oneTwo);
		appLayout.putConstraint(SpringLayout.EAST, oneThree, -100, SpringLayout.EAST, this);
		twoOne = new JButton();
		appLayout.putConstraint(SpringLayout.WEST, twoOne, 88, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, oneOne, -16, SpringLayout.NORTH, twoOne);
		appLayout.putConstraint(SpringLayout.EAST, oneOne, 0, SpringLayout.EAST, twoOne);
		appLayout.putConstraint(SpringLayout.NORTH, twoOne, 240, SpringLayout.NORTH, this);
		twoTwo = new JButton();
		appLayout.putConstraint(SpringLayout.WEST, twoTwo, 370, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, oneTwo, -16, SpringLayout.NORTH, twoTwo);
		appLayout.putConstraint(SpringLayout.EAST, oneTwo, 0, SpringLayout.EAST, twoTwo);
		appLayout.putConstraint(SpringLayout.EAST, twoOne, -32, SpringLayout.WEST, twoTwo);
		appLayout.putConstraint(SpringLayout.NORTH, twoTwo, 240, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoTwo, 0, SpringLayout.SOUTH, twoOne);
		twoThree = new JButton();
		appLayout.putConstraint(SpringLayout.SOUTH, twoThree, -350, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, twoTwo, -30, SpringLayout.WEST, twoThree);
		appLayout.putConstraint(SpringLayout.SOUTH, oneThree, -16, SpringLayout.NORTH, twoThree);
		appLayout.putConstraint(SpringLayout.WEST, twoThree, 650, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, twoThree, -100, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, twoThree, 0, SpringLayout.NORTH, twoOne);
		threeOne = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, threeOne, 450, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, threeOne, 88, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, threeOne, -662, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoOne, -20, SpringLayout.NORTH, threeOne);
		threeTwo = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, threeTwo, 0, SpringLayout.NORTH, threeOne);
		appLayout.putConstraint(SpringLayout.WEST, threeTwo, 32, SpringLayout.EAST, threeOne);
		appLayout.putConstraint(SpringLayout.SOUTH, threeTwo, -140, SpringLayout.SOUTH, this);
		threeThree = new JButton();
		appLayout.putConstraint(SpringLayout.EAST, threeTwo, -30, SpringLayout.WEST, threeThree);
		appLayout.putConstraint(SpringLayout.NORTH, threeThree, 0, SpringLayout.NORTH, threeOne);
		appLayout.putConstraint(SpringLayout.WEST, threeThree, 650, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, threeThree, -100, SpringLayout.EAST, this);
		sound = new JButton("Sound");
		appLayout.putConstraint(SpringLayout.SOUTH, threeOne, -25, SpringLayout.NORTH, sound);
		appLayout.putConstraint(SpringLayout.NORTH, sound, 665, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, sound, 88, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, sound, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, sound, 0, SpringLayout.EAST, oneOne);
		position = new JButton("Position");
		appLayout.putConstraint(SpringLayout.SOUTH, threeThree, -25, SpringLayout.NORTH, position);
		appLayout.putConstraint(SpringLayout.NORTH, position, 0, SpringLayout.NORTH, sound);
		appLayout.putConstraint(SpringLayout.WEST, position, 0, SpringLayout.WEST, oneThree);
		appLayout.putConstraint(SpringLayout.SOUTH, position, 0, SpringLayout.SOUTH, sound);
		appLayout.putConstraint(SpringLayout.EAST, position, -100, SpringLayout.EAST, this);
		back = new JButton("Back");
		
		setupButtons();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public void changeColor(String button)
	{
		if(button.equals("oneOne"))
		{
			setButtonsToWhite();
			oneOne.setBackground(Color.cyan);
		}
		else if(button.equals("oneTwo"))
		{
			setButtonsToWhite();
			oneTwo.setBackground(Color.cyan);
		}
		else if(button.equals("oneThree"))
		{
			setButtonsToWhite();
			oneThree.setBackground(Color.cyan);
		}
		else if(button.equals("twoOne"))
		{
			setButtonsToWhite();
			twoOne.setBackground(Color.cyan);
		}
		else if(button.equals("twoTwo"))
		{
			setButtonsToWhite();
			twoTwo.setBackground(Color.cyan);
		}
		else if(button.equals("twoThree"))
		{
			setButtonsToWhite();
			twoThree.setBackground(Color.cyan);
		}
		else if(button.equals("threeOne"))
		{
			setButtonsToWhite();
			threeOne.setBackground(Color.cyan);
		}
		else if(button.equals("threeTwo"))
		{
			setButtonsToWhite();
			threeTwo.setBackground(Color.cyan);
		}
		else
		{
			setButtonsToWhite();
			threeThree.setBackground(Color.cyan);
		}
	}
	public void setButtonsToWhite()
	{
		oneOne.setBackground(Color.white);
		oneTwo.setBackground(Color.white);
		oneThree.setBackground(Color.white);
		twoOne.setBackground(Color.white);
		twoTwo.setBackground(Color.white);
		twoThree.setBackground(Color.white);
		threeOne.setBackground(Color.white);
		threeTwo.setBackground(Color.white);
		threeThree.setBackground(Color.white);
	}
	
	public void setupButtons()
	{
		oneOne.setOpaque(true);
		oneTwo.setOpaque(true);
		oneThree.setOpaque(true);
		twoOne.setOpaque(true);
		twoTwo.setOpaque(true);
		twoThree.setOpaque(true);
		threeOne.setOpaque(true);
		threeTwo.setOpaque(true);
		threeThree.setOpaque(true);
		oneOne.setBorderPainted(false);
		oneTwo.setBorderPainted(false);
		oneThree.setBorderPainted(false);
		twoOne.setBorderPainted(false);
		twoTwo.setBorderPainted(false);
		twoThree.setBorderPainted(false);
		threeOne.setBorderPainted(false);
		threeTwo.setBorderPainted(false);
		threeThree.setBorderPainted(false);
		oneOne.setBackground(Color.white);
		oneTwo.setBackground(Color.white);
		oneThree.setBackground(Color.white);
		twoOne.setBackground(Color.white);
		twoTwo.setBackground(Color.white);
		twoThree.setBackground(Color.white);
		threeOne.setBackground(Color.white);
		threeTwo.setBackground(Color.white);
		threeThree.setBackground(Color.white);
	}
	
	public void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 800));
		this.add(back);
		this.add(oneOne);
		this.add(oneTwo);
		this.add(oneThree);
		this.add(twoOne);
		this.add(twoTwo);
		this.add(twoThree);
		this.add(threeOne);
		this.add(threeTwo);
		this.add(threeThree);
		this.add(sound);
		this.add(position);
		
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		sound.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				Data.soundClicked = true;
			}
		});
		
		position.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				Data.positionClicked = true;
			}
		});
	}
	
}

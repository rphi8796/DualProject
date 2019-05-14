package view;

import controller.DualController;

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
	
	public GamePanel(DualController app)
	{
		super();
		
		this.app = app;
		appLayout = new SpringLayout();
		

		oneOne = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, oneOne, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, oneOne, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, oneOne, -690, SpringLayout.EAST, this);
		oneTwo = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, oneTwo, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, oneTwo, 40, SpringLayout.EAST, oneOne);
		appLayout.putConstraint(SpringLayout.SOUTH, oneTwo, -600, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, oneOne, 0, SpringLayout.SOUTH, oneTwo);
		oneThree = new JButton();
		appLayout.putConstraint(SpringLayout.EAST, oneTwo, -40, SpringLayout.WEST, oneThree);
		appLayout.putConstraint(SpringLayout.SOUTH, oneThree, -600, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, oneThree, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, oneThree, 690, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, oneThree, -10, SpringLayout.EAST, this);
		twoOne = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, twoOne, 210, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, twoOne, 10, SpringLayout.WEST, this);
		twoTwo = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, twoTwo, 210, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoTwo, -400, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoOne, 0, SpringLayout.SOUTH, twoTwo);
		appLayout.putConstraint(SpringLayout.EAST, twoOne, -40, SpringLayout.WEST, twoTwo);
		appLayout.putConstraint(SpringLayout.WEST, twoTwo, 0, SpringLayout.WEST, oneTwo);
		appLayout.putConstraint(SpringLayout.EAST, twoTwo, 0, SpringLayout.EAST, oneTwo);
		twoThree = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, twoThree, 210, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, twoThree, 0, SpringLayout.WEST, oneThree);
		appLayout.putConstraint(SpringLayout.SOUTH, twoThree, -400, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, twoThree, 0, SpringLayout.EAST, oneThree);
		threeOne = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, threeOne, 410, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, threeOne, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, threeOne, -200, SpringLayout.SOUTH, this);
		threeTwo = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, threeTwo, 410, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, threeTwo, -200, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, threeOne, -40, SpringLayout.WEST, threeTwo);
		appLayout.putConstraint(SpringLayout.WEST, threeTwo, 0, SpringLayout.WEST, oneTwo);
		appLayout.putConstraint(SpringLayout.EAST, threeTwo, 300, SpringLayout.WEST, oneTwo);
		threeThree = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, threeThree, 0, SpringLayout.NORTH, threeOne);
		appLayout.putConstraint(SpringLayout.WEST, threeThree, 0, SpringLayout.WEST, oneThree);
		appLayout.putConstraint(SpringLayout.SOUTH, threeThree, 0, SpringLayout.SOUTH, threeOne);
		appLayout.putConstraint(SpringLayout.EAST, threeThree, 0, SpringLayout.EAST, oneThree);
		sound = new JButton("Sound");
		appLayout.putConstraint(SpringLayout.NORTH, sound, 665, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, sound, 150, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, sound, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, sound, 400, SpringLayout.WEST, this);
		position = new JButton("Position");
		appLayout.putConstraint(SpringLayout.NORTH, position, 0, SpringLayout.NORTH, sound);
		appLayout.putConstraint(SpringLayout.WEST, position, 250, SpringLayout.EAST, sound);
		appLayout.putConstraint(SpringLayout.SOUTH, position, 0, SpringLayout.SOUTH, sound);
		appLayout.putConstraint(SpringLayout.EAST, position, -100, SpringLayout.EAST, this);
	
		
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
		
	}
	
}

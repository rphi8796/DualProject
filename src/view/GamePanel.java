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
	private GridLayout buttonLayout;
	
	private JButton oneOne;
	private JButton oneTwo;
	private JButton oneThree;
	private JButton twoOne;
	private JButton twoTwo;
	private JButton twoThree;
	private JButton threeOne;
	private JButton threeTwo;
	private JButton threeThree;
	private JPanel gridPanel;
	private JButton sound;
	private JButton position;
	private Color niceColor;
	private Color backColor;
	
	public GamePanel(DualController app)
	{
		super();
		
		this.app = app;
		appLayout = new SpringLayout();
		buttonLayout = new GridLayout(3, 3);
		
		
		gridPanel = new JPanel(); 
		appLayout.putConstraint(SpringLayout.NORTH, gridPanel, 49, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, gridPanel, 100, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, gridPanel, -136, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, gridPanel, -100, SpringLayout.EAST, this);
				
		niceColor = new Color(0, 191, 255);
		backColor = new Color(215, 192, 255, 50);
		
		oneOne = new JButton();
		oneTwo = new JButton();
		oneThree = new JButton();
		twoOne = new JButton();
		twoTwo = new JButton();
		twoThree = new JButton();
		threeOne = new JButton();
		threeTwo = new JButton();
		threeThree = new JButton();

		sound = new JButton("Sound");
		sound.setFont(new Font("Georgia", Font.PLAIN, 20));
		appLayout.putConstraint(SpringLayout.NORTH, sound, 36, SpringLayout.SOUTH, gridPanel);
		appLayout.putConstraint(SpringLayout.WEST, sound, 200, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, sound, -40, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, sound, 400, SpringLayout.WEST, this);

		position = new JButton("Position");
		position.setFont(new Font("Georgia", Font.PLAIN, 20));
		appLayout.putConstraint(SpringLayout.NORTH, position, 0, SpringLayout.NORTH, sound);
		appLayout.putConstraint(SpringLayout.WEST, position, 200, SpringLayout.EAST, sound);
		appLayout.putConstraint(SpringLayout.SOUTH, position, -40, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, position, -200, SpringLayout.EAST, this);
		
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
			oneOne.setBackground(niceColor);
		}
		else if(button.equals("oneTwo"))
		{
			setButtonsToWhite();
			oneTwo.setBackground(niceColor);
		}
		else if(button.equals("oneThree"))
		{
			setButtonsToWhite();
			oneThree.setBackground(niceColor);
		}
		else if(button.equals("twoOne"))
		{
			setButtonsToWhite();
			twoOne.setBackground(niceColor);
		}
		else if(button.equals("twoTwo"))
		{
			setButtonsToWhite();
			twoTwo.setBackground(niceColor);
		}
		else if(button.equals("twoThree"))
		{
			setButtonsToWhite();
			twoThree.setBackground(niceColor);
		}
		else if(button.equals("threeOne"))
		{
			setButtonsToWhite();
			threeOne.setBackground(niceColor);
		}
		else if(button.equals("threeTwo"))
		{
			setButtonsToWhite();
			threeTwo.setBackground(niceColor);
		}
		else
		{
			setButtonsToWhite();
			threeThree.setBackground(niceColor);
		}
	}
	public void setButtonsToWhite()
	{
		oneOne.setBackground(Color.white);
		oneTwo.setBackground(Color.white);
		oneThree.setBackground(Color.white);
		twoOne.setBackground(Color.white);
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
		twoTwo.setVisible(false);
		twoThree.setBackground(Color.white);
		threeOne.setBackground(Color.white);
		threeTwo.setBackground(Color.white);
		threeThree.setBackground(Color.white);
		
		gridPanel.setLayout(buttonLayout);
		gridPanel.setBackground(new Color(0, 0, 0, 0));
		buttonLayout.setHgap(10);
		buttonLayout.setVgap(10);
		
		gridPanel.add(oneOne);
		gridPanel.add(oneTwo);
		gridPanel.add(oneThree);
		gridPanel.add(twoOne);
		gridPanel.add(twoTwo);
		gridPanel.add(twoThree);
		gridPanel.add(threeOne);
		gridPanel.add(threeTwo);
		gridPanel.add(threeThree);
	}
	
	public void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 800));
		this.setBackground(backColor);
		this.add(gridPanel);
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

package view;

import controller.DualController;
import model.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class ReviewPanel extends JPanel
{
	private DualController app;
	private SpringLayout appLayout;
	private JLabel scoreStatement;
	private JLabel newN;
	private JButton home;
	private JButton restart;
	
	/**
	 * initializes the panel and its components. It calls its helper methods.
	 * @param app
	 */
	public ReviewPanel(DualController app)
	{
		super();
		this.app = app;
		appLayout = new SpringLayout();
		scoreStatement = new JLabel();

		newN = new JLabel("N = " + app.getN());


		newN.setFont(new Font("Georgia", Font.PLAIN, 30));
		home = new JButton("Home");

		restart = new JButton("Restart");

		
		
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Sets the dimension and layout and adds the components.
	 */
	private void setupPanel()
	{
		this.setPreferredSize(new Dimension(1000, 800));
		this.setLayout(appLayout);
		this.add(home);
		this.add(restart);
		this.add(newN);
		this.add(scoreStatement);
	}
	
	/**
	 * This changes the JLabel to display the user results.
	 */
	public void setResultsText()
	{
		scoreStatement.setText("You got " + app.getScore() + " out of " + (app.getOutOf()) + "!"
				+ System.lineSeparator() + "That is " + app.getPercentage() + "%");
	}
	
	/**
	 * auto generated layout code
	 */
	private void setupLayout()
	{
		scoreStatement.setHorizontalAlignment(SwingConstants.CENTER);
		scoreStatement.setFont(new Font("Georgia", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.NORTH, scoreStatement, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, scoreStatement, 90, SpringLayout.NORTH, this);
		
		restart.setFont(new Font("Georgia", Font.PLAIN, 20));
		appLayout.putConstraint(SpringLayout.NORTH, restart, 365, SpringLayout.SOUTH, newN);
		appLayout.putConstraint(SpringLayout.SOUTH, restart, -25, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, home, 0, SpringLayout.NORTH, restart);
		appLayout.putConstraint(SpringLayout.SOUTH, home, 0, SpringLayout.SOUTH, restart);
		appLayout.putConstraint(SpringLayout.WEST, restart, -300, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, restart, -100, SpringLayout.EAST, this);
		
		home.setFont(new Font("Georgia", Font.PLAIN, 20));
		appLayout.putConstraint(SpringLayout.WEST, home, 75, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, home, 275, SpringLayout.WEST, this);
		
		appLayout.putConstraint(SpringLayout.WEST, newN, -990, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, newN, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, newN, 210, SpringLayout.SOUTH, scoreStatement);
		appLayout.putConstraint(SpringLayout.EAST, scoreStatement, 0, SpringLayout.EAST, newN);
		appLayout.putConstraint(SpringLayout.WEST, scoreStatement, 0, SpringLayout.WEST, newN);
		newN.setHorizontalAlignment(SwingConstants.CENTER);
	}
}

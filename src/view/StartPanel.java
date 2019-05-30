package view;

import controller.DualController;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.*;
import javax.swing.SwingConstants;

public class StartPanel extends JPanel
{
	private DualController app;
	private SpringLayout appLayout;
	private JButton start;
	private JButton history;
	private JLabel title;
	private JLabel nLabel;
	
	/**
	 * Initializes the panel and its components.
	 * @param app
	 */
	public StartPanel(DualController app)
	{
		super();
		this.app = app;
		
		appLayout = new SpringLayout();
		start = new JButton("Start");

		history = new JButton("History");

		title = new JLabel("Dual-N Back");

		nLabel = new JLabel("N = ");
		

		
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Sets the layout and dimension and then adds the components to 
	 * the panel.
	 */
	private void setupPanel()
	{	
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 800));
		this.add(start);
		this.add(history);
		this.add(title);
		this.add(nLabel);
	}
	
	/**
	 * Sets up the layout of the panel.
	 */
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, history, 650, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, history, -50, SpringLayout.SOUTH, this);
		history.setFont(new Font("Georgia", Font.PLAIN, 20));
		appLayout.putConstraint(SpringLayout.NORTH, start, 0, SpringLayout.NORTH, history);
		appLayout.putConstraint(SpringLayout.WEST, history, 60, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, history, 260, SpringLayout.WEST, this);
		
		appLayout.putConstraint(SpringLayout.SOUTH, start, -50, SpringLayout.SOUTH, this);
		start.setFont(new Font("Georgia", Font.PLAIN, 20));
		appLayout.putConstraint(SpringLayout.WEST, start, -275, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, start, -75, SpringLayout.EAST, this);
		
		start.setBorderPainted(false);
		history.setBorderPainted(false);
		start.setOpaque(true);
		history.setOpaque(true);
		start.setBackground(Color.white);
		history.setBackground(Color.white);
		
		appLayout.putConstraint(SpringLayout.EAST, title, 1000, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, title, 0, SpringLayout.WEST, this);
		
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Georgia", Font.PLAIN, 50));
		appLayout.putConstraint(SpringLayout.NORTH, title, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, title, 70, SpringLayout.NORTH, this);
		nLabel = new JLabel("N = " + app.getN());
		nLabel.setHorizontalAlignment(SwingConstants.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, nLabel, 130, SpringLayout.SOUTH, title);
		appLayout.putConstraint(SpringLayout.WEST, nLabel, 0, SpringLayout.WEST, title);
		appLayout.putConstraint(SpringLayout.EAST, nLabel, 1000, SpringLayout.WEST, this);
		nLabel.setFont(new Font("Georgia", Font.PLAIN, 30));
	}
	
	
}

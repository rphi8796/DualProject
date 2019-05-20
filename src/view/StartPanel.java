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
	private JComboBox numbers;
	private Integer[] levels;
	
	public StartPanel(DualController app)
	{
		super();
		this.app = app;
		
		levels = new Integer[] {1, 2, 3, 4, 5};
		
		appLayout = new SpringLayout();
		start = new JButton("Start");
		appLayout.putConstraint(SpringLayout.WEST, start, -275, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, start, -26, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, start, -75, SpringLayout.EAST, this);
		history = new JButton("History");
		appLayout.putConstraint(SpringLayout.NORTH, start, 0, SpringLayout.NORTH, history);
		appLayout.putConstraint(SpringLayout.WEST, history, 60, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, history, -26, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, history, 260, SpringLayout.WEST, this);
		title = new JLabel("Dual-N Back");
		appLayout.putConstraint(SpringLayout.NORTH, history, 624, SpringLayout.SOUTH, title);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Georgia", Font.PLAIN, 50));
		appLayout.putConstraint(SpringLayout.NORTH, title, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, title, 250, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, title, 70, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, title, 750, SpringLayout.WEST, this);
		nLabel = new JLabel("N = ");
		appLayout.putConstraint(SpringLayout.NORTH, nLabel, 200, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nLabel, 400, SpringLayout.WEST, this);
		nLabel.setFont(new Font("Georgia", Font.PLAIN, 30));
		numbers = new JComboBox(levels);
		appLayout.putConstraint(SpringLayout.NORTH, numbers, -18, SpringLayout.NORTH, nLabel);
		appLayout.putConstraint(SpringLayout.WEST, numbers, 9, SpringLayout.EAST, nLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, numbers, 57, SpringLayout.NORTH, nLabel);
		appLayout.putConstraint(SpringLayout.EAST, numbers, 89, SpringLayout.EAST, nLabel);
		numbers.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
		setupPanel();
	}
	
	public void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 800));
		this.add(start);
		this.add(history);
		this.add(title);
		this.add(nLabel);
		this.add(numbers);
	}
	
	
}

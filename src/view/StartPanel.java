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

public class StartPanel extends JPanel
{
	private DualController app;
	private SpringLayout appLayout;
	private JButton start;
	private JButton history;
	private JLabel title;
	private JLabel nLabel;
	private JComboBox numbers;
	private String[] levels;
	
	public StartPanel(DualController app)
	{
		super();
		this.app = app;
		
		appLayout = new SpringLayout();
		start = new JButton("Start");
		history = new JButton("History");
		title = new JLabel("Dual-N Back");
		nLabel = new JLabel("N = ");
		numbers = new JComboBox(levels);
	}
	
	
}

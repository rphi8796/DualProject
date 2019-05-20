package view;

import controller.DualController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.*;

public class BasePanel extends JPanel
{
	private DualController app;
	private SpringLayout appLayout;
	private CardLayout baseLayout;
	private JPanel basePanel;
	private GamePanel game;
	private JPanel results;
	private JPanel history;
	
	final static String START = "startScreen";
	final static String GAME = "game";
	final static String RESULT = "results";
	final static String HISTORY = "history";
	
	public BasePanel(DualController app)
	{
		super();
		this.app = app;
		
		basePanel = new JPanel(new CardLayout());
		game = new GamePanel(app);
		
		appLayout = new SpringLayout();
		
		setupSubpanels();
		setupPanel();
		setupListeners();
	}
	
	private void setupSubpanels()
	{
		basePanel.setLayout(baseLayout);
		basePanel.setPreferredSize(new Dimension(1000, 800));
		basePanel.add(game);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 800));
		this.add(basePanel);
	}
	
	private void setupListeners()
	{
		
	}
	
}

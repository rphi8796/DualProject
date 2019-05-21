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
	private CardLayout card;
	
	private JPanel basePanel;
	private GamePanel game;
	private StartPanel start;
	private JButton startButton;
	private JButton historyButton;
	private ReviewPanel results;
	private JPanel history;
	
	final static String START = "startScreen";
	final static String GAME = "game";
	final static String RESULT = "results";
	final static String HISTORY = "history";
	
	public BasePanel(DualController app)
	{
		super();
		this.app = app;
		
		basePanel = new JPanel();
		card = new CardLayout();
		game = new GamePanel(app);
		start = new StartPanel(app);
		results = new ReviewPanel(app);
		
		appLayout = new SpringLayout();
		
		startButton = (JButton)(start.getComponent(0));
		historyButton = (JButton)(start.getComponent(1));
		
		setupSubpanels();
		setupPanel();
		setupListeners();
	}
	
	private void setupSubpanels()
	{
		basePanel.setPreferredSize(new Dimension(1000, 800));
		basePanel.setLayout(card);
		basePanel.add(start, START);
		basePanel.add(game, GAME);
		basePanel.add(results, RESULT);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 800));
		this.add(basePanel);
	}
	
	private void setupListeners()
	{
		startButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				card.show(basePanel, GAME);
				app.startGame();
			}
		});
		
		historyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				card.show(basePanel, RESULT);
				app.startGame();
			}
		});
		
	}
	
	public GamePanel getGamePanel()
	{
		return game;
	}
	
	public StartPanel getStartPanel()
	{
		return start;
	}
	
	public ReviewPanel getReviewPanel()
	{
		return results;
	}
	
	public void changeToResults()
	{
		card.show(basePanel, RESULT);
	}
	
	
}

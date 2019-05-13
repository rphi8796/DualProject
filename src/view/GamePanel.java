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
	
	public GamePanel(DualController app)
	{
		super();
		
		this.app = app;
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 800));
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
	
}

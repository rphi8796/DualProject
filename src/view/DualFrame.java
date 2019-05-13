package view;

import controller.DualController;

import java.awt.Dimension;

import javax.swing.JFrame;


public class DualFrame extends JFrame
{
	private DualController app;
	private GamePanel appPanel;
	
	public DualFrame(DualController app)
	{
		super();
		this.app = app;
		this.appPanel = new GamePanel(app);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Dual Back-n Test");
		this.setSize(new Dimension(1000, 800));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
	}

}

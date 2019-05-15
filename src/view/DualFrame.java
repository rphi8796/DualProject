package view;

import controller.DualController;

import java.awt.Dimension;

import javax.swing.JFrame;


public class DualFrame extends JFrame
{
	private DualController app;
	private GamePanel appPanel;
	
	/**
	 * Inherits the constructor from JFrame. Then the constructor
	 * assigns the member app to the parameter app. appPanel is then
	 * initialized with app as its parameter. Calls to setupFrame().
	 * 
	 * @param app
	 */
	public DualFrame(DualController app)
	{
		super();
		this.app = app;
		this.appPanel = new GamePanel(app);
		
		setupFrame();
	}
	
	/**
	 * sets the panel inside the frame, title, and dimension. sets frame to exit on close,
	 * does not allow the frame to be resized, and sets the frame to be visible.
	 */
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

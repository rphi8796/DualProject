package view;

import controller.DualController;
import model.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class HistoryPanel extends JPanel
{
	 private DualController app;
	 private SpringLayout appLayout;
	 
	 public HistoryPanel(DualController app)
	 {
		 super();
		 this.app = app;
		 
		 setupPanel();
	 }
	 
	 public void setupPanel()
	 {
		 this.setLayout(appLayout);
		 this.setPreferredSize(new Dimension(1000, 900));
	 }
	 
	 
}

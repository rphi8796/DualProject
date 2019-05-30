package view;

import controller.DualController;
import model.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

public class HistoryPanel extends JPanel
{
	 private DualController app;
	 private SpringLayout appLayout;
	 private Object[][] data;
	 private JButton back;
	 private JTable userScores;
	 
	 /**
	  * constructs a new panel with a JTable and a 2D array to display in the table.
	  * It also initializes a panel to return the start screen. It finishes by calling
	  * the helper methods
	  * @param app
	  */
	 public HistoryPanel(DualController app)
	 {
		 super();
		 this.app = app;
		 appLayout = new SpringLayout();
		 
		 data = new Object[11][3];
		 
		 back = new JButton("Home");
		 back.setFont(new Font("Georgia", Font.PLAIN, 20));
		 back.setBorderPainted(false);
		 back.setOpaque(true);
		 back.setBackground(Color.white);

		 
		 setupJTable();
		 setupPanel();
		 setupLayout();
	 }
	 
	 /**
	  * sets up the JTable's text and its layout.
	  */
	 public void setupJTable()
	 {
		 
		 data = app.getUserHistory();
		 
		 userScores = new JTable(data, data[0]);
		 appLayout.putConstraint(SpringLayout.SOUTH, userScores, -285, SpringLayout.SOUTH, this);
		 userScores.setBorder(new LineBorder(new Color(0, 0, 0)));
		 userScores.setFont(new Font("Georgia", Font.PLAIN, 40));
		 userScores.setGridColor(Color.black);
		 userScores.setRowHeight(45);
		 userScores.doLayout();

	 }
	 
	 /**
	  * Sets the layout and dimension and adds the components to
	  * the panel.
	  */
	 private void setupPanel()
	 {
		 this.setLayout(appLayout);
		 this.setPreferredSize(new Dimension(1000, 800));
		 this.add(back);
		 this.add(userScores);
	 }
	 
	 /**
	  * sets the components to their position in the panel
	  */
	 private void setupLayout()
	 {
		 appLayout.putConstraint(SpringLayout.NORTH, userScores, 20, SpringLayout.NORTH, this);
		 appLayout.putConstraint(SpringLayout.WEST, userScores, 50, SpringLayout.WEST, this);
		 appLayout.putConstraint(SpringLayout.EAST, userScores, -50, SpringLayout.EAST, this);
		 appLayout.putConstraint(SpringLayout.NORTH, back, -200, SpringLayout.SOUTH, this);
		 appLayout.putConstraint(SpringLayout.WEST, back, 50, SpringLayout.WEST, this);
		 appLayout.putConstraint(SpringLayout.SOUTH, back, -50, SpringLayout.SOUTH, this);
		 appLayout.putConstraint(SpringLayout.EAST, back, 250, SpringLayout.WEST, this);
	 }
	 
	 
}

package com.thestallworth.gui.ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;

public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	protected ButtonPanel() {

		JButton b1 = new JButton("Create Task");
		JButton b2 = new JButton("Edit Task");
		JButton b3 = new JButton("Delete Task");
		
		this.setBackground(Color.WHITE);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		
	}

}

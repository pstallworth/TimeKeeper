package com.thestallworth.gui.model;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class TaskTable extends JTable {

	private static final long serialVersionUID = 1L;
	
	public TaskTable() {
		
		
		this.setForeground(Color.LIGHT_GRAY);
		this.setModel(new DefaultTableModel(
			new Object[][] {
				{"hello", null, null, null},
				{"world", null, null, null},
				{"i'm", null, null, null},
				{"here", null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		this.setFillsViewportHeight(true);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		this.setBorder(new LineBorder(Color.GRAY));
		
	}	
}



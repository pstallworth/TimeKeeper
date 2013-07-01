package com.thestallworth.gui.ui;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TKMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;

	public TKMenuBar() {
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("First Menu Item");
		JMenuItem menuItem = new JMenuItem("First sub item");
		
		menubar.add(menu);
		menu.add(menuItem);
	}

}

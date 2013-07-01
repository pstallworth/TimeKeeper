package com.thestallworth.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;

import com.thestallworth.gui.ui.GUIFactory;

import com.thestallworth.gui.model.TaskTable;

public class MainTimeKeeper implements ActionListener {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					  for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
					        if ("Nimbus".equals(info.getName())) {
					            UIManager.setLookAndFeel(info.getClassName());
					            break;
					        }
					  }
					MainTimeKeeper window = new MainTimeKeeper();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainTimeKeeper() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GUIFactory factory = GUIFactory.getGUIFactory();
				
		frame.setJMenuBar(factory.getMenuBar());
		
		JPanel contentPane = new JPanel(new GridBagLayout());
		contentPane.setBorder(new LineBorder(Color.CYAN));
		contentPane.setBackground(Color.black);
		frame.setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new LineBorder(Color.GREEN));
		contentPane.setLayout(new GridLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0.7;
		c.weighty = 1;
		
		JPanel secondPanel = new JPanel(new GridBagLayout());

		TaskTable table = factory.getTaskTable();
		
		JScrollPane scrollPane = new JScrollPane(table, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		scrollPane.setViewportBorder(new LineBorder(Color.YELLOW));
		scrollPane.setBorder(new LineBorder(Color.BLUE));
		
		secondPanel.add(scrollPane, c);
		
		c.anchor = GridBagConstraints.SOUTH;
		c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 1;
	    c.weightx = 0.3;
	    c.weighty = 0;
	    
	    secondPanel.add(factory.getButtonPanel(), c);
		tabbedPane.addTab("Task Tab", secondPanel);
		
		contentPane.add(secondPanel);
		
		JPanel newTabPanel = new JPanel();
		newTabPanel.setBackground(Color.DARK_GRAY);
		
		tabbedPane.addTab("Second tab", newTabPanel);
		frame.pack();
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
	}
	
	 protected JComponent makeTextPanel(String text) {
		    JPanel panel = new JPanel(false);
		    JLabel filler = new JLabel(text);
		    filler.setHorizontalAlignment(JLabel.CENTER);
		    panel.setLayout(new GridLayout(2, 2));
		    panel.add(filler);
		    return panel;
	 }
	 
	 protected JButton makeButton() {
		 JButton button = new JButton("Text in my button");
		 return button;
		 
	 }

}

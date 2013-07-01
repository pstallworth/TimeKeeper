package com.thestallworth.gui.ui;

import java.util.HashMap;

import com.thestallworth.gui.model.TaskTable;

public class GUIFactory {


	private static GUIFactory gf;
	
	private HashMap<String, Object> guiObjs = new HashMap<String, Object>();
	
	private GUIFactory() {
	}
	
	public static GUIFactory getGUIFactory() {
		if (gf == null) {
			gf = new GUIFactory();
		}
		
		return gf;
	}
	
	public ButtonPanel getButtonPanel() {
		
		ButtonPanel bp = (ButtonPanel)this.guiObjs.get("buttonPanel");
		
		if (bp == null) {
			bp = new ButtonPanel();
			guiObjs.put("buttonPanel", bp);
		}
		
		return bp;
	}

	public TaskTable getTaskTable() {
		
		TaskTable table = (TaskTable)this.guiObjs.get("taskTable");
		
		if (table == null) {
			table = new TaskTable();
			this.guiObjs.put("taskTable", table);
		}
		
		return table;
	}
	
	public TKMenuBar getMenuBar() {
		
		TKMenuBar mb = (TKMenuBar)this.guiObjs.get("menuBar");
		
		if (mb == null) {
			mb = new TKMenuBar();
			guiObjs.put("menuBar", mb);
		}
		
		return mb;
		
	}
}

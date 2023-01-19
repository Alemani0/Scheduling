package de.hgs.itg23.scheduling.gui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;


public class Model extends AbstractTableModel {

	String[] columnNames = { "Vorname", "Nachname", "Klasse" };

	
	
	@Override
	public int getRowCount() {
	
		return 0;
	}

	@Override
	public int getColumnCount() {
		
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
	
		return null;
	}

	
	
}

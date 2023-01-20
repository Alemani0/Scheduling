package de.hgs.itg23.scheduling.gui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;





public class Model extends AbstractTableModel {

	String[] columnNames = { "Name", "Priorität"};

	ArrayList<Prozess> data = new ArrayList<>(Arrays.asList(new Prozess[] { new Prozess("Alpha", 3),
			new Prozess("Betta", 4) }));
	
	
	
	public int getRowCount() {

		return data.size();

	}
	
	public int getColumnCount() {

		return columnNames.length;
	}

	
	Class[] columns = new Class[] { String.class,

			int.class,  };

	public Class getColumnClass(int c) {
		return columns[c];
	}

	public boolean isCellEditable(int row, int col) {
		return true;

	}
	
	
	public Object getValueAt(int row, int col) {
		if (col == 0) {
			return data.get(row).getName();
		} else {
			if (col == 1) {
				return data.get(row).getPriorität();
			} 
		}
		return col;
	
	}
	
	
	public void setValueAt(Object value, int row, int col) {

		if (col == 0) {
			data.get(row).setName((String) value);
		} else {
			if (col == 1) {
				data.get(row).setPriorität((int) value);
			} 
		}
	}
	
	
	 void appendEmptyRow() {

		 data.add(new Prozess("", 0));
		 
		 int count = getRowCount(); 
		 
		fireTableRowsInserted(0, count+1); 

	
	}
	
public void deleteRow(int rowIndex) {
		

		data.remove(data.size()-1);
		fireTableRowsDeleted(data.size()-1,-1);
		
	}



	
	}
	
	


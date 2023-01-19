package de.hgs.itg23.scheduling.gui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;

import hgs.itg23.Person;


public class Model extends AbstractTableModel {

	String[] columnNames = { "Prozess1", "Prozess2", "Prozess3" };

	ArrayList<Person> data = new ArrayList<>(Arrays.asList(new Person[] { new Person("Peter", "Mustermann", "TG12/1"),
			new Person("Sandra", "Schmidt", "TG12/1"), new Person("Tobias", "Müller", "TG12/3") }));
	
	
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

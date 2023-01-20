package de.hgs.itg23.scheduling.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {

	private Model model; 

	  private View view; 

	  

	  public Controller(Model m, View v) { 

	    model = m; 

	    view = v; 

	    initView(); 

	
	  } 

	  private void initView() { 

		 
		  view.getTable().setModel(this.model); 

		} 
	  
	  public void initController() { 

		  view.btnNewButton_1.addActionListener(l -> {           //append

			  model.appendEmptyRow();
			  
			});
		  
		  view.btnNewButton.addActionListener(l -> {			//delete
				
			  
			 model.deleteRow(view.getTable().getSelectedRow());
			  
			});
		  
	  }
	  
	  
	  private void appendEmptyRow(ActionEvent e) { 

		  this.model.appendEmptyRow(); 

		  int row = view.getTable().getRowCount(); 

		  view.getTable().setRowSelectionInterval(row, row); 

		  view.getTable().editCellAt(row, 0); 

		  }  
	  
	  private void deleteRow(ActionEvent e) { 

		  int row = view.getTable().getSelectedRow(); 

		  this.model.deleteRow(row); 

		} 
	  
	  
}
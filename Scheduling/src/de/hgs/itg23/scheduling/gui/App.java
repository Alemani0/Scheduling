package de.hgs.itg23.scheduling.gui;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	  public static void main(String[] args) throws FileNotFoundException, IOException { 

			 

		    Model m = new Model(); 

		    View v = new View(); 

		    Controller c = new Controller(m, v); 

		    c.initController(); 

		    v.setVisible(true); 

		
		    
		  } 


}

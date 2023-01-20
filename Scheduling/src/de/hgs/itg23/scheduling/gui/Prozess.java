package de.hgs.itg23.scheduling.gui;

public class Prozess {

	private String Name;
	private int Priorität;
	
	
	public Prozess(String Name, int Priorität) {
		super();
		this.Name = Name;
		this.Priorität = Priorität;

	}
	
	
	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	public int getPriorität() {
		return Priorität;
	}


	public void setPriorität(int Priorität) {
		this.Priorität = Priorität;
	}

	
	
	
}

package de.hgs.itg23.scheduling.gui;

public class Prozess {

	private String Name;
	private int Priorit�t;
	
	
	public Prozess(String Name, int Priorit�t) {
		super();
		this.Name = Name;
		this.Priorit�t = Priorit�t;

	}
	
	
	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	public int getPriorit�t() {
		return Priorit�t;
	}


	public void setPriorit�t(int Priorit�t) {
		this.Priorit�t = Priorit�t;
	}

	
	
	
}

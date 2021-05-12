package Entities;

import Abstract.Entity;

public class Sales implements Entity {
	private int id;

	public Sales() {
		
	}

	public Sales(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
}

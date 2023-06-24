package com.bilgeadam_.lesson019_stackOrnekler;

import java.util.Random;

public class Tabak {
	
	private int id;
	private boolean isDirty;
	
	public Tabak(int id, boolean isDirty) {
		super();
		this.id = id;
		this.isDirty = isDirty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isDirty() {
		
		return isDirty;
	}
	public void setDirty(boolean isDirty) {
		Random random = new Random();
		boolean control = random.nextBoolean();
		isDirty=control;
		this.isDirty = isDirty;
	}
	

}

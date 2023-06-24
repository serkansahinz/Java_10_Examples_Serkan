package com.bilgeadam_.lesson019_stackOrnekler;

import java.util.Random;
import java.util.Stack;

public class Manager {
	
	
	
	
	
	
	public static void main(String[] args) {
		Random random = new Random();
		boolean control = random.nextBoolean();
		int id = random.nextInt();
		
		Tabak tabak1 = new Tabak(id, control);
		Tabak tabak2 = new Tabak(id, control);
		Tabak tabak3 = new Tabak(id, control);
		Tabak tabak4 = new Tabak(id, control);
		Tabak tabak5 = new Tabak(id, control);
		Tabak tabak6= new Tabak(id, control);
		Tabak tabak7= new Tabak(id, control);
		Tabak tabak8= new Tabak(id, control);
		Tabak tabak9= new Tabak(id, control);
		Tabak tabak10= new Tabak(id, control);
		
		
		Stack<Tabak> kirliTabak = new Stack<>();
		Stack<Tabak> temizTabak = new Stack<>();
		
		
		System.out.println(control);
		System.out.println(tabak1);
		
	} public static void ayir() {
		Random random = new Random();
		boolean control = random.nextBoolean();
		int id = random.nextInt();
		
		Tabak tabak1 = new Tabak(id, control);
		if(tabak1.isDirty()==true) {
			
		}
	}
	

}

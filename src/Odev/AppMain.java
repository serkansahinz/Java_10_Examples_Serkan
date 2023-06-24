package com.bilgeadam.odev004;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppMain {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
	Takım takım1 = new Takım("FB", "İstanbul", 45000);
	takım1.setTeknikDirektor(new TeknikDirektor("JJ", 10, 10));
	
	takım1.takimOlustur();
	System.out.println(takım1);
		
	
	}
	
	

}

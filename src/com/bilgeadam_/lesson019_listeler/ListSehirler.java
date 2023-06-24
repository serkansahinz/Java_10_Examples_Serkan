package com.bilgeadam_.lesson019_listeler;

import java.util.ArrayList;

public class ListSehirler {

	public static void main(String[] args) {
		ArrayList <String> sehirler = new ArrayList<>();
		
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Bursa");
		sehirler.add("Artvin");
		sehirler.add("Erzurum");
		sehirler.add("Antalya");
		sehirler.add("Canakkale");
		sehirler.add("Karaman");
		
		System.out.println(sehirler);
		
		for (int i=0; i<sehirler.size(); i++) {
			System.out.println(sehirler.get(i));
			
			if(sehirler.get(i).startsWith("An")==true) {
				
				sehirler.set(i, "XXX");
				
			}
		}
		
		System.out.println(sehirler);

	}

}

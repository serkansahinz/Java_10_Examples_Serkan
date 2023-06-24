package com.bilgeadam_.lesson19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class Test {
	Queue <String> kuyruklar = new LinkedList<>();
	public static void main(String[] args) {
		Test test = new Test();
		test.musteriEkle();
		test.pideUretDagit();
	} public void musteriEkle() {
		String[] musteri= {"Caner", "Ahmet", "Serkan", "Salih", "Orhun", "Unal", "Engin", "Abdullah", "Ali", "Yigitcan"};
		for (int i = 0; i < 10; i++) {
			kuyruklar.add(musteri[i]);//add dışında offer kullanabilirdim, eklerken boyutu aşarsak hata vermez			
		}
		System.out.println(kuyruklar);
	} public void pideUretDagit() {
		Random random = new Random();
		int pideSayisi= random.nextInt(1,13);
		System.out.println(pideSayisi);
		int index=pideSayisi;
		for (int i = 1; i <= pideSayisi; i++) {
			
			System.out.println(kuyruklar.poll()+" pide aldi" );
			System.out.println("kalan pide sayisi: " + (--index));
			
		
			if(index==0) {
				System.out.println("Pide kalmadi");
				
				for (String pidesizGariban : kuyruklar) {
					System.out.println("pide alamayan garibanlar: " + pidesizGariban);
				}
//				for (int j = 0; j < kuyruklar.size()+1; j++) {
//					System.out.println("pide alamayan garibanlar: " + kuyruklar.poll());
//					
//				}
			}
			
			
		}
	
	}

}

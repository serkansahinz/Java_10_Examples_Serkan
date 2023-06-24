package com.bilgeadam_.lesson21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SayiUretFalan {
	public static void main(String[] args) {
		Map<Integer, Integer>map = new HashMap<>();
		
		ArrayList<Integer> sanslisayi = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			Random random = new Random();		
			sanslisayi.add(random.nextInt(1,100));			
		}
		for (Integer sayiYaz : sanslisayi) {
			System.out.println(sayiYaz);
			
		}
		
	}

}

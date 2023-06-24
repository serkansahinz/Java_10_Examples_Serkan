package com.bilgeadam_.lesson21;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SansliNumaralar {
	ArrayList<Integer> list;
	Map<Integer, Integer> map;
	Set<Integer> set;
	public SansliNumaralar() {
		list = new ArrayList<>();
		map=new HashMap<>();
		set= new TreeSet<>();
	}
	public void mapOlustur() {
		Random random = new Random();
		
		for (int i = 0; i < 10000; i++) {
			int sayi = random.nextInt(1,101);
			if(!map.containsKey(sayi)) {
				map.put(sayi, 1);
			} else {
				map.replace(sayi, map.get(sayi)+1);
			}
		}
		
	} public void listeOlustur() {
		for (Integer key : map.keySet()) {
			int value=map.get(key);
			for (int i = 0; i < value; i++) {
			list.add(key);
				
			}
		}
	} public void sansliNumaralariBul() {
		Random random = new Random();
		Collections.shuffle(list);
		
		while (set.size()<10) {
			int index = random.nextInt(list.size());
			set.add(list.get(index));
			
		}
		
//		for (int i = 0; i < 10; i++) {
//			int index = random.nextInt(list.size());
//			set.add(list.get(index));
//			
//			
//		}
		
	}

}

package com.bilgeadam_.lesson21.sanslınumaraTekrar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.bilgeadam_.lesson21.SansliNumaralar;

public class SansliNumara {
	
	Map<Integer, Integer> map;
	List<Integer> list;
	Set<Integer> set;
	
	public SansliNumara() {
		map=new HashMap<>();
		list=new ArrayList<>();
		set=new TreeSet<>();
	}
	public void mapOlustur() {
		Random random=new Random();
		for(int i=0; i<10000; i++) {
			int sayi = random.nextInt(1,101);
			if (!map.containsKey(sayi)) {
				map.put(sayi, 1);
			} else {
			 map.replace(sayi, map.get(sayi)+1);
			}
		}
	} public void listeOlustur() {
		for (Integer key : map.keySet()) {
			int value=map.get(key);
			for(int i = 0; i<value;i++) {
				list.add(key);
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		SansliNumara sans=new SansliNumara();
		
		Map<Integer, Integer> sayilarMap= new HashMap<>();
		for (int i = 0; i < 10_000; i++) {
			
			sayilarMap.put(sans.sayiUret(), i);
			
		}
		
	} public int sayiUret() {
		Random random=new Random();
		int sayi=random.nextInt();
		return sayi;
		
	} public void sansliNumaraliBul() {
		Collections.shuffle(list);
		Random random=new Random();
		
		while (set.size()<10) {
			int index=random.nextInt(list.size());
			set.add(list.get(index));
			
		}
		for (int i = 0; i < 10; i++) {
			int index=random.nextInt(list.size());
			set.add(list.get(index));
			
		}
		
	}

}

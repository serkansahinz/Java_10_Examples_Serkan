package com.bilgeadam_.lesson21.sanslınumaraTekrar;

import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		SansliNumara sansliNumara=new SansliNumara();
		sansliNumara.mapOlustur();
		sansliNumara.map.forEach((k,v)-> System.out.println(k + " den "+ v + " tane"));
		for (Entry<Integer, Integer> deger : sansliNumara.map.entrySet()) {
			System.out.println(deger.getKey()+"="+deger.getValue());
		}
		int toplam=0;
		for (Integer key : sansliNumara.map.keySet()) {
			System.out.println(key+"==>"+sansliNumara.map.get(key));
			toplam+=sansliNumara.map.get(key);
		}
		System.out.println(toplam);
		for (Entry<Integer, Integer> deger2: sansliNumara.map.entrySet()) {
			sansliNumara.list.add(deger2.getKey());
			
		}
		sansliNumara.listeOlustur();
		sansliNumara.list.stream().forEach(System.out::println);
//		for (Integer sayi : sansliNumara.list) {
//			System.out.println(sayi);
//			
//		}
		
		
	}
}

package com.bilgeadam_.lesson21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		SansliNumaralar sansliNumaralar=new SansliNumaralar();
		ArrayList<Integer> sansliArrayList = new ArrayList<>();
		
		sansliNumaralar.mapOlustur();
		sansliNumaralar.listeOlustur();
		sansliNumaralar.sansliNumaralariBul();
		int toplam=0;
	
		for (int i = 1; i <= 100; i++) {
			System.out.println(i+ " den " +sansliNumaralar.map.get(i)+" adet");
			toplam+=sansliNumaralar.map.get(i);
			
			
		}
		System.out.println(toplam);
		
		for (int i = 1; i <=100; i++) {
			for (int j = 1; j <= sansliNumaralar.map.get(i); j++) {
				sansliArrayList.add(j);
			}
		}
		for (Integer integer : sansliArrayList) {
			System.out.println(integer);
			
		}
		System.out.println();
		System.out.println("liste uzunlugu="+ sansliNumaralar.list.size());
		for (Integer sayi : sansliNumaralar.list) {
			System.out.println(sayi);
			
		}
		System.out.println("set uzunlugu " + sansliNumaralar.set.size());
		for (Integer sayi : sansliNumaralar.set) {
			System.out.println(sayi);
			
		}
		
		Set<Integer> numaralar = sansliNumaralar.set;
		List<String> abc = numaralar.stream().map(x -> "-"+ x+"-").collect(Collectors.toList());
		abc.forEach(System.out::println);
		System.out.println("--------------------");
	
		numaralar.stream().filter(x-> x<70).forEach(System.out::println);
		List<Integer> liste4=numaralar.stream().filter(x -> x<70).map(x -> x*2).collect(Collectors.toList());
		System.out.println("--------------------");
		liste4.forEach(System.out::println);
		
		
	}

}

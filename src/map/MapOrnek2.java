package map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapOrnek2 {

	public static void main(String[] args) {
		
		String[] ogrenci = {"Mustafa", "Ece", "Elif"};
		int [] notlar= {60,80,75};
		int[][] notlar2 = {{50,50,50}, {80,90,80}, {70,50,86}};
		
		Map<String, Integer> map1= new HashMap<>();
		Map<String, int[]> map2=new HashMap<>();
		
		for (int i = 0; i < ogrenci.length; i++) {
			map2.put(ogrenci[i], notlar2[i]);
			
		}
		for(Entry<String,int[]> deger : map2.entrySet()) {
			System.out.println(deger.getKey()+ " notlari ===>");
			int toplam=0;
			for (int not : deger.getValue()) {
				System.out.println(not);
				toplam+=not;
			}
			System.out.println("ortalama="+(toplam/deger.getValue().length));
			System.out.println("======================");
		}
				
			
		
//		for (int i = 0; i < ogrenci.length; i++) {
//			map1.put(ogrenci[i], notlar[i]);
//			
//			
//		}
//		for (String isim : map1.keySet()) {
//			System.out.println(isim + "===>" + map1.get(isim));
//		}
//		System.out.println("-----------");
//		System.out.println("Entry Set Yazim");
//		for(Entry<String,Integer> deger : map1.entrySet()) {
//			System.out.println(deger);
//			System.out.println(deger.getKey()+ "===>" + deger.getValue());
//		}
//		System.out.println("keyset Yazim");
//		for (String string : map1.keySet()) {
//			System.out.println(string + "-" + map1.get(string));
//		}
//		
	}

}

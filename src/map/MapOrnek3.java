package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapOrnek3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime girin");
		String kelime= scanner.nextLine();
		
		Map<Character, Integer> harfSayMap= new TreeMap<>();
		
		for (int i = 0; i < kelime.length(); i++) {
			char harf = kelime.charAt(i);
			if(!harfSayMap.containsKey(kelime.charAt(i))) {
			harfSayMap.put(kelime.charAt(i), 1);
			} else {
				harfSayMap.put(kelime.charAt(i), harfSayMap.get(harf)+1);
			
			}
		}
		harfSayMap.forEach((k,v)-> System.out.println(k+"=="+v));
		for(Entry<Character,Integer> deger : harfSayMap.entrySet()) {
			System.out.println(deger.getKey()+ " harfi ===>" + deger.getValue() );
		
		}
		
	}
	

}



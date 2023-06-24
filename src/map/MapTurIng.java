package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapTurIng {

	public static void main(String[] args) {
		char[] turkishWords= {'İ', 'ı', 'ş','Ş','ç','Ç','ğ','Ğ','ü','Ü','ö','Ö'};
		char[] englishWords= {'I', 'i', 's','S','c','C','g','G','u','U','o','O'};
		
		Map<Character, Character> map = new HashMap<>(); 
		
		
		
		for (int i = 0; i < englishWords.length; i++) {
			map.put(turkishWords[i], englishWords[i]);
		}
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lutfen kelime giriniz");
		String kelime = scanner.nextLine();
//		for (Entry<Character, Character> deger : map.entrySet()) {
//			System.out.println(deger.getKey()+" == "+deger.getValue());
//		}
		map.forEach((k,v)-> System.out.println(k+"=="+v));
//		System.out.println(map);
		for (char c : englishWords) {
			
		}
		for (int j = 0; j < kelime.length(); j++) {
			char harf=kelime.charAt(j);
			if(map.keySet().contains(kelime.charAt(j))) {
				
			kelime=kelime.replace(kelime.charAt(j), map.get(harf));
					
			}
			
			//farklı çözüm, Caner
			for (char c : map.keySet()) {
				if(kelime.contains(String.valueOf(c))) {
					kelime=kelime.replace(c, map.get(c));
				}
				
			}
			
		}
		System.out.println(kelime);
	}

}

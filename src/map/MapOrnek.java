package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapOrnek {
	public static void main(String[] args) {
		
		Map <String, String> map = new HashMap<>(); 
		Map <String, String> map2 = new LinkedHashMap<>(); 
		Map <String, String> map3 = new TreeMap<>(); 
		map.put("06", "Ankara");
		map.put("05", "Amasya");
		map.put("06", "xxxankara");
		map.put("08", "Artvin");
		
		System.out.println(map.get("06"));
		map.replace("05", "AMASYA");
		System.out.println(map.get("05"));
		System.out.println(map.containsKey("10"));
		System.out.println(map.containsKey("05"));
		System.out.println(map.containsValue("Artvin"));
		System.out.println(map.containsValue("Bolu"));
		
		for(Entry<String, String> value: map.entrySet()) {
			System.out.println(value.getKey()+"-"+value.getValue());
			
		} 
		for (Entry<String, String> string : map.entrySet()) {
			
		}
		System.out.println("Keyset");
		for (String string : map.keySet()) {
			System.out.println(string+"-"+map.get(string));
			
		}
		Collection<String>iller= map.values();
		System.out.println("Values ile yazdırma");
		for (String string : iller) {
			System.out.println(string);
			
		}
		map.forEach((k,v)->System.out.println(k+"===>"+v));
		map.forEach((x,y)->System.out.println(x+"===>"+y));
		List<String> list= new ArrayList<>(List.of("Java", "React", "Spring"));
		
		list.forEach(System.out::println);
		list.forEach((x)-> System.out.println("-"+x+"-"));
		
	}

}

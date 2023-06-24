package Soru4Sinav;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test {
	List<Urun> urunList= new ArrayList<>();
			
	public static void main(String[] args) {
		Test test = new Test();
		test.urunOlustur();
		Map<String, Integer> urunMap= new HashMap<>();
		urunMap=test.urunList.stream().filter(x-> x.getFiyat() > 15).collect(Collectors.toMap(x->x.getAdi(), x->x.getFiyat()));
		for (Entry<String, Integer> urunMapinEntry : urunMap.entrySet()) {
			System.out.println(urunMapinEntry);
			
		}

	}
	public void urunOlustur() {
		
		urunList.add(new Urun(15, "Bebek Bezi"));
		urunList.add(new Urun(20, "Et"));
		urunList.add(new Urun(25, "Sut"));
		urunList.add(new Urun(30, "Yumurta"));
		urunList.add(new Urun(3, "Yag"));
		urunList.add(new Urun(800_000, "Araba"));
		urunList.add(new Urun(1, "Firca"));
		urunList.add(new Urun(7, "Eldiven"));
		urunList.add(new Urun(8, "Atki"));
		
	}

}

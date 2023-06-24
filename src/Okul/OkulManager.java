package Okul;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;


public class OkulManager {
	
	public <T> void kayıtEt(List<T> list, T object) {
		list.add(object);
		
	}	

	public static <T> void kayitSil(List<T> list, T object) {
		
			if (!list.isEmpty()) {
				if (list.contains(object)) {
					System.out.println(object + " kaydı silindi");
					list.remove(object);
					
				}
			} else {
				System.out.println("Böyle biri yok");
			}
	}

	public static <T> void verileriGetir(T t) {
		System.out.println(t);
	}

	

	public static void maasHesapla(LocalDate baslangic, int maas) {
		LocalDate hesaplamaTarihi = LocalDate.now();
		int yilFarki = Period.between(baslangic, hesaplamaTarihi).getYears();

		for (int i = 0; i < yilFarki; i++) {
			maas += maas * 0.25;

		}
		System.out.println("Calisma yili => " + yilFarki + " Guncel Maas=> " + maas);

	}
	
}

package sehir;

import java.util.ArrayList;
import java.util.Arrays;

public class Uygulama {
//	ArrayList<Sehir> sehirler=new ArrayList<>(); // constructor'a alternatif olarak boyle de yapılabilir
	ArrayList<Sehir> sehirler;
	
    public Uygulama() {
		this.sehirler = new ArrayList<>();
	}

//	= new ArrayList<>(Arrays.asList(iller));
	public void sehirOlustur() {
		
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			String isim = SehirDatabase.iller[i];
			Sehir sehir = new Sehir(isim);
			sehirler.add(sehir);
		}
		
	} public void sehirleriGetir() {
		
		System.out.println(sehirler);
	}
	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.sehirOlustur();
		System.out.println(uygulama.sehirler);
	}

}

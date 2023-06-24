package Okul;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci<T> extends Person{
	            
	List<EDersler> ogrenciDersler;
	List<Double> ogrenciNotlar;
	boolean raporuVarMı;
	
	public Ogrenci(String id, String isim) {
		super(id, isim);
		this.ogrenciDersler= new ArrayList<>();	
		this.ogrenciNotlar= new ArrayList<>();	
	}
	
	
	public List<EDersler> getOgrenciDersler() {
		return ogrenciDersler;
	}
	public void setOgrenciDersler(List<EDersler> ogrenciDersler) {
		this.ogrenciDersler = ogrenciDersler;
	}
	public boolean isRaporuVarMı() {
		return raporuVarMı;
	}
	public void setRaporuVarMı(boolean raporuVarMı) {
		this.raporuVarMı = raporuVarMı;
	}
	
	public List<Double> getOgrenciNotlar() {
		return ogrenciNotlar;
	}


	public void setOgrenciNotlar(List<Double> ogrenciNotlar) {
		this.ogrenciNotlar = ogrenciNotlar;
	}


	public void raporAl() {
		
			if (!raporuVarMı) {
				setRaporuVarMı(true);
				System.out.println("Öğrenci rapor aldi");
				
			}else {
				System.out.println("Ogrenci raporlu");
			}
	}
}

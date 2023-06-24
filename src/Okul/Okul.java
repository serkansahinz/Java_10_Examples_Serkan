package Okul;

import java.util.List;

public class Okul {
	private String okulAdi;
	private List<Ogretmen> ogretmenler;
	private List<Sınıf> siniflar;
	private List<Ogrenci> ogrenciler;
	private List<Memur> memurlar;
	private List<EDersler> derslers = List.of(EDersler.values());
	public String getOkulAdi() {
		return okulAdi;
	}
	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}
	public List<Ogretmen> getOgretmenler() {
		return ogretmenler;
	}
	public void setOgretmenler(List<Ogretmen> ogretmenler) {
		this.ogretmenler = ogretmenler;
	}
	public List<Sınıf> getSiniflar() {
		return siniflar;
	}
	public void setSiniflar(List<Sınıf> siniflar) {
		this.siniflar = siniflar;
	}
	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	public List<Memur> getMemurlar() {
		return memurlar;
	}
	public void setMemurlar(List<Memur> memurlar) {
		this.memurlar = memurlar;
	}
	public List<EDersler> getDerslers() {
		return derslers;
	}
	public void setDerslers(List<EDersler> derslers) {
		this.derslers = derslers;
	}
	public Okul(String okulAdi) {
		super();
		this.okulAdi = okulAdi;
	}

	
}

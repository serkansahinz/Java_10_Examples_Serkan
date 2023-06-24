package Okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public  class  Sınıf<T> {
	private int sinifNo;
	private List<Ogrenci> siniftakiOgrencilerList;
	
	private T sınıfSeviye;
	private String dersler;
	private Map<Integer, Ogrenci> ogrenciler;
	private ArrayList<String> ogrenci;
	public int getSinifNo() {
		return sinifNo;
	}
	public void setSinifNo(int sinifNo) {
		this.sinifNo = sinifNo;
	}
	public List<Ogrenci> getSiniftakiOgrencilerList() {
		return siniftakiOgrencilerList;
	}
	public void setSiniftakiOgrencilerList(List<Ogrenci> siniftakiOgrencilerList) {
		this.siniftakiOgrencilerList = siniftakiOgrencilerList;
	}
	public T getSınıfSeviye() {
		return sınıfSeviye;
	}
	public void setSınıfSeviye(T sınıfSeviye) {
		this.sınıfSeviye = sınıfSeviye;
	}
	public String getDersler() {
		return dersler;
	}
	public void setDersler(String dersler) {
		this.dersler = dersler;
	}
	public Map<Integer, Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	public void setOgrenciler(Map<Integer, Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	public ArrayList<String> getOgrenci() {
		return ogrenci;
	}
	public void setOgrenci(ArrayList<String> ogrenci) {
		this.ogrenci = ogrenci;
	}
	public Sınıf(int sinifNo) {
		super();
		this.sinifNo = sinifNo;
	}

	
	
	
}

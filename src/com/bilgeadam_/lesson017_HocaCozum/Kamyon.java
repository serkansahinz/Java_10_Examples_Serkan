package com.bilgeadam_.lesson017_HocaCozum;

public class Kamyon extends Arac implements YukAl, YukBosalt{
	private String soforAdi;
	private int tekerlekSayisi;
	private int kasaUzunlugu;
	public Kamyon(int tekerlekSayisi, double depoAlanı, int plakaNo, String soforAdi, int tekerlekSayisi2) {
		super(tekerlekSayisi, depoAlanı, plakaNo);
		this.soforAdi = soforAdi;
		tekerlekSayisi = tekerlekSayisi2;
	}
	public String getSoforAdi() {
		return soforAdi;
	}
	public void setSoforAdi(String soforAdi) {
		this.soforAdi = soforAdi;
	}
	@Override
	public void yukBosalt() {
		System.out.println("Kasayi bosalt");	
	}
	@Override
	public void yukAl() {
		System.out.println("Kasaya yukle");	
	}
	@Override
	public void hızlan() {
		System.out.println("Gazla");	
	}
	@Override
	public void yavasla() {
		System.out.println("Fren");	
	}
	@Override
	public void dur() {
		System.out.println("Kuru faulye zamani:)");	
	}
	@Override
	public String toString() {
		return "Kamyon [soforAdi=" + soforAdi + ", tekerlekSayisi=" + tekerlekSayisi + ", getSoforAdi()="
				+ getSoforAdi() + ", getDepoAlanı()=" + getDepoAlanı() + ", getPlakaNo()=" + getPlakaNo() + "]";
	}
	

}

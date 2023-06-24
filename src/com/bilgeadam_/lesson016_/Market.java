package com.bilgeadam_.lesson016_;

import java.util.Arrays;

public class Market {
	
	private String ad;
	private String adres;
	private Urun[] urunler;
	private Calısan[] calisanlar;
	private Musteri[] musteriler;
	
	public Market(String ad, String adres) {
		super();
		this.ad = ad;
		this.adres = adres;
	}

	public Market(String ad, String adres, Urun[] urunler, Calısan[] calisanlar) {
		super();
		this.ad = ad;
		this.adres = adres;
		this.urunler = urunler;
		this.calisanlar = calisanlar;
		
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public Urun[] getUrunler() {
		return urunler;
	}

	public void setUrunler(Urun[] urunler) {
		this.urunler = urunler;
	}

	public Calısan[] getCalisanlar() {
		return calisanlar;
	}

	public void setCalisanlar(Calısan[] calisanlar) {
		this.calisanlar = calisanlar;
	}

	public Musteri[] getMusteriler() {
		return musteriler;
	}

	public void setMusteriler(Musteri[] musteriler) {
		this.musteriler = musteriler;
	}

	@Override
	public String toString() {
		return "Market [ad=" + ad + ", adres=" + adres + ", urunler=" + Arrays.toString(urunler) + ", calisanlar="
				+ Arrays.toString(calisanlar) + ", musteriler=" + Arrays.toString(musteriler) + "]";
	}
	
	

}

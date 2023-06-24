package com.bilgeadam.odev004;

public class Kaleci extends Futbolcu {
	private int kurtaris, gorusAlani;
	

	public void degajYap() {

	}

	public void kurtarisYap() {

	}

	
	public Kaleci() {
		super();
	}

	public Kaleci(String isim, int no, int dayaniklilik, String mevki, boolean aktifMi, int kurtaris, int gorusAlani) {
		super(isim, no, dayaniklilik, mevki, aktifMi);
		this.kurtaris = kurtaris;
		this.gorusAlani = gorusAlani;
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	public int getGorusAlani() {
		return gorusAlani;
	}

	public void setGorusAlani(int gorusAlani) {
		this.gorusAlani = gorusAlani;
	}

	@Override
	public String toString() {
		return "Kaleci [ No=" + getNo() + "]";
	}



	
	
	
}

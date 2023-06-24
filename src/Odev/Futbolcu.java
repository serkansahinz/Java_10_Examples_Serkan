package com.bilgeadam.odev004;

public abstract class Futbolcu extends Calisan {

	private int no, hiz, pas, topSurme, sut, dayaniklilik;
	private String mevki;
	private boolean aktifMi;
	
	

	



	public Futbolcu() {
		super();
	}


	public Futbolcu(String isim, int no, int dayaniklilik, String mevki, boolean aktifMi) {
		super(isim);
		this.no = no;
		this.dayaniklilik = dayaniklilik;
		this.mevki = mevki;
		this.aktifMi = aktifMi;
	}


	public Futbolcu(String isim, int no, int hiz, int pas, int topSurme, int sut, int dayaniklilik, String mevki,
			boolean aktifMi) {
		super(isim);
		this.no = no;
		this.hiz = hiz;
		this.pas = pas;
		this.topSurme = topSurme;
		this.sut = sut;
		this.dayaniklilik = dayaniklilik;
		this.mevki = mevki;
		this.aktifMi = aktifMi;
	}


	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getSut() {
		return sut;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public int getDayaniklilik() {
		return dayaniklilik;
	}

	public void setDayaniklilik(int dayaniklilik) {
		this.dayaniklilik = dayaniklilik;
	}

	public String getMevki() {
		return mevki;
	}

	public void setMevki(String mevki) {
		this.mevki = mevki;
	}


	@Override
	public String toString() {
		return "Futbolcu [no=" + no + ", hiz=" + hiz + ", pas=" + pas + ", topSurme=" + topSurme + ", sut=" + sut
				+ ", dayaniklilik=" + dayaniklilik + ", mevki=" + mevki + ", aktifMi=" + aktifMi + ", getIsim()="
				+ getIsim() + "]";
	}



	

}

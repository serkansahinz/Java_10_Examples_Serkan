package com.bilgeadam.odev004;

public class Defans extends Futbolcu implements IFutbolcuOrtakIslev {
	
	private int topCalma, markaj, sicrama;

	public void markajYap() {

	}

	public void topaMudahale() {

	}

	@Override
	public void pasVer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sutCek() {
		// TODO Auto-generated method stub
		
	}


	public Defans() {
		super();
	}

	public Defans(String isim, int no, int hiz, int pas, int topSurme, int sut, int dayaniklilik, String mevki,
			boolean aktifMi, int topCalma, int markaj, int sicrama) {
		super(isim, no, hiz, pas, topSurme, sut, dayaniklilik, mevki, aktifMi);
		this.topCalma = topCalma;
		this.markaj = markaj;
		this.sicrama = sicrama;
	}

	public int getTopCalma() {
		return topCalma;
	}

	public void setTopCalma(int topCalma) {
		this.topCalma = topCalma;
	}

	public int getMarkaj() {
		return markaj;
	}

	public void setMarkaj(int markaj) {
		this.markaj = markaj;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

	@Override
	public String toString() {
		return "Defans [ No=" + getNo() + "]";
	}

	
	

}

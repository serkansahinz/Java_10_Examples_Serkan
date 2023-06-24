package com.bilgeadam.odev004;

public class Forvet extends Futbolcu implements IFutbolcuOrtakIslev{
	
	private int bitiricilik,kafaVurusu,ilkDokunus;
	
	
	
	
	public Forvet() {
		super();
	}

	public Forvet(String isim, int no, int hiz, int pas, int topSurme, int sut, int dayaniklilik, String mevki,
			boolean aktifMi, int bitiricilik, int kafaVurusu, int ilkDokunus) {
		super(isim, no, hiz, pas, topSurme, sut, dayaniklilik, mevki, aktifMi);
		this.bitiricilik = bitiricilik;
		this.kafaVurusu = kafaVurusu;
		this.ilkDokunus = ilkDokunus;
	}

	public void markajdanKacma() {
		
	}

	@Override
	public void pasVer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sutCek() {
		// TODO Auto-generated method stub
		
	}

	

	public int getBitiricilik() {
		return bitiricilik;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}

	public int getKafaVurusu() {
		return kafaVurusu;
	}

	public void setKafaVurusu(int kafaVurusu) {
		this.kafaVurusu = kafaVurusu;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	@Override
	public String toString() {
		return "Forvet [ No=" + getNo() + "]";
	}

	
	

}

package com.bilgeadam.odev004;

public class OrtaSaha extends Futbolcu implements IFutbolcuOrtakIslev{
	private int ozelYetenek,uzunTop,uretkenlik;
	
	public void araPasiVer() {
		
	}

	@Override
	public void pasVer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sutCek() {
		// TODO Auto-generated method stub
		
	}

	

	public OrtaSaha() {
		super();
	}



	public OrtaSaha(String isim, int no, int hiz, int pas, int topSurme, int sut, int dayaniklilik, String mevki,
			boolean aktifMi, int ozelYetenek, int uzunTop, int uretkenlik) {
		super(isim, no, hiz, pas, topSurme, sut, dayaniklilik, mevki, aktifMi);
		this.ozelYetenek = ozelYetenek;
		this.uzunTop = uzunTop;
		this.uretkenlik = uretkenlik;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	@Override
	public String toString() {
		return "OrtaSaha [ No()=" + getNo() + "]";
	}

	
	

}

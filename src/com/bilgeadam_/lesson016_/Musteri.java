package com.bilgeadam_.lesson016_;

public class Musteri extends Kisi{
	
	private int alısverisPuani;

	public Musteri(String isim, String soyisim, String adres, String tel, int alısverisPuani) {
		super(isim, soyisim, adres, tel);
		this.alısverisPuani = alısverisPuani;
	}

	public int getAlısverisPuani() {
		return alısverisPuani;
	}

	public void setAlısverisPuani(int alısverisPuani) {
		this.alısverisPuani = alısverisPuani;
	}

	@Override
	public String toString() {
		return "Musteri [getAlısverisPuani()=" + getAlısverisPuani() + ", getIsim()=" + getIsim() + ", getSoyisim()="
				+ getSoyisim() + ", getAdres()=" + getAdres() + ", getTel()=" + getTel() + "]";
	}

	

}

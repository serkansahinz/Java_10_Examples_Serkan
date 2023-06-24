package com.bilgeadam_.lesson21.film;

public class Personel implements ICrud{
	private String personelAdiSoyadi;
	private int personelYasi;
	private double personelMaasi;
	
	public Personel(String personelAdiSoyadi, int personelYasi, double personelMaasi) {
		super();
		this.personelAdiSoyadi = personelAdiSoyadi;
		this.personelYasi = personelYasi;
		this.personelMaasi = personelMaasi;
	}
	public String getPersonelAdiSoyadi() {
		return personelAdiSoyadi;
	}
	public void setPersonelAdiSoyadi(String personelAdiSoyadi) {
		this.personelAdiSoyadi = personelAdiSoyadi;
	}
	public int getPersonelYasi() {
		return personelYasi;
	}
	public void setPersonelYasi(int personelYasi) {
		this.personelYasi = personelYasi;
	}
	public double getPersonelMaasi() {
		return personelMaasi;
	}
	public void setPersonelMaasi(double personelMaasi) {
		this.personelMaasi = personelMaasi;
	}
	@Override
	public String toString() {
		return "Personel [personelAdiSoyadi=" + personelAdiSoyadi + ", personelYasi=" + personelYasi
				+ ", personelMaasi=" + personelMaasi + "]";
	}
	@Override
	public void guncelle() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sil() {
		// TODO Auto-generated method stub
		
	}

}

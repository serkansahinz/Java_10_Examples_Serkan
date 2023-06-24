package com.bilgeadam_.lesson016_;

public class Calısan extends Kisi {
	private double maas;
	private int mesai;
	
	public Calısan(String isim, String soyisim, String adres, String tel, double maas, int mesai) {
		super(isim, soyisim, adres, tel);
		this.maas = maas;
		this.mesai = mesai;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public int getMesai() {
		return mesai;
	}

	public void setMesai(int mesai) {
		this.mesai = mesai;
	}

	@Override
	public String toString() {
		return "Calısan [getMaas()=" + getMaas() + ", getMesai()=" + getMesai() + ", getIsim()=" + getIsim()
				+ ", getSoyisim()=" + getSoyisim() + ", getAdres()=" + getAdres() + ", getTel()=" + getTel() + "]";

		//		return super.toString() + "Calısan [maas=" + maas + ", mesai=" + mesai + "]";
		
	}

	
		
	
	

}

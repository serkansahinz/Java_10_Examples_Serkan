package com.bilgeadam_.lesson017_;

public class Gemi extends Arac implements YukAl, YukBosalt {
	private int grossTon;
	private int odaSayisi;
	public Gemi(int tekerlekSayisi, double depoAlanı, int plakaNo, int grossTon) {
		super(tekerlekSayisi, depoAlanı, plakaNo);
		this.grossTon = grossTon;
	}
	public int getGrossTon() {
		return grossTon;
	}
	public void setGrossTon(int grossTon) {
		this.grossTon = grossTon;
	}
	public void yelkenAc() {
		System.out.println("Yelken Ac");
	}
	public void limanaYanas() {
		System.out.println("Denizcileri selamla");	
	}
	@Override
	public void hızlan() {
		System.out.println("Yelken Ac veya Motora guc ver");	
	}
	@Override
	public void yavasla() {
		System.out.println("Motora gucu kes ");	
	}
	@Override
	public void dur() {
		System.out.println("Durdur veya Demir at");
	}
	@Override
	public void yukBosalt() {
		System.out.println("Ambarı bosalt");	
	}
	@Override
	public void yukAl() {
		System.out.println("Ambarı doldur");
	}
	@Override
	public String toString() {
		return "Gemi [grossTon=" + grossTon + ", getGrossTon()=" + getGrossTon() + ", getDepoAlanı()=" + getDepoAlanı()
				+ ", getPlakaNo()=" + getPlakaNo() + "]";
	}

	

	

}

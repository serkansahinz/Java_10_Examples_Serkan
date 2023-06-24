package com.bilgeadam_.lesson017_HocaCozum;

public abstract class Arac {
	private double depoAlanı; 
	private int plakaNo;
	public abstract void hızlan(); 
	public abstract void yavasla();
	public abstract void dur();
	public Arac(int tekerlekSayisi, double depoAlanı, int plakaNo) {
		super();
		this.depoAlanı = depoAlanı;
		this.plakaNo = plakaNo;
	}	public double getDepoAlanı() {
		return depoAlanı;
	}   public void setDepoAlanı(double depoAlanı) {
		this.depoAlanı = depoAlanı;
	}   public int getPlakaNo() {
		return plakaNo;
	} 	public void setPlakaNo(int plakaNo) {
		this.plakaNo = plakaNo;
	}
	@Override
	public String toString() {
		return "Arac [depoAlanı=" + depoAlanı + ", plakaNo=" + plakaNo + "]";
	}
}

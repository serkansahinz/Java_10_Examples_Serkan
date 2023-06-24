package com.bilgeadam_.lesson016_.polimorphism;

public class Pokemon {
	private int id;
	private String ad;
	private int guc;
	private int can;
	private int seviye;
	private String tur;
	public Pokemon(int id, String ad, int guc, int can, int seviye, String tur) {
		super();
		this.id = id;
		this.ad = ad;
		this.guc = guc;
		this.can = can;
		this.seviye = seviye;
		this.tur = tur;
	} 
	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void saldir() {
		System.out.println(ad + " adli pokemon saldiriyor");
	}
	public void kacinma () {
		System.out.println(ad + " adli pokemon kacindi");
	}
	public void pokedex() {
		System.out.println("POKEDEX");
		System.out.println("===============");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("guc= " + guc);
		System.out.println("can= " + can);
		System.out.println("seviye= " + seviye);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getGuc() {
		return guc;
	}
	public void setGuc(int guc) {
		this.guc = guc;
	}
	public int getCan() {
		return can;
	}
	public void setCan(int can) {
		this.can = can;
	}
	public int getSeviye() {
		return seviye;
	}
	public void setSeviye(int seviye) {
		this.seviye = seviye;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}

}

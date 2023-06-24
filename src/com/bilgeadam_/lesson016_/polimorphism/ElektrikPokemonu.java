package com.bilgeadam_.lesson016_.polimorphism;

public class ElektrikPokemonu extends Pokemon {
	private int voltajSeviyesi;

	public ElektrikPokemonu(int id, String ad, int guc, int can, int seviye, String tur, int voltajSeviyesi) {
		super(id, ad, guc, can, seviye, tur);
		this.voltajSeviyesi = voltajSeviyesi;
	}

	public int getVoltajSeviyesi() {
		return voltajSeviyesi;
	}

	public void setVoltajSeviyesi(int voltajSeviyesi) {
		this.voltajSeviyesi = voltajSeviyesi;
	}
	
	@Override
	public void saldir() {
		System.out.println(getAd() + " adli pokemon elektrik saldirisi yapiyor");
	}
	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("voltaj Seviyesi " + voltajSeviyesi);
	}

	@Override
	public String toString() {
		return "ElektrikPokemonu [getVoltajSeviyesi()=" + getVoltajSeviyesi() + ", getId()=" + getId() + ", getAd()="
				+ getAd() + ", getGuc()=" + getGuc() + ", getCan()=" + getCan() + ", getSeviye()=" + getSeviye()
				+ ", getTur()=" + getTur() + "]";
	}

}

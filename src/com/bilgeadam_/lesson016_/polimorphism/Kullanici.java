package com.bilgeadam_.lesson016_.polimorphism;

import java.util.Arrays;

public class Kullanici {
	
	private String ad;
	private Pokemon [] pokemonlar;
	
	public Kullanici(String ad) {
		super();
		this.ad = ad;
	}

	public Kullanici(String ad, Pokemon[] pokemonlar) {
		super();
		this.ad = ad;
		this.pokemonlar = pokemonlar;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Pokemon[] getPokemonlar() {
		return pokemonlar;
	}

	public void setPokemonlar(Pokemon[] pokemonlar) {
		this.pokemonlar = pokemonlar;
	}

	@Override
	public String toString() {
		return "Kullanici [ad=" + ad + ", pokemonlar=" + Arrays.toString(pokemonlar) + "]";
	}
	
	

}

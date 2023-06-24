package com.bilgeadam_.lesson016_.polimorphism;

import java.lang.foreign.ValueLayout.OfAddress;
import java.util.Arrays;
import java.util.Random;

public class Runner {
	
	public static void main(String[] args) {
		
		Kullanici kullanici=new Kullanici("Mustafa");
		Pokemon atesPokemonu = new AtesPokemonu(1, "charizart", 2000, 300, 3, 1500);
		Pokemon suPokemonu = new SuPokemonu(2, "squirtle", 500, 100, 2, "su", 250, 368);
		ElektrikPokemonu elektrikPokemonu = new ElektrikPokemonu(3, "pikacu", 180, 2, 200, "elektrik", 1280);
		
		((AtesPokemonu)atesPokemonu).getYakicilikGucu();
		System.out.println(((AtesPokemonu)atesPokemonu).getYakicilikGucu());
		System.out.println("----------------");
		Pokemon[]pokemonlar = {atesPokemonu, suPokemonu, elektrikPokemonu};
		
		kullanici.setPokemonlar(pokemonlar);
//		System.out.println("----------------");
		System.out.println(Arrays.toString(kullanici.getPokemonlar()));
		System.out.println("----------------");
//		for (Pokemon pokemon : pokemonlar) {
//			System.out.println(pokemon);
//		}
//		saldır(atesPokemonu);
//		
//		System.out.println(pokemonSec(pokemonlar));
		saldır(pokemonSec(pokemonlar));
	}
	public static void saldır(Pokemon pokemon) {
//		System.out.println(pokemon.getAd()  + " " +pokemon.getTur() + " saldirisi yapiyor");
		pokemon.saldir();
		System.out.println("----------------");
		saldir2(pokemon);
	}
	public static void saldir (Pokemon pokemon) {
		pokemon.saldir();
	}
	public static void saldir2(Pokemon pokemon) {
		if(pokemon instanceof ElektrikPokemonu) {
			System.out.println(pokemon.getAd() + "  elektrik saldirisi yapiyor");
		} else if (pokemon instanceof SuPokemonu) {
			System.out.println(pokemon.getAd() + "  su saldirisi yapiyor");
		} else {
			System.out.println(pokemon.getAd() + "  ates saldirisi yapiyor");
		}
	}
	public static Pokemon pokemonSec(Pokemon[]pokemonlar) {
		Random random = new Random();
		int index=random.nextInt(pokemonlar.length);
		System.out.println(index);
		return pokemonlar[index];
		
	}

}

package com.bilgeadam_.lesson016_.polimorphism;

public class AtesPokemonu extends Pokemon {
	private int yakicilikGucu;

	public AtesPokemonu(int id, String ad, int guc, int can, int seviye, int yakicilikGucu) {
		super(id, ad, yakicilikGucu, can, seviye, ad);
		this.yakicilikGucu = yakicilikGucu;
		setTur("Ates");
	}

	public int getYakicilikGucu() {
		return yakicilikGucu;
	}

	public void setYakicilikGucu(int yakicilikGucu) {
		this.yakicilikGucu = yakicilikGucu;
	}
	
	@Override
	public void saldir() {
		System.out.println(getAd() + " adli pokemon ates saldirisi yapiyor");
	}
	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yakicilik Gucu " + yakicilikGucu);
	}

 
	@Override
	public String toString() {
		return "AtesPokemonu [yakicilikGucu=" + yakicilikGucu + ", getYakicilikGucu()=" + getYakicilikGucu()
				+ ", getId()=" + getId() + ", getAd()=" + getAd() + ", getGuc()=" + getGuc() + ", getCan()=" + getCan()
				+ ", getSeviye()=" + getSeviye() + ", getTur()=" + getTur() + "]";
	} 

}

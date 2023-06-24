package com.bilgeadam_.lesson016_.polimorphism;

public class SuPokemonu extends Pokemon {
	private int yuzmeHizi;
	private int suBasincGucu;
	public SuPokemonu(int id, String ad, int guc, int can, int seviye, String tur, int yuzmeHizi, int suBasincGucu) {
		super(id, ad, guc, can, seviye, tur);
		this.yuzmeHizi = yuzmeHizi;
		this.suBasincGucu = suBasincGucu;
		setTur("Su");
	}
	public int getYuzmeHizi() {
		return yuzmeHizi;
	}
	public void setYuzmeHizi(int yuzmeHizi) {
		this.yuzmeHizi = yuzmeHizi;
	}
	public int getSuBasincGucu() {
		return suBasincGucu;
	}
	public void setSuBasincGucu(int suBasincGucu) {
		this.suBasincGucu = suBasincGucu;
	}
	@Override
	public void saldir() {
		System.out.println(getAd() + " adli pokemon su saldirisi yapiyor");
	}
	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yuzme hizi " + yuzmeHizi);
		System.out.println("su Basinc Gucu " + suBasincGucu);
	}
	@Override
	public String toString() {
		return "SuPokemonu [yuzmeHizi=" + yuzmeHizi + ", suBasincGucu=" + suBasincGucu + ", getYuzmeHizi()="
				+ getYuzmeHizi() + ", getSuBasincGucu()=" + getSuBasincGucu() + ", getId()=" + getId() + ", getAd()="
				+ getAd() + ", getGuc()=" + getGuc() + ", getCan()=" + getCan() + ", getSeviye()=" + getSeviye()
				+ ", getTur()=" + getTur() + "]";
	}
}

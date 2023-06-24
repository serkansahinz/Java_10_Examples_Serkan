package com.bilgeadam.odev004;

public class TeknikDirektor extends TeknikHeyet implements ITaktik {
	
	private int taktikBilgi, tecrübe;

	@Override
	public void teknikOgret() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void taktikVer() {
		// TODO Auto-generated method stub
		
	}
	
	public TeknikDirektor(String isim, int taktikBilgi, int tecrübe) {
		super(isim);
		this.taktikBilgi = taktikBilgi;
		this.tecrübe = tecrübe;
	}

	public int getTaktikBilgi() {
		return taktikBilgi;
	}

	public void setTaktikBilgi(int taktikBilgi) {
		this.taktikBilgi = taktikBilgi;
	}

	public int getTecrübe() {
		return tecrübe;
	}

	public void setTecrübe(int tecrübe) {
		this.tecrübe = tecrübe;
	}

	@Override
	public String toString() {
		return "TeknikDirektor [Isim=" + getIsim()+ "]";
	}

	

	
	

}

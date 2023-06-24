package com.bilgeadam.odev004;

public class Calisan {
	private String isim;

	

	public Calisan() {
		super();
	}

	public Calisan(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString() {
		return "Calisan [isim=" + isim + "]";
	}

}

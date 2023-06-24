package com.bilgeadam.odev004;

public class SaglikPersonel extends TeknikHeyet {
	private String unvan;
	
public void oyuncuIyilestir() {
		
	}

	public SaglikPersonel(String isim, String unvan) {
		super(isim);
		this.unvan = unvan;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	@Override
	public String toString() {
		return "SaglikPersonel [unvan=" + unvan + ", getIsim()=" + getIsim() + "]";
	}

	



	

}

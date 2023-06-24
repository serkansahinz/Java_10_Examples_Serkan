package Okul;

public class Ogretmen extends Calisan{
	
	private String verdigiDers;

	public String getVerdigiDers() {
		return verdigiDers;
	}

	public void setVerdigiDers(String verdigiDers) {
		this.verdigiDers = verdigiDers;
	}

	public Ogretmen(String id, String isim, String verdigiDers) {
		super(id, isim);
		this.verdigiDers = verdigiDers;
	}

	

}

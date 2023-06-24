package kutuphaneSinav;

public class Kasiyer extends Insan{
	
	private float aylik;
	
	public Kasiyer(String isimVeSoyisim, int id, float aylik) {
		super(isimVeSoyisim, id);
		this.aylik = aylik;
	}

	public float getAylik() {
		return aylik;
	}

	public void setAylik(float aylik) {
		this.aylik = aylik;
	}

	@Override
	public String toString() {
		return "Kasiyer [aylik=" + aylik + ", getIsimVeSoyisim()=" + getIsimVeSoyisim() + ", getId()=" + getId() + "]";
	}

	

	

}

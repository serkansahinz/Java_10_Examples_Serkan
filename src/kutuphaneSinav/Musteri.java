package kutuphaneSinav;

import java.util.List;

public class Musteri extends Insan{
	
	private List<Kitap> kiraladigiKitaplar;
	
	public Musteri(String isimVeSoyisim, int id) {
		super(isimVeSoyisim, id);
	}

	public List<Kitap> getKiraladigiKitaplar() {
		return kiraladigiKitaplar;
	}

	public void setKiraladigiKitaplar(List<Kitap> kiraladigiKitaplar) {
		this.kiraladigiKitaplar = kiraladigiKitaplar;
	}

	public Musteri(String isimVeSoyisim, int id, List<Kitap> kiraladigiKitaplar) {
		super(isimVeSoyisim, id);
		this.kiraladigiKitaplar = kiraladigiKitaplar;
	}

	@Override
	public String toString() {
		return "Musteri [kiraladigiKitaplar=" + kiraladigiKitaplar + ", getIsimVeSoyisim()=" + getIsimVeSoyisim()
				+ ", getId()=" + getId() + "]";
	}

	

}

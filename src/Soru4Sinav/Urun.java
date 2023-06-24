package Soru4Sinav;

public class Urun {
	private int fiyat;
	private String adi;
	public Urun(int fiyat, String adi) {
		super();
		this.fiyat = fiyat;
		this.adi = adi;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	@Override
	public String toString() {
		return "Urun [fiyat=" + fiyat + ", adi=" + adi + "]";
	}

}

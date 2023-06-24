package lesson029f;

import java.time.LocalDate;


public class Ogrenci {

	private String isim;
	private double ort;
	private EDurum durum;
	private LocalDate dogumTarihi;

	public Ogrenci(String isim, double ort, EDurum durum, LocalDate dogumTarihi) {
		super();
		this.isim = isim;
		this.ort = ort;
		this.durum = durum;
		this.dogumTarihi = dogumTarihi;
	}

	public Ogrenci(String isim, double ort, LocalDate date) {
		super();
		this.isim = isim;
		this.ort = ort;
		this.dogumTarihi = date;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getOrt() {
		return ort;
	}

	public void setOrt(double ort) {
		this.ort = ort;
	}

	public EDurum getDurum() {
		return durum;
	}

	public void setDurum(EDurum durum) {
		this.durum = durum;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ort=" + ort + ", durum=" + durum + ", dogumTarihi=" + dogumTarihi + "]";
	}

}

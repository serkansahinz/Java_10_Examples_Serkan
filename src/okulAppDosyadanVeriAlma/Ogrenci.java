package okulAppDosyadanVeriAlma;

import java.io.Serializable;
import java.time.LocalDate;

public class Ogrenci implements Serializable {
	 private String isim;
	 private EDurum durum;
	 private double notOrt;
	 private LocalDate dogumTarihi;
	 
	 
	public Ogrenci(String isim, double notOrt, LocalDate dogumTarihi) {
		super();
		this.isim = isim;
		this.notOrt = notOrt;
		this.dogumTarihi = dogumTarihi;
	}

	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public EDurum getDurum() {
		return durum;
	}
	public void setDurum(EDurum durum) {
		this.durum = durum;
	}
	public double getNotOrt() {
		return notOrt;
	}
	public void setNotOrt(double notOrt) {
		this.notOrt = notOrt;
	}
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", durum=" + durum + ", notOrt=" + notOrt + ", dogumTarihi=" + dogumTarihi + "]";
	}
	 
	 
	}

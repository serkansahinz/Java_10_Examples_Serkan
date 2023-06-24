package kutuphaneSinav;

import java.time.LocalDate;



public class Kiralama {
	
	private int id;
	private Kasiyer kasiyer;
	private Musteri musteri;
	private Kitap kitap;
	private LocalDate date;
	
	public Kiralama(int id, Kasiyer kasiyer, Musteri musteri, Kitap kitap, LocalDate localDate) {
		super();
		this.id = id;
		this.kasiyer = kasiyer;
		this.musteri = musteri;
		this.kitap = kitap;
		this.date = localDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Kasiyer getKasiyer() {
		return kasiyer;
	}
	public void setKasiyer(Kasiyer kasiyer) {
		this.kasiyer = kasiyer;
	}
	public Musteri getMusteri() {
		return musteri;
	}
	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Kiralama [id=" + id + ", kasiyer=" + kasiyer + ", musteri=" + musteri + ", kitap=" + kitap  + "]";
	}
	
	
	

}

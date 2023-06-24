package okulAppDosyadanVeriAlma;

import java.time.LocalDate;
import java.util.List;

public class Ogretmen {
	private String isim;
	List<Ogrenci> ogrenciler;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	public Ogretmen(String isim, List<Ogrenci> ogrenciler) {
		super();
		this.isim = isim;
		this.ogrenciler = ogrenciler;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ogretmen [isim=");
		builder.append(isim);
		builder.append(", ogrenciler=");
		builder.append(ogrenciler);
		builder.append("]");
		return builder.toString();
	}
	
	
}

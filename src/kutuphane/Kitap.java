package kutuphane;

import java.time.LocalDate;
import java.util.Date;

public class Kitap {
	
	private int kitapSeriNo;
	private String kitapAdi;
//	private Date teslimTarihi;
	public int getKitapSeriNo() {
		return kitapSeriNo;
	}
	public void setKitapSeriNo(int kitapSeriNo) {
		this.kitapSeriNo = kitapSeriNo;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

}

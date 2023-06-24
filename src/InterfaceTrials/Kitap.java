package InterfaceTrials;

public class Kitap  {
	
	private Integer seriNo;
	private String kitapAdi;
	public Integer getSeriNo() {
		return seriNo;
	}
	public void setSeriNo(Integer seriNo) {
		this.seriNo = seriNo;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public Kitap(Integer seriNo, String kitapAdi) {
		super();
		this.seriNo = seriNo;
		this.kitapAdi = kitapAdi;
	}
	
	

}

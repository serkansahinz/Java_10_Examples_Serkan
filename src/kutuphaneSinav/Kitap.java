package kutuphaneSinav;


public class Kitap {
	
	private int id;
	private String isim;
	private EStatus durum;
	
	public Kitap(int id, String isim, EStatus durum) {
		super();
		this.id = id;
		this.isim = isim;
		this.durum = EStatus.RAFTA;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public EStatus getDurum() {
		return durum;
	}
	public void setDurum(EStatus durum) {
		this.durum = durum;
	}
	
	@Override
	public String toString() {
		return "Kitap [id=" + id + ", isim=" + isim + ", durum=" + durum + "]";
	}
	
	
}

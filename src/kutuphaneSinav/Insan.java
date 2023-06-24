package kutuphaneSinav;



public class Insan {
	
	private String isimVeSoyisim;
	private int id;
	
	public Insan(String isimVeSoyisim, int id) {
		super();
		this.isimVeSoyisim = isimVeSoyisim;
		this.id = id;
	}
	
	public String getIsimVeSoyisim() {
		return isimVeSoyisim;
	}
	public void setIsimVeSoyisim(String isimVeSoyisim) {
		this.isimVeSoyisim = isimVeSoyisim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Insan [isimVeSoyisim=" + isimVeSoyisim + ", id=" + id + "]";
	}
	

}

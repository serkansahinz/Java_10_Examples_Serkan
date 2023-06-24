package Okul;

public class Person {
	
	private String id;
	private String isim;
	
	public void raporAl() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public Person(String id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", isim=" + isim + "]";
	}
	
	
}

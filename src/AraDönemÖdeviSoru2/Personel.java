package AraDönemÖdeviSoru2;

import java.util.List;

public class Personel {
	
	private String adı;
	private int yaşı;
	
	
	
	public Personel() {
		super();
	}
	public Personel(String adı, int yaşı) {
		super();
		this.adı = adı;
		this.yaşı = yaşı;
	}
	public String getAdı() {
		return adı;
	}
	public void setAdı(String adı) {
		this.adı = adı;
	}
	public int getYaşı() {
		return yaşı;
	}
	public void setYaşı(int yaşı) {
		this.yaşı = yaşı;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" ");
		builder.append(adı);
		builder.append(", yaşı=");
		builder.append(yaşı);
		builder.append(" ");
		return builder.toString();
	}
	
	
	
	
	
	

}

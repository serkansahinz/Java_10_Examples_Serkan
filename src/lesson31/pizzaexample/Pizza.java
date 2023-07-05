package lesson31.pizzaexample;

public class Pizza {
	
	private Enum hamurTipi;
	private Enum boyut;
	private Enum tür;
	private double fiyat;
	
	
	
	
	public Pizza(Enum hamurTipi, Enum boyut, Enum tür, double fiyat) {
		super();
		this.hamurTipi = hamurTipi;
		this.boyut = boyut;
		this.tür = tür;
		this.fiyat = fiyat;
	}
	public Pizza(Enum hamurTipi, Enum boyut, Enum tür) {
		super();
		this.hamurTipi = hamurTipi;
		this.boyut = boyut;
		this.tür = tür;
	}
	public Enum getHamurTipi() {
		return hamurTipi;
	}
	public void setHamurTipi(Enum hamurTipi) {
		this.hamurTipi = hamurTipi;
	}
	public Enum getBoyut() {
		return boyut;
	}
	public void setBoyut(Enum boyut) {
		this.boyut = boyut;
	}
	public Enum getTür() {
		return tür;
	}
	public void setTür(Enum tür) {
		this.tür = tür;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	@Override
	public String toString() {
		return "Pizza [hamurTipi=" + hamurTipi + ", boyut=" + boyut + ", tür=" + tür + ", fiyat=" + fiyat + "]";
	}
	
	

}

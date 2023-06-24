package Okul;

import java.util.Date;
import java.util.List;

public class Calisan extends Person{

	private double maas;
	private int iseBaslamaYılı; 
	private boolean izindeMi;
	
	public Calisan(String id, String isim) {
		super(id, isim);
		// TODO Auto-generated constructor stub
	}
	
	public static void yillikIzin(Calisan calisan) {
		
			if (!calisan.izindeMi) {
				System.out.println(calisan.getIsim()+" No: "+calisan.getId() + " izin aldı");
				calisan.setIzindeMi(true);
			}else {
				System.out.println("zaten izne çıktı");
			}
		
	
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public int getIseBaslamaYılı() {
		return iseBaslamaYılı;
	}

	public void setIseBaslamaYılı(int iseBaslamaYılı) {
		this.iseBaslamaYılı = iseBaslamaYılı;
	}

	public boolean isIzindeMi() {
		return izindeMi;
	}

	public void setIzindeMi(boolean izindeMi) {
		this.izindeMi = izindeMi;
	}

	
} 

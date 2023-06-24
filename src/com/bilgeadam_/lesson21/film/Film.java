package com.bilgeadam_.lesson21.film;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Film implements ICrud{
	private String isim;
	private List<Etur> turler;
	private double puan;
	private Yonetmen yonetmen;
	private Set<Oyuncu> oyuncular;
	
//	Yonetmen yonetmen2 = new Yonetmen("Mustafa", 55, 50000);
//	Oyuncu oyuncu = new Oyuncu("Caner", 33, 25000);
//	private String filmTuru;
//	private Integer filmPuani;
//	Map<Film, Yonetmen> yonetmenlerMap = new HashMap<>();
//	Map<Film, Oyuncu> oyuncular2 = new HashMap<>();
//	ArrayList<Yonetmen> yonetmenlerList = new ArrayList<>();
	
	
 public void kaydet() {
	 System.out.println("xxx kaydedildi");
	 
 } public Film(String isim, List<Etur> turler, Yonetmen yonetmen) {
	super();
	this.isim = isim;
	this.turler = turler;
	this.yonetmen = yonetmen;
}
public Film(String isim, List<Etur> turler) {
	super();
	this.isim = isim;
	this.turler = turler;
	
}
public String getIsim() {
	return isim;
}
public void setIsim(String isim) {
	this.isim = isim;
}
public List<Etur> getTurler() {
	return turler;
}
public void setTurler(List<Etur> turler) {
	this.turler = turler;
}
public double getPuan() {
	return puan;
}
public void setPuan(double puan) {
	this.puan = puan;
}
public Yonetmen getYonetmen() {
	return yonetmen;
}
public void setYonetmen(Yonetmen yonetmen) {
	this.yonetmen = yonetmen;
}
public Set<Oyuncu> getOyuncular() {
	return oyuncular;
}
public void setOyuncular(Set<Oyuncu> oyuncular) {
	this.oyuncular = oyuncular;
}
@Override
public void guncelle() {
	// TODO Auto-generated method stub
	
}
@Override
public void sil() {
	// TODO Auto-generated method stub
	
}

}

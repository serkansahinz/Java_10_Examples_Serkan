package sehir;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Sehir implements Isehir{
	private String isim;
	private String plaka;
	private long nufus;
	
	public Sehir(String isim) {
		super();
		this.isim = isim;
	}
	@Override
	public String toString() {
		return "Sehir [isim=" + isim + ", plaka=" + plaka + ", nufus=" + nufus + "]";
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public long getNufus() {
		return nufus;
	}
	public void setNufus(long nufus) {
		this.nufus = nufus;
	}
	public Sehir(String isim, String plaka, long nufus) {
		super();
		this.isim = isim;
		this.plaka = plaka;
		this.nufus = nufus;
	}
	@Override
	public String plakaKoduUret() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long rastgeleNufusUret() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}

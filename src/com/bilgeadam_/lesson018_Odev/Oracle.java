package com.bilgeadam_.lesson018_Odev;

public class Oracle implements Database{
	@Override
	public void veriEkle() {
		System.out.println("Oracle'a veri eklendi");	
	}
	@Override
	public void veriSil() {
		System.out.println("Oracle'dan veri silindi");	
	}
	@Override
	public void veriGuncelle() {
		System.out.println("Oracle'da veri güncellendi");	
	}
	@Override
	public void veriGetir() {
		System.out.println("Oracle'dan veri getirildi");
	}
}

package com.bilgeadam_.lesson018_Odev;

public class MySql implements Database{
	@Override
	public void veriEkle() {
		System.out.println("MySql'e veri eklendi");	
	}
	@Override
	public void veriSil() {
		System.out.println("MySql'den veri silindi");	
	}
	@Override
	public void veriGuncelle() {
		System.out.println("MySql'de veri güncellendi");	
	}
	@Override
	public void veriGetir() {
		System.out.println("MySql'den veri getirildi");
	}
}

package com.bilgeadam_.lesson018_Odev;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Flow.Publisher;
import javax.security.auth.login.LoginContext;

public class Manager {
	Scanner scanner=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		//MAIN
		System.out.println("hosgeldiniz " + login());
		
		sec();
		 
		
	}
	
	public static void sec() {
		
		int secim;
		do {
			Scanner scanner=new Scanner(System.in);
			System.out.println("--------------------------");
			System.out.println("Lutfen veri tabani seciniz");
			System.out.println("1- Sql");
			System.out.println("2- Oracle");
			System.out.println("0- Cikis");
			secim=scanner.nextInt();
			switch (secim) {
			case 1:
				sqlmenu();
				break;
			case 2:
				oracleMenu();
				break;
			case 0:
				System.out.println("SQL- Oracle secim menusunden ciktiniz");
				break;
			}
		} while (secim!=0);
		
	}
	public static void oracleMenu() {
		Oracle oracle = new Oracle();
        int sayi;
		do {
			Scanner scanner=new Scanner(System.in);
			System.out.println("--------------------------");
			System.out.println("Oracle Menu Hosgeldiniz");
			System.out.println("1- Veri ekle");
			System.out.println("2- Veri sil");
			System.out.println("3- Veri guncelle");
			System.out.println("4- Verileri getir");
			System.out.println("0- Cikis");
			sayi=scanner.nextInt();
			
			switch (sayi) {
			case 1:
				oracle.veriEkle();
				break;
			case 2:
				oracle.veriSil();
				break;
			case 3:
				oracle.veriGuncelle();
				break;
			case 4:
				oracle.veriGetir();
				break;
			case 0:
				System.out.println("Oracle menusunden ciktiniz");
				break;
			}
		} while (sayi!=0);
		
	}
	
	public static void sqlmenu() {
		MySql mysql = new MySql();
		
		int sayi;
		do {
			Scanner scanner=new Scanner(System.in);
			System.out.println("--------------------------");
			System.out.println("SQL Menu Hosgeldiniz");
			System.out.println("1- Veri ekle");
			System.out.println("2- Veri sil");
			System.out.println("3- Veri guncelle");
			System.out.println("4- Verileri getir");
			System.out.println("0- Cikis");
			sayi=scanner.nextInt();
			switch (sayi) {
			case 1:
				mysql.veriEkle();
				break;
			case 2:
				mysql.veriSil();
				break;
			case 3:
				mysql.veriGuncelle();
				break;
			case 4:
				mysql.veriGetir();
				break;
			case 0:
				System.out.println("SQL menusunden ciktiniz");
				break;
			}
		} while (sayi!=0);
	} 
	public static ArrayList <String> login() {
		ArrayList <String> loginsArrayList = new ArrayList <String>();
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		Scanner scanner = new Scanner(System.in);
		String adSoyad = scanner.nextLine();
		
		System.out.println("Lutfen sifre giriniz");
		int sifre = scanner.nextInt();
		
		loginsArrayList.add(adSoyad);
		
		loginsArrayList.add(Integer.toString(sifre));
		
		return loginsArrayList;
		
	}
	
}

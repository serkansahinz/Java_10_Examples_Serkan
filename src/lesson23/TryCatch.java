package lesson23;

import java.util.Scanner;

import javax.swing.AbstractCellEditor;

import com.bilgeadam_.lesson21.SayiUretFalan;

public class TryCatch {
	Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		TryCatch abc= new TryCatch();
	
			System.out.println(abc.bolme());
			
		
		
		
	} public static double bolme() {
		Scanner scanner=new Scanner(System.in);
		double sonuc=0;
		boolean kontrol=false;
		do {
			try {
				System.out.println("Lutfen 1. sayi giriniz");
				int sayi1=scanner.nextInt();
				System.out.println("Lutfen 2. sayi giriniz");
				int sayi2=scanner.nextInt();
				sonuc=sayi1/sayi2;
				kontrol=false;
			} catch (Exception e) {
				System.out.println("hata olustu "+e.toString());
				
//				System.out.println("Lutfen 2. sayiyi tekrar giriniz");
//				int sayi2=scanner.nextInt();
//				System.out.println(e.toString());
				kontrol=true;
			}
		} while (kontrol);
	
		return sonuc;
	}

}

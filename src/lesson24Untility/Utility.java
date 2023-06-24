package lesson24Untility;

import java.util.Scanner;

public class Utility {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		intDegerAlma();
		
	}
	
	public static int intDegerAlma() {
		
		boolean kontrol=false;
		int deger=0;
		do {
			
			try {
				deger=scanner.nextInt();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				kontrol=true;
			} finally {
				scanner.nextLine();
			}
			
		} while (kontrol);
		
		
		return deger;
	}

}

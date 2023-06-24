package lesson23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DısaridanDogumTarihi {
	
//	dışarıdan doğum tarihi alın, kaç gün, kaç yıl, kaç ay yaşandığını ekrana yazdırın
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen dogum tarihinizi giriniz");
		String dogumGunu=scanner.nextLine();
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dogumGunu2=LocalDate.parse(dogumGunu, formatter);
		long gun=dogumGunu2.until(now, ChronoUnit.DAYS);
		long ay=dogumGunu2.until(now, ChronoUnit.MONTHS);
		long yil=dogumGunu2.until(now, ChronoUnit.YEARS);
		long hafta=dogumGunu2.until(now, ChronoUnit.WEEKS);
		System.out.println(yil+" yil "+ay+" ay "+gun+" gun "+" gundur dunyadasınız");
		System.out.println(dogumGunu2);
	
	}
	
	

}

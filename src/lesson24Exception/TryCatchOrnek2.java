package lesson24Exception;
import java.util.Scanner;
public class TryCatchOrnek2 {
	public static void main(String[] args) {
		TryCatchOrnek2 abc = new TryCatchOrnek2();
		String[] array= {"30", "a", "20", "ab", null, "50"};
//		abc.yazdir(array);
		
		abc.nullKontrolu2(null); 
		System.out.println("Program devam ediyor");
	}
	public void yazdir(String[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen yazilmasini istediginiz indexi belirtiniz");
		int index=scanner.nextInt();
		int toplam=0;
		try {
			System.out.println(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("gecerli index degerini astiniz, index 0-5 arasinda secin, array boyutu= "+ array.length);
			System.out.println(e.toString());
//			e.printStackTrace();
		} 
		int hataSayac=0;
		for (int i = 0; i < array.length; i++) {
			try { toplam+=Integer.parseInt(array[i]); }	
			catch (NumberFormatException e) {
				hataSayac++;
				System.out.println(e.toString());	
				
			}
		} 
		System.out.println("toplam"+toplam);	
		System.out.println("hata sayisi= "+hataSayac  );
	} public void nullKontrolu2(String[] array) {
		int sayac=0;
		try {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			
		} catch (NullPointerException e) {
			System.out.println(e.toString());
			sayac++;
		}
		System.out.println(sayac);
	} public String nullKontrolu(String string) throws Exception{
		if(string==null) {
			throw new NullPointerException("Null hatasi!!!");
		}
		return string;
		
	}
} 

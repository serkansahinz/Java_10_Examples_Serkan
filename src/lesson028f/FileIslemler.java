package lesson028f;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Sabitlerimizi tuttugmuz bir sınıfımız olsun 
 * menudeki her bir işlem için bir metot yazalım 
 * System.out.println("1-Dosya yarat");
		System.out.println("2-Dosya sil");
		System.out.println("3-Dosya ya veri ekle");
		System.out.println("4-Dosya dan veri oku");
		System.out.println("5-Dosya da ki bir harfi değiştir");
		
	1-eger dosya daha once yaratılmamıssa dosya ismi ile beraber basarılı bir şekilde 
	olustuldugu cıktısını verelim eger daha once olusturulmussa bu dosaya daha once
	 olusturulmustr cıktısı verelim 	
 * 
 * 2- dosya sil metodu dha once bu dosya varsa silecek ve dosya basarı ile silinmiştir diyecek
 * eger dosya yoksa boyle bir dosya bulunumadı diye bir çıktı verecek
 * 3-  scanner ile alınan veriyi dosyaya yazdıralım 
 * 4- dosyadan okudugumuz veriyi bir stringe ekleyin 
 * ve strinde tutalım ve bu stringi geri donelim
 * 5-bir harf belirleyecğiz bu harf dosyamızda varsa 
 * ikinci belirlediğimiz harf ile değiştireceğiz
 *	dosyadada verinin değişmesini sağlayacagız
 */

public class FileIslemler {
	File file = new File(FileSabitler2.PATH);
//	String dosyaYolu= "C:\\Users\\avgam\\Desktop\\fileyolu\\text.txt";
	File file2 = new File(FileSabitler2.PATH2);

	public void menu() {
		System.out.println("====DOSYA İŞLEMLERİ====");
		System.out.println("1-Dosya yarat");
		System.out.println("2-Dosya sil");
		System.out.println("3-Dosya ya veri ekle");
		System.out.println("4-Dosya dan veri oku");
		System.out.println("5-Dosya da ki bir harfi değiştir");
		System.out.println("0-Cıkıs");
	}

	public void uygulama() {
		int secim = 0;
		do {
			menu();
			secim = Utility.intDegerAlma("Lütfen bir işlem seciniz");
			switch (secim) {
			case 1:
				dosyaYarat();
				break;
			case 2:
				dosyaSil();
				break;
			case 3:
				dosyayaVeriEkle();
				break;
			case 4:
				dosyadanVeriOku();
				break;
			case 5:
				dosyadaHarfDeğiştir();
				break;

			default:
				break;
			}

		} while (secim != 0);

	}

	private void dosyadaHarfDeğiştir() {
	
		String abcString="";
		String xyzString="";
		try (BufferedReader bufferedReader=new BufferedReader(new FileReader(file2))){
			while ((abcString=bufferedReader.readLine()) != null) {
				if (abcString.contains("A")) {
					abcString =	abcString.replace("A", "a");
					
				} 
				xyzString += abcString + "\n";
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String veri = xyzString;
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

			if (file.length() != 0) {
				// bufferedWriter.newLine();
				veri = "\n" + veri;
			}
			bufferedWriter.write(veri);
			System.out.println(file.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(xyzString + "\n" + "veriler değişti");
	}
	public String dosyadanVeriOku() {
		String abcString="";
		String xyzString="";
		try (BufferedReader bufferedReader=new BufferedReader(new FileReader(file2))){
			while ((abcString=bufferedReader.readLine()) != null) {
				xyzString += abcString + "\n";
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(xyzString);
		return xyzString;
	}
	public void dosyayaVeriEkle() {
		String veri = Utility.stringDegerAlma("lütfen eklencek veri giriniz");
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {

			if (file.length() != 0) {
				// bufferedWriter.newLine();
				veri = "\n" + veri;
			}
			bufferedWriter.write(veri);
			System.out.println(file.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void dosyaSil() {
		
		try {
			if (file.delete()) {
				System.out.println(file.getName() + " başarılı bir şekilde silindi");
			} else {
				System.out.println(file.getName() + " isimli dosya bulunumamıstır!!!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void dosyaYarat() {

		try {
			if (file.createNewFile()) {
				System.out.println(file.getName() + " başarılı bir şekilde olusturuldu");
			} else {
				System.out.println(file.getName() + " dosyası daha once olusturulmustur");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package File2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemlerJava {
	
	String filePath = "ogrencilistesi.txt";
	
	public static void main(String[] args) {
		FileIslemlerJava abc= new FileIslemlerJava();
		abc.menu();
		abc.islemSec();
	}
	
public void menu() {
	System.out.println("Lutfen yapmak istediginiz islemi seciniz");
	System.out.println("1-Dosya oluştur");
	System.out.println("2-Dosya sil");
	System.out.println("3-Dosya'ya veri ekle");
	System.out.println("4-Dosya'dan veri oku");
	System.out.println("5-Dosya'daki bir harfi değistir");
	System.out.println("0-cikis");
	
} public void islemSec() {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Lutfen yapmak istediginiz islemi seciniz");
	int selection= 0;
	
	
	do {
		selection=scanner.nextInt();
		switch (selection) {
		case 1:
			System.out.println("1-Dosya oluştur");
			dosyaOlustur(filePath);
			break;
		case 2:
			System.out.println("2-Dosya sil");
			dosyaSil();
			break;
		case 3:
			System.out.println("3-Dosya'ya veri ekle");
			dosyaVeriEkle();
			break;
		case 4:
			System.out.println("4-Dosya'dan veri oku");
			dosyaVeriOku();
			break;
		case 5:
			System.out.println("5-Dosya'daki bir harfi değistir");
			dosyaHarfDegistir();
			break;
		case 6:
			System.out.println("0-cikis");
			
			break;
		

		default:
			System.out.println("Lutfen 1 ile 5 arasi bir secim yapiniz");
			break;
		}
	} while (selection!=0);
	
	
}

private void dosyaHarfDegistir() {
	// TODO Auto-generated method stub
	
}

private void dosyaVeriOku() {
	// TODO Auto-generated method stub
	
}

private void dosyaVeriEkle() {
	Scanner scanner = new Scanner(System.in);
	String inputStr=scanner.nextLine();
	String str = "Bunu dosyaya yazdir";
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputStr))

    File file = new File("dosya.txt");
    if (!file.exists()) {
        file.createNewFile();
    }

    FileWriter fileWriter = new FileWriter(file, false);
    BufferedWriter bWriter = new BufferedWriter(fileWriter);
    bWriter.write(str);
    bWriter.close();
	
	
}

private void dosyaSil() {
	// TODO Auto-generated method stub
	
}

private void dosyaOlustur(String dosyaYolu) {
//	File file  = new File(dosyaYolu);
	
//	try {
//		if (file.createNewFile()) {
//			System.out.println(file.getName() + "başarılı bir şekilde oluşturuldu.");
//		} else {
//			System.out.println(file.getName() + "dosyasi daha once oluşturulmustur.");
//		}
//		
//		
//	} catch (IOException e) {
//		System.out.println("Bu dosya daha önce oluşturulmuştur..");
//		e.printStackTrace();
//	}
}
	
	
}



/*
 * Bir ogrenci listemiz olsun  ogrenci isimlerini  bir dosyada tutalım( ogrencilistesi.txt olabilir) 

Dosyadan okudugumuz ogrenci isimlerini bir listeye atalım  
Okudumuz listeyi ogrenciListesiKopya isimli bir txt dosyasına aktaralım ( orjinal  dosya uzerinde çalışmamak için ) 
Daha sonra  listemizden rastgele index ile bir ogrenci cekelim (buna bir metot yazılabilir) 
Daha sonra çektiğimiz ogrenciyi başka bir dosyaya yazdıralım(ismiAlınanlar.txt gibi olabilir) 
Daha sonra bu ogrenciyi listemizden silip güncel listeyi tekrar  ogrenciListesiKopya.txt dosyasına yazdıralım 
 */

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class File {

	public static void main(String[] args) {
		String filePath = "ogrencilistesi.txt";
		String filePathCopy = "ogrencilistesiKopya.txt";
		String fileReceivedNames = "ismiAlınanlar.txt";

		File ogrenci = new File();

		List<String> ogrenciListe = ogrenci.dosyadanOgrenciListesiOku(filePath);
		ogrenci.dosyayaOgrenciListesiYaz(ogrenciListe, filePathCopy);

		for (String string : ogrenciListe) {
			System.out.println(string);
		}
		String secilenOgrenci = ogrenci.randomOgrenciSec(ogrenciListe);
		System.out.println("Random secilen => " + secilenOgrenci);
		ogrenciListe.remove(secilenOgrenci);
		ogrenci.dosyayaOgrenciListesiYaz(ogrenciListe, filePathCopy);
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileReceivedNames))) {
			bufferedWriter.write(secilenOgrenci);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public List<String> dosyadanOgrenciListesiOku(String dosyaAdi) {
		List<String> ogrenciListesi = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaAdi))) {
			String satir;
			while ((satir = bufferedReader.readLine()) != null) {
				ogrenciListesi.add(satir);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ogrenciListesi;
	}

	public void dosyayaOgrenciListesiYaz(List<String> ogrenciList, String dosyaAdi) {

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dosyaAdi))) {
			int satir = 0;
			while (satir != ogrenciList.size()) {
				bufferedWriter.write(ogrenciList.get(satir) + "\n");
				satir++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String randomOgrenciSec(List<String> ogrenciListesi) {
		Random random = new Random();
		int index = random.nextInt(ogrenciListesi.size());
		return ogrenciListesi.get(index);
	}
}

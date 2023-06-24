package FileOdevSerkan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class FileDersCozum {
	List<String> ogrenciList;
	File file;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;

	public OgrenciFileIslemler() {
		this.ogrenciList=new ArrayList<>();
		
		public void dosyadanVeriOkuma(String dosyaYolu) {
			
			try {
				file= new File(dosyaYolu);
				bufferedReader = new BufferedReader(new FileReader(file));
				String ogrenci;
				
				while ((ogrenci=bufferedReader.readLine()) !=null) {
					
					ogrenciList.add(ogrenci);
					
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		

	} public void listeyiDosyayaYazdirma(String dosyaYolu) {
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(dosyaYolu));
			for (int i =0; i<ogrenciList.size(); i++) {
				if (i != ogrenciList.size() - 1) {
					bufferedWriter.write(ogrenciList.get(i));
					bufferedWriter.newLine();
				} else {
					bufferedWriter.write(null);

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

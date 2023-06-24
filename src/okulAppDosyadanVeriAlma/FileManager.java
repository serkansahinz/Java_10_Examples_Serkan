package okulAppDosyadanVeriAlma;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {
	static String path="C:\\Users\\avgam\\Desktop\\fileyolu\\ogrenci.txt";
	ArrayList<Ogrenci> ogrenciList= new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} public static List<Ogrenci> dosyadanVeriOku() {
		
		List<Ogrenci> list= new ArrayList<>();
		String abcString="";
		
		try (BufferedReader bufferedReader=new BufferedReader(
					new FileReader(path))){
			
			
			String xyzString="";
			while ((abcString=bufferedReader.readLine())!=null) {
				System.out.println(abcString);
				String[] array= abcString.split(",");
				String isim=array[0];
				List<String>notList=Arrays.asList(array).subList(1, 4);
				double ort=ortHesapla(notList);
 			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return null;
		
	}

	private static double ortHesapla(List<String> notList) {
		
		return notList.stream().collect(Collectors.averagingDouble(x->Double.parseDouble(x)));
	}

}

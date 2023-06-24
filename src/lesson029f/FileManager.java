package lesson029f;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {

	static String path = "C:\\Users\\avgam\\Desktop\\fileyolu\\ogrenci.txt";
	static List<Ogrenci> list = new ArrayList<>();
	public static List<Ogrenci> dosyadanVeriOku() {
		

		String veri = "";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			while ((veri = bufferedReader.readLine()) != null) {
				String[] array = veri.split(",");
				String isim = array[0];
				List<String> notList = Arrays.asList(array).subList(1, 4);
				double ort = ortHesapla(notList);
				LocalDate date = Utility.formatliLocalDateCevirme(array[4], "dd/MM/yyy");
				Ogrenci ogrenci = new Ogrenci(isim, ort, date);
				list.add(ogrenci);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return list;

	}

	private static double ortHesapla(List<String> notList) {
		return notList.stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci(path, 0, null)
		dosyadanVeriOku().forEach(System.out::println);
		List<Ogrenci> kalanlarList = dosyadanVeriOku().stream().map(x-> (x.getOrt()<60.0)).collect(Collectors.toList());
		
	}
}

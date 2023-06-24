package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetOrnek {
	
	Set<String> kategoriler = new TreeSet<>();
	Set<Integer> sayilar = new HashSet<>();
	Set<Integer> sayilar2 = new LinkedHashSet<>();
	
	public static void main(String[] args) {
		
		SetOrnek setOrnek = new SetOrnek();
		
		setOrnek.kategoriler.add("Drama");
		setOrnek.kategoriler.add("Anime");
		setOrnek.kategoriler.add("Komedi");
		setOrnek.kategoriler.add("Gerilim");
		
		for (String string : setOrnek.kategoriler) {
			System.out.println(string);
		}
		
		System.out.println("-----------");
		
		System.out.println(setOrnek.kategoriler);
		
		System.out.println("-----------");
		
		setOrnek.sayilar2.add(11);
		setOrnek.sayilar2.add(3);
		setOrnek.sayilar2.add(1);
		System.out.println(setOrnek.sayilar2);
		
		for (Integer i : setOrnek.sayilar2) {
			System.out.println(i);
			
		}
		
	} public void kategoriEkle(String string) {
		SetOrnek ornek = new SetOrnek();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir kategori giriniz");
		String kategori = scanner.nextLine();
		
		
		
		
		if(ornek.kategoriler.contains(kategori)) {
			System.out.println("bu kategori daha önce eklenmistir");
		} else {
			System.out.println("katefori basari ile eklenmistir");
		}
		ornek.kategoriler.add(kategori);
	} 
}

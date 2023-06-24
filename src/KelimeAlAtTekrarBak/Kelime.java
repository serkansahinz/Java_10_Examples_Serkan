package KelimeAlAtTekrarBak;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Kelime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen  bir kelime giriniz");
		String kelime=scanner.nextLine();
		
		Set<Character> harf= new HashSet<>();
		Set<Character> tekrarEden= new HashSet<>();
		Set<Character> tekrarEtmeyen= new HashSet<>();
		for (int i = 0; i < kelime.length(); i++) {
			if(!tekrarEden.contains(kelime.charAt(i))&&!tekrarEtmeyen.add(kelime.charAt(i))) {
				tekrarEtmeyen.add(kelime.charAt(i));
				tekrarEtmeyen.remove(kelime.charAt(i));
				tekrarEden.add(kelime.charAt(i));
				
			}
			
		}
		
		
		System.out.println("Tekrar eden");
		System.out.println(tekrarEden);
		System.out.println("Tekrar etmeyen");
		System.out.println(tekrarEtmeyen);
		
		
		
		
	}

}

package com.bilgeadam_.lesson20;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class KelimeKarsilastir {
	Set<Character> kelimeBak = new LinkedHashSet<Character>();

	public static void main(String[] args) {
		KelimeKarsilastir abc2 = new KelimeKarsilastir();
		abc2.kelimeGir();

	} public void kelimeGir() {
		KelimeKarsilastir abc = new KelimeKarsilastir();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scanner.nextLine();
		for (int i = 0; i < kelime.length(); i++) {
			System.out.println(kelime.charAt(i));
			abc.kelimeBak.add(kelime.charAt(i));
			
		}
		for ( Character abc3 : abc.kelimeBak) {
			System.out.println(abc3);
		}
		
	}

}

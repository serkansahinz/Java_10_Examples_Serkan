package com.bilgeadam_.lesson019_stackOrnekler;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.Stack;

public class PalidromStack {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scanner.nextLine();
		Stack<Character> kelimelerStacki = new Stack<>();
		
//		kelimelerStacki.add(kelime);
		
		for (int i = 0; i < kelime.length(); i++) {
			
			kelimelerStacki.add(kelime.charAt(i));
		}
		System.out.println(kelimelerStacki);
		
		if(isPalindrom()) {
			System.out.println("Palindromdur");
		} else {
			System.out.println("Palindrom değildir");
			
		}
//		System.out.println(kelimelerStacki.peek());
//		for (int i = 0; i < kelime.length()/2; i++) {
//			if(kelime.charAt(i)==kelime.charAt(kelime.length()-1)) {
//				System.out.println(kelimelerStacki.peek()+ " polidromdur");
//			} else {
//				System.out.println(kelimelerStacki.peek()+ " polidrom değildir");
//				break;
//			}
//		}
		
		
		
	} public static boolean isPalindrom() {
		Stack<Character> kelimelerStacki = new Stack<>();
		for(int i=0; i<kelimelerStacki.size()/2;i++) {
			if(kelimelerStacki.pop()!=kelimelerStacki.get(i)) {
				return false;
			} 
		}
		return true;
	}

}

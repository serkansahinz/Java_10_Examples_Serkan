package com.bilgeadam_.lesson019_stackOrnekler;

import java.util.Stack;
public class StackOrnek {
public static void main(String[] args) {
		
		Stack<Integer> firstStack = new Stack<>();
		Stack<Integer> lastStack = new Stack<>();
		firstStack.push(120);
		firstStack.push(320);
		firstStack.push(20);
		firstStack.push(50);
		firstStack.push(350);
		firstStack.push(5);
		firstStack.push(45);
		firstStack.push(450);
		int toplam =0;
		
		while(!firstStack.isEmpty()) {
			int deger = firstStack.peek(); //sadece üst degere bakar
//			int deger2 = firstStack.pop(); //stackten üst degeri alır içinden çıkarır
			if(deger<100) {
				toplam+=firstStack.pop();
			}else {
				lastStack.push(firstStack.pop());
			}
			
		}
		System.out.println("toplam "+toplam);
		System.out.println("for toplam "+toplam);
		for(Integer integer : lastStack) {
			System.out.println(integer);
		}
		System.out.println("while ");
		while (!lastStack.isEmpty()) {
			System.out.println(lastStack.pop());
			
		}
		System.out.println(lastStack.size());
	}

}

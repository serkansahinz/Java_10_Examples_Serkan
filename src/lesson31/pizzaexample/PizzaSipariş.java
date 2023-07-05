package lesson31.pizzaexample;

import AraDönemOdeviSoru1.Utility;

public class PizzaSipariş {
	
	public void menu() {
		
		System.out.println("Pizza sipariş menusu");
		System.out.println("Pizza boyutunu seciniz: ");
//		for (Enum a : EPizzaBoyutu.values()) {
//			System.out.println(a);
//		}
//		
//		System.out.println("Pizza türünü seciniz");
//		EPizzaTür.values();
//		System.out.println("Pizza hamur tipini seciniz");
//		EPizzaHamurTipi.values();
		
		
		Pizza pizza= pizzaSec();
		siparişHazirlama(pizza);
	}

	private Pizza pizzaSec() {
		EPizzaBoyutu boyut=boyutSec();
		System.out.println(boyut);
		
		return null;
	} 
	public EPizzaBoyutu boyutSec() {
		for (EPizzaBoyutu boyut : EPizzaBoyutu.values()) {
			System.out.println((boyut.ordinal()+1) + "-" + boyut);
						
		}
		int secim=Utility.intDegerAlma("Lütfen pizza boyutu secin");
		return EPizzaBoyutu.values()[secim-1];
	}

	private void siparişHazirlama(Pizza pizza) {
		System.out.println("Siparişiniz ===>"+ pizza );
		System.out.println("Hazırlanıyor");
		
	}

	

}

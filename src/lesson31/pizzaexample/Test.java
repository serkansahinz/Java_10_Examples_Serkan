package lesson31.pizzaexample;

import java.awt.Menu;

public class Test {

	public static void main(String[] args) {
//		Pizza pizza=new Pizza(EPizzaHamurTipi.İNCE, EPizzaBoyutu.BÜYÜK, EPizzaTür.AKDENİZ, 15);
//		System.out.println(pizza);
		PizzaSipariş pizzaSipariş= new PizzaSipariş();
		pizzaSipariş.menu();
	}

}

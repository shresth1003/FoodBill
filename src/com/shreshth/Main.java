package com.shreshth;

public class Main {
	public static void main(String[] args) {
//		Snacks baseSnacks= new Snacks(false);
//		baseSnacks.addExtraToppings();
//		baseSnacks.addExtraCheese();
//		baseSnacks.takeAway();
		
//		baseSnacks.getBill();
		
		DeluxSnacks sk= new DeluxSnacks(true);
//		sk.addExtraCheese();
//		sk.addExtraToppings();
		sk.takeAway();
		sk.getBill();
	}

}

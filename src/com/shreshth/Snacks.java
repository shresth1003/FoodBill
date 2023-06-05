package com.shreshth;

public class Snacks {
	private int price;
	private Boolean veg;
	
	private int ExtraCheesePrice =100;
	private int ExtraToppingsPrice =150;
	private int backPackPrice = 20;
	private int baseSnacksPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedForTakeAway=false;
	public Snacks(Boolean veg) {
		this.veg = veg;
		
		if(this.veg) {
			this.price = 300;
		}else {
			this.price =400;
		}
		baseSnacksPrice = this.price;
	}
	
public void addExtraCheese() {
	isExtraCheeseAdded = true;
//	System.out.println("Extra cheese added");
	this.price +=ExtraCheesePrice;
}

public void addExtraToppings() {
	isExtraToppingsAdded = true;
//	System.out.println("Extra Toppings added");
	this.price +=ExtraToppingsPrice;
}

public void takeAway() {
	isOptedForTakeAway =true;
	System.out.println("Take away opted");
	this.price +=backPackPrice;
}

public void getBill() {
	String bill ="";
//	System.out.println("Snacks"+baseSnacksPrice);
	if(isExtraCheeseAdded) {
		bill += "Extra cheese added: "+ ExtraCheesePrice+ "\n";
	}
	if(isExtraToppingsAdded) {
		bill += "Extra Toppings added: "+ ExtraToppingsPrice+ "\n";
	}
	if(isOptedForTakeAway) {
		bill += "Take away: "+backPackPrice+"\n";
	}
	bill +="Bill:"+ this.price +"\n";
	System.out.println(bill);
}
}

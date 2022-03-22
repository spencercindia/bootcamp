package com.techelevator.farm;

import java.math.BigDecimal;
import java.text.Bidi;

public class Chicken extends FarmAnimal implements Sellable {
	private BigDecimal price;
	public Chicken() {
		super("Chicken", "cluck!", BigDecimal(400));
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}
	public BigDecimal getPrice(){
		return price;
	}

}
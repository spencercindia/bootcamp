package com.techelevator.farm.animals;

import com.techelevator.farm.interfaces.Sellable;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Sellable {
	private BigDecimal price;

	public Cow() {
		super("Cow", "moo!");
		price = new BigDecimal("1500.00");
	}

	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public String eat() {
		return "scrom";
	}
}

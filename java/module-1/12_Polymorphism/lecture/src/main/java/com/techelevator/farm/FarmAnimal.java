package com.techelevator.farm;

import java.math.BigDecimal;

public class FarmAnimal implements Singable, Sellable {
	private String name;
	private String sound;
	private BigDecimal price;

	public FarmAnimal(String name, String sound, BigDecimal price) {
		this.name = name;
		this.sound = sound;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

	public String getSound() {
		return sound;
	}

}
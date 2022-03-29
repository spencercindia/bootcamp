package com.techelevator.farm.animals;

import com.techelevator.farm.interfaces.Sellable;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {
    private BigDecimal price;

    public Pig() {
        super("Pig", "oink!");
        price = new BigDecimal("300.00");
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String eat() {
        return "scromp";
    }
}

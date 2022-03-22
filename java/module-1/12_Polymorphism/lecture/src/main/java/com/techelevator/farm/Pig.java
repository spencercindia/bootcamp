package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {
    private BigDecimal price;

    public Pig(){
        super("Pig", "Oink", new BigDecimal(1000));
    }

    public BigDecimal getPrice(){
        return price;
    }

}

package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements Sellable {
    private String name;
    BigDecimal price;

    public Egg(){
        name = "Gregg";
        price = new BigDecimal(.25);
    }

    public String getName(){
        return name;
    }
    public BigDecimal getPrice(){
        return price;
    }

}

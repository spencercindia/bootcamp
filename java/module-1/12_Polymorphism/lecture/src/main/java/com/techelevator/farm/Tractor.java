package com.techelevator.farm;

import java.math.BigDecimal;

public class Tractor implements Singable {
    private String name;
    private String sound;

    public Tractor(){
        name = "Tractor";
        sound = "brbrbrbrbr";
    }

    public String getName(){
        return name;
    }
    public String getSound(){
        return sound;
    }
}

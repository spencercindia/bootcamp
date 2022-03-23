package com.techelevator.farm;

public class Cat extends FarmAnimal {
    public Cat(String name, String sound){
        super(name, sound);
    }

    @Override
    public String eat() {
        return "nom";
    }

}

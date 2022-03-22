package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable[] singables = new Singable[] { new Cow(), new Chicken(), new Tractor(), new Pig() };

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] { new Egg(), new Chicken(), new Pig() };
		for (Sellable sellable : sellables) {
			System.out.println("This little " + sellable.getName() + " went to the market for: $" + sellable.getPrice() + "!");
		}
	}
}
package com.techelevator;

import java.sql.Struct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<Integer, String> myMap = new HashMap<>();

		myMap.put(1, "more time");
		myMap.put(2, "much");
		myMap.put(3, "musketeers");
		myMap.put(4, "square");
		myMap.put(5, "guys");
		myMap.put(6, "flags");
		myMap.put(7, "Brad Pitt");

		Set<Integer> keys = myMap.keySet();
		String searchTerm = "Brad";
		for (Integer k : keys){
			if (myMap.get(k).contains(searchTerm)){
				System.out.println(true);
			}
		}

		



	}

}

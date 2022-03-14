package com.techelevator;

public class Lecture {
	String lectureTopic;
	int lectureDurationInMinutes;

	public Lecture(){}
	public Lecture(String lectureTopic, int lectureDurationInMinutes){
		this.lectureTopic = lectureTopic;
		this.lectureDurationInMinutes = lectureDurationInMinutes;
	}


	public static void main(String[] args) {

//		System.out.println("************************************");
//		System.out.println("****** MAKING A STRING OBJECT ******");
//		System.out.println("************************************");
//
//		/* The String class gets special treatment in the Java language.  One
//		 * example of this is that there is a literal representation of a
//		 * String (i.e. characters appearing between two double quotes.  This
//		 * is not the case for most classes */
//
//		/* create a new instance of String using a literal */
//
//
//		System.out.println();
//		System.out.println("******************************");
//		System.out.println("****** MEMBER METHODS ******");
//		System.out.println("******************************");
//		System.out.println();
//
//
//		/* Other commonly used methods:
//		 *
//		 * endsWith
//		 * startsWith
//		 * indexOf
//		 * lastIndexOf
//		 * length
//		 * substring
//		 * toLowerCase
//		 * toUpperCase
//		 * trim
//		 */
//
//		System.out.println();
//		System.out.println("**********************");
//		System.out.println("****** EQUALITY ******");
//		System.out.println("**********************");
//		System.out.println();
//
//        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
//        String hello1 = new String(helloArray);
//        String hello2 = new String(helloArray);
//
//		/* Double equals will compare to see if the two variables, hello1 and
//		 * hello2 point to the same object in memory. Are they the same object? */
//		if (hello1 == hello2) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}
//
//		String hello3 = hello1;
//		if (hello1 == hello3) {
//			System.out.println("hello1 is the same reference as hello3");
//		}
//
//		/* So, to compare the values of two objects, we need to use the equals method.
//		 * Every object type has an equals method */
//		if (hello1.equals(hello2)) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}

		System.out.println(middleTwo("code"));

	}

	/*
 Given a string of even length, return a string made of the middle two chars, so the string "string"
 yields "ri". The string length will be at least 2.
 middleTwo("string") → "ri"
 middleTwo("code") → "od"
 middleTwo("Practice") → "ct"
 */
	public static String middleTwo(String str) {
		int middle = str.length()/2;
		int firstMiddle = middle - 1;
		return  str.charAt(firstMiddle) + "" + str.charAt(middle);

	}

}

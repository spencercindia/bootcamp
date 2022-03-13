package com.techelevator;

import java.util.Scanner;
import java.util.Vector;

public class Fibonacci {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("I will give you the Fibonacci sequence leading up to the value you give me!");
		System.out.println("Please enter your value here: ");
		String userInput = scanner.nextLine();
		int userInputInt = Integer.parseInt(userInput);

		int fibStarterOne = 0;
		int fibStarterTwo = 1;
		int fibNew;

		System.out.print(fibStarterOne + ", " + fibStarterTwo);
		while (fibStarterOne < userInputInt)
		{
			fibNew = fibStarterOne + fibStarterTwo;
			if (fibNew > userInputInt)
			{
				break;
			}
			System.out.print(", " + fibNew);
			fibStarterOne = fibStarterTwo;
			fibStarterTwo = fibNew;

		}
	}
}
package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("I am here to convert decimal to binary! ");
		System.out.println("Please enter your decimal value here: ");
		String userDecimal = scanner.nextLine();

		String[] decimalArrayString = userDecimal.split(" ");

		for (int i = 0; i < decimalArrayString.length; i++) {
			int currentIndex = Integer.parseInt(decimalArrayString[i]);
			System.out.println(Integer.toBinaryString(currentIndex));
		}
	}
}

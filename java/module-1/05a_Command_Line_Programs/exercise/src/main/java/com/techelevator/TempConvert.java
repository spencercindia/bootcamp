package com.techelevator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("I will convert temp from Celsius to Fahrenheit or vice versa! ");
		System.out.println("What is the numerical value of the temp you want to convert? ");
		String tempInput = scanner.nextLine();
		System.out.println("And what is the type of temp? (C or F) ");
		String tempType = scanner.nextLine();

		double finalConversion = 0;
		String letterF = "F";
		String letterC = "C";
		boolean isCelsius = false;

		if (tempType.equals("C")) {
			finalConversion = ((Integer.parseInt(tempInput)-32)/1.8);
			isCelsius = true;
		} else {
			finalConversion = ((Integer.parseInt(tempInput)*1.8)+32);
		}
		if (isCelsius) {
			System.out.println(finalConversion + letterC + " is " + tempInput + letterF);
		} else {
			System.out.println(finalConversion + letterF + " is " + tempInput + letterC);
		}
	}

}

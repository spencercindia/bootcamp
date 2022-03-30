package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FizzBuzzMethods doTheWriting = new FizzBuzzMethods();

		System.out.println("Please enter the file you'd like to write this FizzBuzz exercise to.");
		File userFileChoice = new File(scanner.nextLine());

		doTheWriting.calculateWhileWritingToFile(userFileChoice);

	}

}

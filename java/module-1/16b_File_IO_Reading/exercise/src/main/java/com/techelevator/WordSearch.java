package com.techelevator;

import java.io.File;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class WordSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the file you'd like to scan: ");
		String userInput = scanner.nextLine();
		File userFile = new File(userInput);

		System.out.println("And enter the word you'd like to scan for: ");
		String userWordSearch = scanner.nextLine();
		System.out.println("Case sensitive? (Y or N) ");
		boolean caseSensitive = scanner.nextLine().equalsIgnoreCase("y") ? true : false;

		int lineCount = 1;
		try (Scanner dataInput = new Scanner(userFile);){
			while (dataInput.hasNextLine()) {
				String currentLine = dataInput.nextLine();
				if (caseSensitive){
					if (currentLine.contains(userWordSearch)) {
						System.out.println(lineCount + ") " + currentLine);
					}
				} else {
					String[] lineArray = currentLine.split(" ");
					for (int i = 0; i < lineArray.length; i++) {
						if (lineArray[i].equalsIgnoreCase(userWordSearch)){
							System.out.println(lineCount + ") " + currentLine);
						}
					}
				}
				lineCount++;
			}
		} catch (Exception e) {
			System.out.println("Sorry, I can't find that file path...");
		}


	}

}

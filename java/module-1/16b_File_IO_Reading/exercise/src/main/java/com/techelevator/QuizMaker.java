package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the file path to your quiz! ");
		File userQuizFilePath = new File(scanner.nextLine());

		int countPerLine = 0;

		try	(Scanner userQuizFile = new Scanner(userQuizFilePath)) {
			while (userQuizFile.hasNextLine()) {
				String currentLine = userQuizFile.nextLine();
				String[] currentLineArray = currentLine.split("\\|");

				int correctAnswerNumber = 1;

				System.out.println(currentLineArray[0]);
				for (int i = 1; i < currentLineArray.length; i++) {
					if (currentLineArray[i].contains("*")) {
						System.out.println(i + ". " + currentLineArray[i].substring(0, currentLineArray[i].length()-1));
						correctAnswerNumber = i;
					} else
						System.out.println(i + ". " + currentLineArray[i]);
				}
				System.out.println();
				String userAnswer = scanner.nextLine();
				try {
					if (Integer.parseInt(userAnswer) == correctAnswerNumber) {
						System.out.println("Your answer: " + userAnswer);
						System.out.println("Correct!");
					} else {
						System.out.println("Your answer: " + userAnswer);
						System.out.println("Incorrect :/");
					}
				} catch (Exception e) {
					System.out.println("Sorry, try answering just the answer number...");
				}
				System.out.println();
				countPerLine++;
			}
		} catch (Exception e) {
			System.out.println("Sorry, I can't follow that file path :/ ");
		}

	}

}

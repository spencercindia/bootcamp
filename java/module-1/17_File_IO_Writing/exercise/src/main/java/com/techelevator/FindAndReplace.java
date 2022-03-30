package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        WordReplacement myWordReplacer = new WordReplacement();

        System.out.println("Please enter the word you're searching for: ");
        String wordToFind = userScanner.nextLine();
        System.out.println("Now enter the word you'd like to replace it with: ");
        String replacementWord = userScanner.nextLine();
        System.out.println("Enter the file you'd like to search: ");
        File searchFile = new File(userScanner.nextLine());
        System.out.println("Lastly, enter the name of the file you'd like to write to: ");
        File writeFile = new File(userScanner.nextLine());

        try {
            writeFile.createNewFile();
        } catch (IOException e) {
            e.getMessage();
        }
        myWordReplacer.readingFrom_WhileWriting_ToFile(searchFile, writeFile, wordToFind, replacementWord);



    }

}

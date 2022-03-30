package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordReplacement {
//    public void createNewFile(File createFile) throws IOException {
//        if (createFile.exists()) {
//            System.out.println("Sorry, this file already exists.");
//        } else {
//            createFile.createNewFile();
//        }
//    }

    public void readingFrom_WhileWriting_ToFile(File inputFile, File outputFile,
                                                String wordToSearch, String wordToReplace) {

            try (Scanner dataInput = new Scanner(inputFile);
                 PrintWriter dataOutput = new PrintWriter(outputFile)) {
                while (dataInput.hasNextLine()) {
                    String lineInput = dataInput.nextLine();
                    dataOutput.println(lineInput.replace(wordToSearch, wordToReplace));
                }
            } catch (FileNotFoundException ex) {
                System.err.println("Cannot open this file for writing.");
            }
    }


}

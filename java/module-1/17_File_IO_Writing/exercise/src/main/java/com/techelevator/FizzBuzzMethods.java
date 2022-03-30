package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzBuzzMethods {
    public void calculateWhileWritingToFile(File fileToWriteTo) {
        int count = 1;
        try (PrintWriter myWriter = new PrintWriter(fileToWriteTo)) {
            while (count <= 300) {
                if (count % 3 == 0 && count % 5 == 0) {
                    myWriter.println("FizzBuzz");
                } else if (count % 3 == 0) {
                    myWriter.println("Fizz");
                } else if (count % 5 == 0) {
                    myWriter.println("Buzz");
                } else
                    myWriter.println(count);
                count++;
            }
        } catch (IOException ex) {
            System.out.println("Sorry, I can't write to that file.");
        }
    }
}

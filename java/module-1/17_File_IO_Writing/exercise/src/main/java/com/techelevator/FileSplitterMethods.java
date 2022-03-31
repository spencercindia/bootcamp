package com.techelevator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSplitterMethods {
    private long numLinesPerNewFile;

    public FileSplitterMethods(){}

    public FileSplitterMethods(int numLinesPerNewFile){
        this.numLinesPerNewFile = numLinesPerNewFile;
    }

    public long findLinesInFile(File inputFile) throws IOException {
        Path path = Paths.get(inputFile);
        long lines = 0;
        try {
            lines = Files.lines(path).count();
        } catch (IOException exception) {
            System.err.println("Couldn't count lines in input file.");
        }
        return lines;
    }

    public void generator(File inputFile, File outputFile, long numLinesPerNewFile) {
        try (Scanner dataInput = new Scanner(inputFile);
             PrintWriter dataOutput) {

            int fileCount = 1;
            int count = 1;
            while (dataInput.hasNextLine()) {
                 dataOutput = new PrintWriter(outputFile + "-" + fileCount);
                String oneLine = dataInput.nextLine();
                dataOutput.println();
                count++;
                if (count == numLinesPerNewFile) {
                    count = 1;
                    fileCount++;
                }
            }
        } catch (FileNotFoundException exception){
            exception.getMessage();
        }
    }
}

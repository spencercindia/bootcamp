package com.techelevator;

import java.io.*;

public class FileTestingClass {

    public void createFile(File thisHereFile) throws IOException {

        if (thisHereFile.exists()) {
            System.out.println("File Name: " + thisHereFile.getName());
            System.out.println("Absolute Path: " + thisHereFile.getAbsolutePath());
            System.out.println("Writeable: " + thisHereFile.canWrite());
            System.out.println("Readable: " + thisHereFile.canRead());
            System.out.println("File Size in Bytes: " + thisHereFile.length());
        } else {
            System.out.println("This file does not exist, so I'm gonna create it.");
            thisHereFile.createNewFile();
        }

    }
    public void writeSomeDataToAFile(File thisHereFile, String someData) throws FileNotFoundException {
        try	(PrintWriter drake = new PrintWriter(thisHereFile);){
            drake.print(someData);
        }
    }
    public void appendToFile(File file, String data) throws FileNotFoundException {
        FileOutputStream stream = new FileOutputStream(file, true);
        try (PrintWriter writer = new PrintWriter(stream);) {
            writer.print(data);
        }

    }
}

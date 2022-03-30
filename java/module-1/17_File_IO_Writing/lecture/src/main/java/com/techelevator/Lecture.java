package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */
		File thisHereFile = new File("wagner.txt");

		String someData = "this is the first line of text\nand this is here too?";

//		if (thisHereFile.exists()) {
//			System.out.println("File Name: " + thisHereFile.getName());
//			System.out.println("Absolute Path: " + thisHereFile.getAbsolutePath());
//			System.out.println("Writeable: " + thisHereFile.canWrite());
//			System.out.println("Readable: " + thisHereFile.canRead());
//			System.out.println("File Size in Bytes: " + thisHereFile.length());
//		} else {
//			System.out.println("This file does not exist, so I'm gonna create it.");
//			thisHereFile.createNewFile();
//		}
		String appendData = "\nmake this go on the end";
		FileTestingClass ftc = new FileTestingClass();
		try {
			ftc.createFile(thisHereFile);
			ftc.writeSomeDataToAFile(thisHereFile, someData);
			ftc.appendToFile(thisHereFile, appendData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();
		}




//
//		File newDirectory = new File("myDirectory");
//
//		if (newDirectory.exists()) {
//			System.out.println("Directory already exists.");
//		} else {
//			newDirectory.mkdir();
//		}

	}

}

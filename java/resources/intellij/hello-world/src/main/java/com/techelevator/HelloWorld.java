package com.techelevator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println(frontTimes("Abc", 3));

    }

    public static String middleTwo(String str) {
        int middle = str.length()/2;
        return  str.substring(middle - 1, middle +1);
    }

    /*
 Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
 whatever is there if the string is less than length 3. Return n copies of the front;
 frontTimes("Chocolate", 2) → "ChoCho"
 frontTimes("Chocolate", 3) → "ChoChoCho"
 frontTimes("Abc", 3) → "AbcAbcAbc"
 frontTimes("Abc", 3) → "AbcAbcAbc"
 frontTimes("", 3) → ""
 */
    public static String frontTimes(String str, int n) {
        String subString = "";

        if(str.length() < 3){
            subString = str.substring(0);
            return getString(n, subString);

        } else{
            subString = str.substring(0,3);
            return getString(n, subString);
        }

    }

    private static String getString(int n, String firstThree) {
        String newString ="";

        for(int i = 0; i < n; i++){
             newString += firstThree;
        }
        return newString;
    }

}

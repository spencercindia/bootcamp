package com.techelevator;

public class GradeBook {

    public String calculateLetterGrade(int score){
        if (score < 60){
            return "F";
        }
        if (score >= 60 && score < 70){
            return "D";
        } else if (score >= 70 && score < 80){
            return  "C";
        } else if (score >= 80 && score < 90){
            return "B";
        }else if (score >= 90){
            return "A";
        } else
            return "Invalid entry";
    }
}

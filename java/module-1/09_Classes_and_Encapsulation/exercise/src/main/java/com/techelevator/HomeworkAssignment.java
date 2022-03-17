package com.techelevator;

public class HomeworkAssignment {
    public int earnedMarks;
    public int possibleMarks;
    public String submitterName;
    public String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.submitterName = submitterName;
        this.possibleMarks = possibleMarks;
    }

    public void findLetterGrade(){

    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        double gradePercentage = earnedMarks*100 / possibleMarks;
        if (gradePercentage >= 90){
            this.letterGrade = "A";
        } else if (gradePercentage >= 80){
            this.letterGrade = "B";
        } else if (gradePercentage >= 70){
            this.letterGrade = "C";
        } else if (gradePercentage >= 60){
            this.letterGrade = "D";
        } else if (gradePercentage < 59){
            this.letterGrade = "F";
        } else {
            this.letterGrade = "";
        }
        return letterGrade;
    }
}

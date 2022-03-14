package com.techelevator;

public class TechElevatorEmployee {
    String name;
    String position;
    int tenure;

    public void teach(){
        Lecture myLecture = new Lecture("Objects & Classes", 90);
        Lecture myOtherLecture = new Lecture();

        int[] a = new int[1];
        String aString = "Some string I came up with";
        System.out.println(aString.length());
        System.out.println(a.length);


        myLecture.getLectureDurationInMinutes();
        aString.length();
    }

}

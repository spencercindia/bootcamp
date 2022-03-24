package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeBookTest {
    GradeBook myGradebook = new GradeBook();
    @Before
    public void setUd(){
        System.out.println("Setting our test up");
    }
    @After
    public void tearDown(){
        System.out.println("Tearing our test down");
    }
    @Test
    public void scoreOf90ShouldReturnAnAGrade(){
        //Arange
        int ninetyScore = 90;
        GradeBook gradeBook = new GradeBook();
        String expected = "A";
        //Act
        String actual = gradeBook.calculateLetterGrade(ninetyScore);

        //Assert
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void aScoreOf59ShouldReturnAnFGrade(){
        //Arrange

        String expected = "F";
        int fiftyNineScore = 59;

        //Act
        String actual = myGradebook.calculateLetterGrade(fiftyNineScore);

        //Assert
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void aGradeOfSixtyShouldReturnDGrade(){
        int sixtyScore = 60;
        String expected = "D";

        String actual = myGradebook.calculateLetterGrade(sixtyScore);

        Assert.assertEquals(expected, actual);
    }
}
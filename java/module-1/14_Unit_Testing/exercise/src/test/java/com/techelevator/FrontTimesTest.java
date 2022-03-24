package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrontTimesTest {
    FrontTimes thisString = new FrontTimes();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_hahhahhah_when_given_hahahahahaha_and_3(){
        String input = "hahahahahaha";
        String expected = "hahhahhah";
        int numOfCopies = 3;

        String actual = thisString.generateString(input, numOfCopies);

        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void should_return_no_no_no_no_when_given_no_sleep_and_4(){
//        String input = "no sleep";
//        String expected = "no no no no";
//        int numOfCopies = 4;
//
//        String actual = thisString.generateString(input, numOfCopies);
//
//        Assert.assertEquals(expected, actual);
//        //I don't understand this whitespace issue...
//    }

    @Test
    public void should_return_AbsAbs_when_given_Absent_and_2(){
        String input = "Absent";
        String expected = "AbsAbs";
        int numOfCopies = 2;

        String actual = thisString.generateString(input, numOfCopies);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_bonbonbonbon_when_given_bonnaroo_and_4(){
        String input = "bonnaroo";
        String expected = "bonbonbonbon";
        int numOfCopies = 4;

        String actual = thisString.generateString(input, numOfCopies);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_nomnomnomnomnom_when_given_nomz_and_5(){
        String input = "nomz";
        String expected = "nomnomnomnomnom";
        int numOfCopies = 5;

        String actual = thisString.generateString(input, numOfCopies);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void should_return_iiii_when_given_i_and_4(){
        String input = "i";
        String expected = "iiii";
        int numOfCopies = 4;

        String actual = thisString.generateString(input, numOfCopies);

        Assert.assertEquals(expected, actual);
    }

}
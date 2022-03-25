package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {
    SameFirstLast checkThese = new SameFirstLast();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_true_if_given_2_4_1_2(){
        int[] inputArray = new int[] { 2, 4, 1 ,2 };
        boolean expected = true;

        boolean actual = checkThese.isItTheSame(inputArray);

        Assert.assertTrue(actual);
    }
    @Test
    public void should_return_false_if_given_3_3_3_2(){
        int[] inputArray = new int[] { 3, 3, 3 ,2 };
        boolean expected = false;

        boolean actual = checkThese.isItTheSame(inputArray);

        Assert.assertFalse(actual);
    }

    @Test
    public void should_return_true_if_given_1_1(){
        int[] inputArray = new int[] { 1, 1, };
        boolean expected = true;

        boolean actual = checkThese.isItTheSame(inputArray);

        Assert.assertTrue(actual);
    }

    @Test
    public void should_return_true_if_given_9(){
        int[] inputArray = new int[] { 9 };
        boolean expected = true;

        boolean actual = checkThese.isItTheSame(inputArray);

        Assert.assertTrue(actual);
    }

    @Test
    public void should_return_true_if_given_20_5_8_9_7_20(){
        int[] inputArray = new int[] { 20, 5, 8, 9, 7, 20 };
        boolean expected = true;

        boolean actual = checkThese.isItTheSame(inputArray);

        Assert.assertTrue(actual);
    }

}
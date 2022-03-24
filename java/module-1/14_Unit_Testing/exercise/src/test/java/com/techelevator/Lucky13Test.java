package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Lucky13Test {
    Lucky13 my1And3Checker =new Lucky13();
    int[] inputArray;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_true_if_2_5_4_7(){
        inputArray = new int[]{2, 5, 4, 7};
        boolean expected = true;

        boolean actual = my1And3Checker.getLucky(inputArray);

        Assert.assertTrue(actual);

    }

    @Test
    public void should_return_true_if_13_5_11_33(){
        inputArray = new int[]{13, 5, 11, 33};
        boolean expected = true;

        boolean actual = my1And3Checker.getLucky(inputArray);

        Assert.assertTrue(actual);

    }

    @Test
    public void should_return_false_if_11_2_33_3(){
        inputArray = new int[]{11, 2, 33, 3};
        boolean expected = false;

        boolean actual = my1And3Checker.getLucky(inputArray);

        Assert.assertFalse(actual);

    }


}
package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {
    MaxEnd3 checkArray = new MaxEnd3();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_5_5_5(){
        int[] inputArray = new int[]{ 1, 1, 5 };
        int[] expected = new int[]{ 5, 5, 5 };

        int[] actual = checkArray.makeArray(inputArray);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void should_return_8_8_8(){
        int[] inputArray = new int[]{ 6, 10, 8 };
        int[] expected = new int[]{ 8, 8, 8 };

        int[] actual = checkArray.makeArray(inputArray);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void should_return_299_299_299(){
        int[] inputArray = new int[]{ 298, 300, 299 };
        int[] expected = new int[]{ 299, 299, 299 };

        int[] actual = checkArray.makeArray(inputArray);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void should_return_1_1_1(){
        int[] inputArray = new int[]{ 1, -4, 1 };
        int[] expected = new int[]{ 1, 1, 1 };

        int[] actual = checkArray.makeArray(inputArray);

        Assert.assertArrayEquals(expected, actual);
    }

}
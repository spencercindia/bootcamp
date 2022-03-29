package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Less20Test {
    Less20 doMaths = new Less20();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_true_if_59(){
        int myinput = 59;
        boolean expected = true;

        boolean actual = doMaths.isLessThanMultipleOf20(myinput);

        Assert.assertTrue(actual);
    }


    @Test
    public void should_return_true_if_419(){
        int myinput = 419;
        boolean expected = true;

        boolean actual = doMaths.isLessThanMultipleOf20(myinput);

        Assert.assertTrue(actual);
    }

    @Test
    public void should_return_true_if_78(){
        int myinput = 78;
        boolean expected = true;

        boolean actual = doMaths.isLessThanMultipleOf20(myinput);

        Assert.assertTrue(actual);
    }

    @Test
    public void should_return_true_if_118(){
        int myinput = 118;
        boolean expected = true;

        boolean actual = doMaths.isLessThanMultipleOf20(myinput);

        Assert.assertTrue(actual);
    }

    @Test
    public void should_return_false_if_80(){
        int myinput = 80;
        boolean expected = false;

        boolean actual = doMaths.isLessThanMultipleOf20(myinput);

        Assert.assertFalse(actual);
    }

    @Test
    public void should_return_false_if_95(){
        int myinput = 95;
        boolean expected = false;

        boolean actual = doMaths.isLessThanMultipleOf20(myinput);

        Assert.assertFalse(actual);
    }

    @Test
    public void should_return_false_if_negative_19(){
        int myinput = -19;
        boolean expected = false;

        boolean actual = doMaths.isLessThanMultipleOf20(myinput);

        Assert.assertFalse(actual);
    }
    @Test
    public void should_return_false_if_21(){
        int myinput = 21;
        boolean expected = false;

        boolean actual = doMaths.isLessThanMultipleOf20(myinput);

        Assert.assertFalse(actual);
    }
}
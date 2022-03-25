package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {
    StringBits mysteryString = new StringBits();
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_gronk_when_given_giryohnsk(){
        String inputString = "giryohnsk";
        String expected = "gronk";

        String actual = mysteryString.getBits(inputString);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_b_when_given_be(){
        String inputString = "be";
        String expected = "b";

        String actual = mysteryString.getBits(inputString);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_Dr_when_given_Der(){
        String inputString = "Der";
        String expected = "Dr";

        String actual = mysteryString.getBits(inputString);

        Assert.assertEquals(expected, actual);
    }

}
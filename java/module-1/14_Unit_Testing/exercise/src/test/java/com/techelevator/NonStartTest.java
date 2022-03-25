package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonStartTest {
    NonStart myString = new NonStart();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_echlevator_when_given_Tech_Elevator(){
        String inputString1 = "Tech";
        String inputString2 = "Elevator";

        String expected = "echlevator";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_ewslash_when_given_news_flash(){
        String inputString1 = "news";
        String inputString2 = "flash";

        String expected = "ewslash";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_nainbows_when_given_In_Rainbows(){
        String inputString1 = "In";
        String inputString2 = "Rainbows";

        String expected = "nainbows";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_empty_string_when_given_i_o(){
        String inputString1 = "i";
        String inputString2 = "o";

        String expected = "";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_empty_string_when_given_null(){
        String inputString1 = null;
        String inputString2 = null;

        String expected = "";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_oops_when_given_null_and_woops(){
        String inputString1 = null;
        String inputString2 = "woops";

        String expected = "oops";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_loink_when_given_bloink_and_null(){
        String inputString1 = "bloink";
        String inputString2 = null;

        String expected = "loink";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_ittle_when_given_a_little(){
        String inputString1 = "a";
        String inputString2 = "little";

        String expected = "ittle";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_ushin_when_given_pushin_p(){
        String inputString1 = "pushin";
        String inputString2 = "p";

        String expected = "ushin";

        String actual = myString.getPartialString(inputString1, inputString2);

        Assert.assertEquals(expected, actual);
    }

}
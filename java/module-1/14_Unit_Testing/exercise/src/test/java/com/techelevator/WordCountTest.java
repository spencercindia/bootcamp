package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {
    WordCount getCount = new WordCount();
    Map<String, Integer> getValues;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_hi_2_bye_2_okay_1(){
        Map<String, Integer> wordCountPairs = new HashMap<>();
        getValues = getCount.getCount(new String[] {"hi", "bye", "okay", "hi", "bye"});
        Assert.assertEquals(getValues.size(), 3);
        Assert.assertEquals(getValues.get("okay").intValue(), 1);
        Assert.assertEquals(getValues.get("hi").intValue(), 2);
        Assert.assertEquals(getValues.get("bye").intValue(), 2);
    }

    @Test
    public void should_return_ed_1_edd_1_eddy_1(){
        Map<String, Integer> wordCountPairs = new HashMap<>();
        getValues = getCount.getCount(new String[] {"ed", "edd", "eddy"});
        Assert.assertEquals(getValues.size(), 3);
        Assert.assertEquals(getValues.get("ed").intValue(), 1);
    }

    @Test
    public void should_return_empty_but_still_pass(){
        Map<String, Integer> wordCountPairs = new HashMap<>();
        getValues = getCount.getCount(new String[] {});
        Assert.assertEquals(getValues.size(), 0);
    }

    @Test
    public void should_fail_if_case_sensitive(){
        Map<String, Integer> wordCountPairs = new HashMap<>();
        getValues = getCount.getCount(new String[] {"bob", "Bob"});
        Assert.assertNotEquals(getValues.get("bob").intValue(), 2);
    }

}
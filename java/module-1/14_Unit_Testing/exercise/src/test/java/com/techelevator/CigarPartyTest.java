package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CigarPartyTest {
    CigarParty cigarParty = new CigarParty();
    private boolean weekDay = false;
    private boolean weekend = true;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

   @Test
    public void haveParty_should_return_true_when_there_are_50_cigars_on_weekday(){
        int numOfCigars = 50;

        boolean result = cigarParty.haveParty(numOfCigars, weekDay);

       Assert.assertTrue(result);
   }

   @Test
    public void haveParty_should_return_true_when_there_are_100_cigars_on_weekend(){
        int numOfCigars = 100;

        boolean result = cigarParty.haveParty(numOfCigars, weekend);

       Assert.assertTrue(result);
   }

   @Test
    public void haveParty_should_return_false_when_cigars_above_60_on_weekday(){
        int numOfCigars = 61;

        boolean result = cigarParty.haveParty(numOfCigars, weekDay);

        Assert.assertFalse(result);
   }

   @Test
    public void haveParty_should_return_false_when_cigars_below_40_on_weekday(){
        int numOfCigars = 39;

        boolean result = cigarParty.haveParty(numOfCigars, weekDay);

        Assert.assertFalse(result);
   }
}
package com.techelevator.farm.finance;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AdmissionTicketTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void price_should_be_1599_when_the_age_is_18(){
        int age = 18;
        BigDecimal expected = new BigDecimal("15.99");
        AdmissionTicket ticket = new AdmissionTicket(age);
        String message = "Because once you're 18 you're grown";

        BigDecimal actual = ticket.getPrice();

        Assert.assertEquals(message, expected, actual);
    }

    @Test
    public void price_should_be_999_when_age_is_10(){
        int age = 10;
        BigDecimal expected = new BigDecimal("9.99");
        AdmissionTicket ticket = new AdmissionTicket(age);
        String message = "Because when you're 10 you're smol";

        BigDecimal actual = ticket.getPrice();

        Assert.assertEquals(message, expected, actual);
    }
}
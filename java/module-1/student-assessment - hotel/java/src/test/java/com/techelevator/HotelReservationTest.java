package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class HotelReservationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void to_string_should_return_Spencer_5999(){
        HotelReservation testReservation = new HotelReservation("Spencer", 1);

        String expected = "RESERVATION - Spencer - $59.99";
        String actual = testReservation.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void to_string_should_return_wallace_23996(){
        HotelReservation testReservation = new HotelReservation("wallace", 4);

        String expected = "RESERVATION - wallace - $239.96";
        String actual = testReservation.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void actual_total_should_return_20295(){
        HotelReservation testReservation = new HotelReservation("Barry", 2);

        BigDecimal expected = new BigDecimal("202.95");
        BigDecimal actual = testReservation.getActualTotal(true, true);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void actual_total_should_return_15497(){
        HotelReservation testReservation = new HotelReservation("meowth", 2);

        BigDecimal expected = new BigDecimal("154.97");
        BigDecimal actual = testReservation.getActualTotal(true, false);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void actual_total_should_return_13297(){
        HotelReservation testReservation = new HotelReservation("daryl", 2);

        BigDecimal expected = new BigDecimal("132.97");
        BigDecimal actual = testReservation.getActualTotal(false, true);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void actual_total_should_return_11998(){
        HotelReservation testReservation = new HotelReservation("Boz", 2);

        BigDecimal expected = new BigDecimal("119.98");
        BigDecimal actual = testReservation.getActualTotal(false, false);

        Assert.assertEquals(expected, actual);
    }
}
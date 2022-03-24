package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateFashionTest {
    DateFashion goOnDate = new DateFashion();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getTable_should_return_2_if_given_3_and_8(){
        int you = 8;
        int yourDate = 3;

        int expected = 2;

        int actual = goOnDate.getATable(you, yourDate);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTable_should_return_1_if_given_3_and_7(){
        int you = 7;
        int yourDate = 3;

        int expected = 1;

        int actual = goOnDate.getATable(you, yourDate);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTable_should_return_0_if_given_2_and_7(){
        int you = 7;
        int yourDate = 2;

        int expected = 0;

        int actual = goOnDate.getATable(you, yourDate);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTable_should_return_0_if_given_2_and_8(){
        int you = 8;
        int yourDate = 2;

        int expected = 0;

        int actual = goOnDate.getATable(you, yourDate);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTable_should_return_2_if_given_8_and_8(){
        int you = 8;
        int yourDate = 8;

        int expected = 2;

        int actual = goOnDate.getATable(you, yourDate);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTable_should_return_1_if_given_4_and_7(){
        int you = 4;
        int yourDate = 7;

        int expected = 1;

        int actual = goOnDate.getATable(you, yourDate);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTable_should_return_2_if_given_6_and_10(){
        int you = 6;
        int yourDate = 10;

        int expected = 2;

        int actual = goOnDate.getATable(you, yourDate);

        Assert.assertEquals(expected, actual);
    }

}
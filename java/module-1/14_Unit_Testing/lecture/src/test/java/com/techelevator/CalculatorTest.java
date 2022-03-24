package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void runThisBeforeMyTest(){
        System.out.println("We're just practicing using before");
    }
    @After
    public void runThisAfterMyTest(){
        System.out.println("We're practicing using after");
    }
    @Test
    public void addsTwoPlusTwoAndReturnsFour(){
        //Arrange
        Calculator myCalc = new Calculator();
        int numberToAdd = 2;
        int expected = 4;

        //Act
        int actual = myCalc.add2Numbers(numberToAdd, numberToAdd);

        //Assert
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTwoTripleDigitNumbers(){
        Calculator calc = new Calculator();
        int numOne = 100;
        int numTwo = 200;
        int expected = 300;

        int actual = calc.add2Numbers(numOne, numTwo);

        Assert.assertEquals(expected, actual);
    }

}
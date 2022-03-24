package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGroupNameTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down");
    }

    @Test
    public void getHerd_Giraffe_should_return_tower(){
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animal = "Giraffe";
        String expected = "Tower";

        String actual = animalGroupName.getHerd(animal);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_elephant_should_return_Herd_case_insensitive(){
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animal = "elEphAnt";
        String expected = "Herd";

        String actual = animalGroupName.getHerd(animal);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_unknown_when_given_random_word(){
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String randomString = "borbie";
        String expected = "unknown";

        String actual = animalGroupName.getHerd(randomString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_unknown_if_sent_null(){
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String _null = null;
        String expected = "unknown";

        String actual = animalGroupName.getHerd(_null);

        Assert.assertEquals(expected, actual);
    }
}
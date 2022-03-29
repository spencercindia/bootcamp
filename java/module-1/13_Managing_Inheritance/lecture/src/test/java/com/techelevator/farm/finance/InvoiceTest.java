package com.techelevator.farm.finance;

import com.techelevator.farm.food.Egg;
import com.techelevator.farm.interfaces.Sellable;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class InvoiceTest {
    Invoice invoice = new Invoice();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stuff_in_cart_is_in_cart(){
        AdmissionTicket admissionTicket = new AdmissionTicket(20);
        AdmissionTicket admissionTicket2 = new AdmissionTicket(20);

        invoice.addToCart(new Egg(), 5);
        invoice.addToCart(admissionTicket, 2);
        invoice.addToCart(admissionTicket2, 1);

        Assert.assertEquals((Integer) 2, invoice.cart.get(admissionTicket));
    }
}
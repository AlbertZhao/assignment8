package com.zhaoshijie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculationTest {

    private Calculation calculation;


    @Before
    public void setUp() throws Exception {
        calculation = new Calculation();
    }

    @Test
    public void addTest() {
       int result =  calculation.add(1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void subTest() {
        int result = calculation.sub(5, 2);
        Assert.assertEquals(3, result);
    }
}

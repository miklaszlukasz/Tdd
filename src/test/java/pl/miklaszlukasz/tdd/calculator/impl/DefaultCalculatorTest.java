package pl.miklaszlukasz.tdd.calculator.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by SI-Ecommerce on 06.02.2017.
 */
public class DefaultCalculatorTest {

    private DefaultCalculator calculator;

    @Before
    public void createCalculator() {
        calculator = new DefaultCalculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(4, calculator.add(1, 3), 0);
        Assert.assertEquals(2, calculator.add(-1, 3), 0);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2, calculator.divide(4, 2), 0);
        Assert.assertEquals(0, calculator.divide(0, 2), 0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(2, 0);
    }
}
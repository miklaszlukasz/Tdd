package pl.miklaszlukasz.tdd.calculator.impl;

import pl.miklaszlukasz.tdd.calculator.Calculator;

/**
 * Created by lukaszmiklasz on 06.02.2017.
 */
public class DefaultCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        return a/b;
    }
}

package pl.miklaszlukasz.tdd.calculator.impl;

import pl.miklaszlukasz.tdd.calculator.Calculator;

public class DefaultCalculator implements Calculator {
    @Override
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double divide(double dividend, double divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Argument divisor is 0");
        return dividend/divisor;
    }
}

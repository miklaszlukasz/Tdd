package pl.miklaszlukasz.tdd.calculator.impl;

import pl.miklaszlukasz.tdd.calculator.Calculator;

public class DefaultCalculator implements Calculator {
    @Override
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double divide(double number, double divider) {
        if (divider == 0)
            throw new IllegalArgumentException("Argument divider is 0");
        return number/divider;
    }
}

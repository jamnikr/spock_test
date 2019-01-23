package com.learn.calculator;

public class Calculator {

    //private final ShippingCalculator shippingCalculator;

    long calculate(CalculatorParameters calculatorParameters) {

        Integer minValue = calculatorParameters.getSales().stream().min(Integer::compareTo).orElseThrow(IllegalArgumentException::new);
        Integer sum = calculatorParameters.getStocks().stream().reduce(0, Integer::sum);

        return minValue * calculatorParameters.getMagicalParameter() + sum * calculatorParameters.getSuperMagicParameter();
    }
}

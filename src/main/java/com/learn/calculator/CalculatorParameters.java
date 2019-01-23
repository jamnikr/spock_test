package com.learn.calculator;

import java.util.List;

public class CalculatorParameters {

    private final List<Integer> sales;

    private final List<Integer> stocks;

    private final Integer magicalParameter;

    private final Integer superMagicParameter;

    private final List<Integer> unusedValues;

    //private final Integer productId;

    public CalculatorParameters(List<Integer> sales, List<Integer> stocks, Integer magicalParameter, Integer superMagicParameter, List<Integer> unusedValues) {
        this.sales = sales;
        this.stocks = stocks;
        this.magicalParameter = magicalParameter;
        this.superMagicParameter = superMagicParameter;
        this.unusedValues = unusedValues;
    }

    public List<Integer> getSales() {
        return sales;
    }

    public List<Integer> getStocks() {
        return stocks;
    }

    public Integer getMagicalParameter() {
        return magicalParameter;
    }

    public Integer getSuperMagicParameter() {
        return superMagicParameter;
    }

    public List<Integer> getUnusedValues() {
        return unusedValues;
    }
}

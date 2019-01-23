package com.learn.calculator

import spock.lang.Specification

class CalculatorTest extends Specification {

    def "calculator test"() {
        given: "calculator parameters"
        Calculator calculator = new Calculator()
        CalculatorParameters calculatorParameters = Stub()
        calculatorParameters.getMagicalParameter() >> 1
        calculatorParameters.getSales() >> [1,2,3]
        calculatorParameters.getStocks() >> [2,3]
        calculatorParameters.getSuperMagicParameter() >> 2

        when: "calculate"
        double calculatedValue = calculator.calculate(calculatorParameters)

        then: "calculated value is 12"
        calculatedValue == 12
    }

    def "calculator test with value set"(){



    }
}

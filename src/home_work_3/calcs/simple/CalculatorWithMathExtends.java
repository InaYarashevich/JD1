package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double power(double number, int exponent) {
        return Math.pow(number, exponent);
    }

    public double absoluteValue(double number) {
        return Math.abs(number);
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}

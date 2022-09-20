package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

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

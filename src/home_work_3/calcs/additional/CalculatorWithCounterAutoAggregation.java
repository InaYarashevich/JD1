package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAggregation {
    private CalculatorWithMathCopy calculator;
    private long count;

    public CalculatorWithCounterAutoAggregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public double subtract(double x, double y) {
        incrementCountOperation();
        return calculator.subtract(x, y);
    }

    public double multiply(double x, double y) {
        incrementCountOperation();
        return calculator.multiply(x, y);
    }

    public double add(double x, double y) {
        incrementCountOperation();
        return calculator.add(x, y);
    }

    public double divide(double x, double y) {
        incrementCountOperation();
        return calculator.divide(x, y);
    }

    public double power(double number, int exponent) {
        incrementCountOperation();
        return calculator.power(number, exponent);
    }

    public double absoluteValue(double number) {
        incrementCountOperation();
        return calculator.absoluteValue(number);
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        return calculator.squareRoot(number);
    }

    private void incrementCountOperation() {
        incrementCountOperation(1);
    }

    private void incrementCountOperation(int count) {
        this.count += count;
    }

    public long getCountOperation() {
        return this.count;
    }
}

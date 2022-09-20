package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
    private long count;

    public long getCountOperations() {
        return count;
    }

    public double subtract(double x, double y) {
        count++;
        return calculator.subtract(x, y);
    }

    public double multiply(double x, double y) {
        count++;
        return calculator.multiply(x, y);
    }

    public double add(double x, double y) {
        count++;
        return calculator.add(x, y);
    }

    public double divide(double x, double y) {
        count++;
        return calculator.divide(x, y);
    }

    public double power(double number, int exponent) {
        count++;
        return calculator.power(number, exponent);
    }

    public double absoluteValue(double number) {
        count++;
        return calculator.absoluteValue(number);
    }

    public double squareRoot(double number) {
        count++;
        return calculator.squareRoot(number);
    }
}

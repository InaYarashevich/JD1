package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count;

    public long getCountOperation() {
        return count;
    }

    public double subtract(double x, double y) {
        count++;
        return super.subtract(x, y);
    }

    public double multiply(double x, double y) {
        count++;
        return super.multiply(x, y);
    }

    public double add(double x, double y) {
        count++;
        return super.add(x, y);
    }

    public double divide(double x, double y) {
        count++;
        return super.divide(x, y);
    }

    public double power(double number, int exponent) {
        count++;
        return Math.pow(number, exponent);
    }

    public double absoluteValue(double number) {
        count++;
        return super.absoluteValue(number);
    }

    public double squareRoot(double number) {
        count++;
        return super.squareRoot(number);
    }
}

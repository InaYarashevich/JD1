package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAggregation {
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;
    private long count;

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator calculator1) {
        this.calculator1 = calculator1;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy calculator2) {
        this.calculator2 = calculator2;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends calculator3) {
        this.calculator3 = calculator3;
    }

    public long getCountOperation() {
        return count;
    }

    public double subtract1(double x, double y) {
        count++;
        return calculator1.subtract(x, y);
    }

    public double multiply1(double x, double y) {
        count++;
        return calculator1.multiply(x, y);
    }

    public double add1(double x, double y) {
        count++;
        return calculator1.add(x, y);
    }

    public double divide1(double x, double y) {
        count++;
        return calculator1.divide(x, y);
    }

    public double power1(double number, int exponent) {
        count++;
        return calculator1.power(number, exponent);
    }

    public double absoluteValue1(double number) {
        count++;
        return calculator1.absoluteValue(number);
    }

    public double squareRoot1(double number) {
        count++;
        return calculator1.squareRoot(number);
    }

    public double subtract2(double x, double y) {
        count++;
        return calculator2.subtract(x, y);
    }

    public double multiply2(double x, double y) {
        count++;
        return calculator2.multiply(x, y);
    }

    public double add2(double x, double y) {
        count++;
        return calculator2.add(x, y);
    }

    public double divide2(double x, double y) {
        count++;
        return calculator2.divide(x, y);
    }

    public double power2(double number, int exponent) {
        count++;
        return calculator2.power(number, exponent);
    }

    public double absoluteValue2(double number) {
        count++;
        return calculator2.absoluteValue(number);
    }

    public double squareRoot2(double number) {
        count++;
        return calculator2.squareRoot(number);
    }

    public double subtract3(double x, double y) {
        count++;
        return calculator3.subtract(x, y);
    }

    public double multiply3(double x, double y) {
        count++;
        return calculator3.multiply(x, y);
    }

    public double add3(double x, double y) {
        count++;
        return calculator3.add(x, y);
    }

    public double divide3(double x, double y) {
        count++;
        return calculator3.divide(x, y);
    }

    public double power3(double number, int exponent) {
        count++;
        return calculator3.power(number, exponent);
    }

    public double absoluteValue3(double number) {
        count++;
        return calculator3.absoluteValue(number);
    }

    public double squareRoot3(double number) {
        count++;
        return calculator3.squareRoot(number);
    }
}

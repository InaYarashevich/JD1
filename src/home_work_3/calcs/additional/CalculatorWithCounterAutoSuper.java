package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int count;

    @Override
    public double power(double a, int b) {
        incrementCountOperation();
        return super.power(a, b);
    }

    @Override
    public double absoluteValue(double a) {
        incrementCountOperation();
        return super.absoluteValue(a);
    }

    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return super.squareRoot(a);
    }

    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        incrementCountOperation();
        return super.subtract(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    private void incrementCountOperation(){
        incrementCountOperation(1);
    }

    private void incrementCountOperation(int count){
        this.count += count;
    }

    public long getCountOperation(){
        return this.count;
    }
}
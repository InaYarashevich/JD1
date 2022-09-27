package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calc;
    private int count;

    public CalculatorWithCounterAutoComposite() {
        this.calc = new CalculatorWithMathCopy();
    }

    public double add(double a, double b){
        incrementCountOperation();
        return this.calc.add(a, b);
    }

    public double subtract(double a, double b){
        incrementCountOperation();
        return this.calc.subtract(a, b);
    }

    public double multiply(double a, double b){
        incrementCountOperation();
        return this.calc.multiply(a, b);
    }

    public double divide(double a, double b){
        incrementCountOperation();
        return this.calc.divide(a, b);
    }

    public double power(double a, int b){
        incrementCountOperation();
        return this.calc.power(a, b);
    }

    public double absoluteValue(double a){
        incrementCountOperation();
        return this.calc.absoluteValue(a);
    }

    public double squareRoot(double a){
        incrementCountOperation();
        return this.calc.squareRoot(a);
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

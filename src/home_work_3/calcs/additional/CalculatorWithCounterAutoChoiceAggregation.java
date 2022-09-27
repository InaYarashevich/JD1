package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAggregation {
    private int count;
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator calc){
        this.calc1 = calc;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy calc){
        this.calc2 = calc;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends calc){
        this.calc3 = calc;
    }

    public double add(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.add(a, b);
        } else if(this.calc2 != null){
            return this.calc2.add(a, b);
        } else {
            return this.calc3.add(a, b);
        }
    }

    public double subtract(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.subtract(a, b);
        } else if(this.calc2 != null){
            return this.calc2.subtract(a, b);
        } else {
            return this.calc3.subtract(a, b);
        }
    }

    public double multiply(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.multiply(a, b);
        } else if(this.calc2 != null){
            return this.calc2.multiply(a, b);
        } else {
            return this.calc3.multiply(a, b);
        }
    }

    public double divide(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.divide(a, b);
        } else if(this.calc2 != null){
            return this.calc2.divide(a, b);
        } else {
            return this.calc3.divide(a, b);
        }
    }

    public double power(double a, int b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.power(a, b);
        } else if(this.calc2 != null){
            return this.calc2.power(a, b);
        } else {
            return this.calc3.power(a, b);
        }
    }

    public double absoluteValue(double a){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.absoluteValue(a);
        } else if(this.calc2 != null){
            return this.calc2.absoluteValue(a);
        } else {
            return this.calc3.absoluteValue(a);
        }
    }

    public double squareRoot(double a){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.squareRoot(a);
        } else if(this.calc2 != null){
            return this.calc2.squareRoot(a);
        } else {
            return this.calc3.squareRoot(a);
        }
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

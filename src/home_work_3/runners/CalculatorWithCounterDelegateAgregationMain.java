package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregation;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAggregation calculator =
                new CalculatorWithCounterAutoAggregation(new CalculatorWithMathCopy());

        double resultFinal = calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                calculator.power(calculator.divide(28.0, 5), 2))));

        System.out.println("Результат выражения = " + resultFinal);
        System.out.println("Количество использований данного калькулятора = "
                + calculator.getCountOperation());
    }
}

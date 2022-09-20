package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAggregationInterface calculator =
                new CalculatorWithCounterAutoAggregationInterface(new CalculatorWithMathExtends());

        double result = calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                calculator.power(calculator.divide(28.0, 5), 2))));

        System.out.println("Результат выражения = " + result);
        System.out.println(String.format(
                "Количество использований <%s> калькулятора = ", calculator.getClass().getSimpleName())
                + calculator.getCountOperation());
    }
}

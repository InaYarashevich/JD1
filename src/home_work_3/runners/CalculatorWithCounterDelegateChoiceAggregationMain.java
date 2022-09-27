package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;

public class CalculatorWithCounterDelegateChoiceAggregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAggregation calculator1 =
                new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAggregation calculator2 =
                new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAggregation calculator3 =
                new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithMathExtends());

        double result1 = calculator1.add(4.1, (calculator1.add(calculator1.multiply(15, 7),
                calculator1.power(calculator1.divide(28.0, 5), 2))));

        System.out.println("Результат выражения = " + result1);
        System.out.println("Количество использований <CalculatorWithOperator> калькулятора = "
                + calculator1.getCountOperation());

        double result2 = calculator2.add(4.1, (calculator2.add(calculator2.multiply(15, 7),
                calculator2.power(calculator2.divide(28.0, 5), 2))));

        System.out.println("Результат выражения = " + result2);
        System.out.println("Количество использований <CalculatorWithMathCopy> калькулятора = "
                + calculator2.getCountOperation());

        double result3 = calculator3.add(4.1, (calculator3.add(calculator3.multiply(15, 7),
                calculator3.power(calculator3.divide(28.0, 5), 2))));

        System.out.println("Результат выражения = " + result3);
        System.out.println("Количество использований <CalculatorWithMathExtends> калькулятора = "
                + calculator3.getCountOperation());

    }
}

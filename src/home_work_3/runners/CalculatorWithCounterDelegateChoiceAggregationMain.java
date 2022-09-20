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

        double result1 = calculator1.add1(4.1, (calculator1.add1(calculator1.multiply1(15, 7),
                calculator1.power1(calculator1.divide1(28.0, 5), 2))));

        System.out.println("Результат выражения = " + result1);
        System.out.println("Количество использований <CalculatorWithOperator> калькулятора = "
                + calculator1.getCountOperation());

        double result2 = calculator2.add2(4.1, (calculator2.add2(calculator2.multiply2(15, 7),
                calculator2.power2(calculator2.divide2(28.0, 5), 2))));

        System.out.println("Результат выражения = " + result2);
        System.out.println("Количество использований <CalculatorWithMathCopy> калькулятора = "
                + calculator2.getCountOperation());

        double result3 = calculator3.add3(4.1, (calculator3.add3(calculator3.multiply3(15, 7),
                calculator3.power3(calculator3.divide3(28.0, 5), 2))));

        System.out.println("Результат выражения = " + result3);
        System.out.println("Количество использований <CalculatorWithMathExtends> калькулятора = "
                + calculator3.getCountOperation());

    }
}

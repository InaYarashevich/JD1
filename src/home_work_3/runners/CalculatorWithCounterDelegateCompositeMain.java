package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();

        double resultFinal = calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                calculator.power(calculator.divide(28.0, 5), 2))));

        System.out.println("Результат выражения = " + resultFinal);
        System.out.printf("Операции: %d%n", calculator.getCountOperations());
    }
}

package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double divisionResult = calculator.divide(28.0, 5);
        calculator.incrementCountOperation();
        double powerResult = calculator.power(divisionResult, 2);
        calculator.incrementCountOperation();
        double multiplicationResult = calculator.multiply(15, 7);
        calculator.incrementCountOperation();
        double additionResult = calculator.add(powerResult, multiplicationResult);
        calculator.incrementCountOperation();
        double resultFinal = calculator.add(4.1, additionResult);
        calculator.incrementCountOperation();

        System.out.println("Результат выражения = " + resultFinal);
    }
}

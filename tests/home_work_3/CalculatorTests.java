package home_work_3;

import home_work_3.calcs.additional.*;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    @Test
    public void calculatorWithCounterAutoAggregationTest() {
        CalculatorWithCounterAutoAggregation calculator = new CalculatorWithCounterAutoAggregation(
                new CalculatorWithMathCopy());
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceTest() {
        CalculatorWithCounterAutoAggregationInterface calculator = new CalculatorWithCounterAutoAggregationInterface(
                new CalculatorWithMathCopy());
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void calculatorWithCounterAutoChoiceAggregationTest() {
        CalculatorWithCounterAutoChoiceAggregation calculator = new CalculatorWithCounterAutoChoiceAggregation(
                new CalculatorWithMathCopy());
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void calculatorWithCounterAutoCompositeTest() {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void calculatorWithCounterAutoSuperTest() {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void calculatorWithCounterClassicTest() {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void calculatorWithMathCopyTest() {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void calculatorWithMathExtendsTest() {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void calculatorWithOperatorTest() {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        Assertions.assertEquals(
                140.45999999999998,
                calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                        calculator.power(calculator.divide(28.0, 5), 2)))));

    }

    @Test
    public void getCountOperationCalculatorWithCounterAutoSuperTest(){
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                calculator.power(calculator.divide(28.0, 5), 2))));
        Assertions.assertEquals(
                5,
                calculator.getCountOperation());
    }

    @Test
    public void getCountOperationCalculatorWithCounterAutoCompositeTest(){
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                calculator.power(calculator.divide(28.0, 5), 2))));
        Assertions.assertEquals(
                5,
                calculator.getCountOperation());
    }

    @Test
    public void getCountOperationCalculatorWithCounterAutoChoiceAggregationTest(){
        CalculatorWithCounterAutoChoiceAggregation calculator =
                new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithMathExtends());
        calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                calculator.power(calculator.divide(28.0, 5), 2))));
        Assertions.assertEquals(
                5,
                calculator.getCountOperation());
    }

    @Test
    public void getCountOperationCalculatorWithCounterAutoAggregationTest(){
        CalculatorWithCounterAutoAggregation calculator =
                new CalculatorWithCounterAutoAggregation(new CalculatorWithMathCopy());
        calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                calculator.power(calculator.divide(28.0, 5), 2))));
        Assertions.assertEquals(
                5,
                calculator.getCountOperation());
    }
}

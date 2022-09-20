package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public double power(double number, int exponent) {
        double result = 1;
        while (exponent != 0) {
            result *= number;
            exponent--;
        }
        return result;
    }

    public double absoluteValue(double number) {
        if (number >= 0) {
            return number;
        } else {
            return number * (-1);
        }
    }

    public double squareRoot(double number) {
        double temp;
        double sqrtroot = number / 2;
        if (number <= 0) {
            System.out.println("Нельзя извлекать квадратный корень из отрицательного числа");
        }
        if (number == 0) {
            return 0;
        }
        do {
            temp = sqrtroot;
            sqrtroot = (temp + (number / temp)) / 2;
        } while ((temp - sqrtroot) != 0);
        return sqrtroot;
    }
}

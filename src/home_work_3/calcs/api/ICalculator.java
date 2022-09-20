package home_work_3.calcs.api;

public interface ICalculator {
    double subtract(double x, double y);
    double multiply(double x, double y);
    double add(double x, double y);
    double divide(double x, double y);
    double power(double number, int exponent);
    double absoluteValue(double number);
    double squareRoot(double number);
}

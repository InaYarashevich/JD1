package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number1 = 0;
        System.out.println("Пожалуйста, введите число: ");
        number1 = Double.parseDouble(console.next());

        int number2 = 0;
        do {
            System.out.println("Пожалуйста, введите целое положительное число: ");
            while (!console.hasNextInt()) {
                System.out.println("Это не целое числою. Пожалуйста, введите целое положительное число: ");
                console.next();
            }
            number2 = console.nextInt();
        } while (number2 < 0);

        double result = power(number1, number2);
        System.out.println(number1 + "^" + number2 + " = " + result);
    }

    public static double power(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}

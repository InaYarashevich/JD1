package home_work_2.loops;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Пожалуйста, введите целое число: ");
            while (!console.hasNextInt()) {
                System.out.println("Введено не целое число. Пожалуйста, введите целое число: ");
                console.next();
            }
            number = console.nextInt();
        } while (number < 0);

        int result = multiplyEach(number);
        System.out.println(" = " + result);
    }

    public static int multiplyEach(int number) {
        int result = 1;
        while (number > 0) {
            result = result * (number % 10);
            System.out.print((number % 10) + " * ");
            number /= 10;
        }
        return result;
    }
}

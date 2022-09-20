package home_work_2.loops;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long number = 0;
        do {
            System.out.println("Введите целое положительное число: ");
            while (!console.hasNextLong()) {
                System.out.println("Пожалуйста, введите целое положительное число!");
                console.next();
            }
            number = console.nextLong();
        } while (number < 0);

        long result = multiply(number);
        System.out.println(" = " + result);
    }

    public static long multiply(long number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
            if (!(i == number)) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }
        }
        return result;
    }
}

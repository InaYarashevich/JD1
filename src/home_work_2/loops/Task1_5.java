package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Пожалуйста, введите целое положительное число: ");
            while (!console.hasNextInt()) {
                System.out.println("Введено не целое положительное число. " +
                        "Пожалуйста, введите целое положительное число: ");
                console.next();
            }
            number = console.nextInt();
        } while (number < 0);

        System.out.println("Пожалуйста, введите стартовое число: ");
        int min = console.nextInt();
        System.out.println("Пожалуйста, введите конечное число: ");
        int max = console.nextInt();
        System.out.println("Пожалуйста, введите шаг: ");
        int step = console.nextInt();


        int maxIntResult = findMaxInt(number);
        System.out.println("Максимальное число: " + maxIntResult);

        double rateOfEvenNumbers = findRateOfEvenNumbers(number);
        System.out.println("Вероятность четных случайных чисел: " + rateOfEvenNumbers + "%");

        int evenNumbersQuantity = countEvenNumbers(number);
        System.out.println("Количество четных цифр: " + evenNumbersQuantity);

        int oddNumbersQuantity = countOddNumbers(number);
        System.out.println("Количество нечетных цифр: " + oddNumbersQuantity);

        printFibonacciSequence(number);
        System.out.println();

        System.out.print("Ряд чисел в диапазоне с шагом: ");
        printNumberSequenceWithStep(min, max, step);

        System.out.println();

        int numberInRevertedOrderResult = getNumberInReverseOrder(number);
        System.out.println("Число в обратном порядке: " + numberInRevertedOrderResult);
    }

    public static int findMaxInt(int number) {
        int maxNumber = 0;
        while (number > 0) {
            if ((number % 10) > maxNumber) {
                maxNumber = (number % 10);
            }
            number /= 10;
        }
        return maxNumber;
    }

    public static double findRateOfEvenNumbers(int number) {
        Random random = new Random();
        int i = 0;
        double result = 0;
        for (int j = 0; j < number; j++) {
            if ((random.nextInt(100) % 2) == 0) {
                i += 1;
            }
        }
        result = i * 100.0 / number;
        return result;
    }

    public static int countEvenNumbers(int number) {
        int evenNumbersCount = 0;
        while (number > 0) {
            if ((number % 2) == 0) {
                evenNumbersCount += 1;
            }
            number /= 10;
        }
        return evenNumbersCount;
    }

    public static int countOddNumbers(int number) {
        int oddNumbersCount = 0;
        while (number > 0) {
            if ((number % 2) != 0) {
                oddNumbersCount += 1;
            }
            number /= 10;
        }
        return oddNumbersCount;
    }

    public static void printFibonacciSequence(int number) {
        int number1 = 1;
        int number2 = 2;
        System.out.print("Ряд Фибоначчи: ");
        System.out.print(number1 + " " + number2 + " ");
        for (int i = 3; i < (number + 1); i++) {
            System.out.print((number1 + number2) + " ");
            int nextNumber = number1;
            number1 = number2;
            number2 = nextNumber + number1;
        }
    }

    public static void printNumberSequenceWithStep(int min, int max, int step) {
        while (min < max) {
            System.out.print(min + " ");
            min += step;
        }
    }

    public static int getNumberInReverseOrder(int number) {
        int revertedNumber = 0;
        while (number > 0) {
            revertedNumber = revertedNumber * 10 + number % 10;
            number = number / 10;
        }
        return revertedNumber;
    }
}

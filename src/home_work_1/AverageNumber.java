package home_work_1;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = console.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = console.nextInt();

        System.out.println("Введите третье число: ");
        int thirdNumber = console.nextInt();

        int result = getAverageNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(result); 
    }

    public static int getAverageNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int min = 0;
        int max = 0;
        max = firstNumber > secondNumber ? firstNumber : secondNumber;
        max = thirdNumber > max ? thirdNumber : max;
        min = firstNumber > secondNumber ? secondNumber : firstNumber;
        min = thirdNumber > min ? min : thirdNumber;
        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum - max - min;

        return average;
    }
}

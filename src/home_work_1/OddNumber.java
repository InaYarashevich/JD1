package home_work_1;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = console.nextInt();

        boolean result = checkOddNumber(number);
        System.out.println(result);
    }

    public static boolean checkOddNumber(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}

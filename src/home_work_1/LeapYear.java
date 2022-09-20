package home_work_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = console.nextInt();

        boolean result = checkIfLeapYear(year);
        System.out.println("Это високосный год? - " + result);
    }

    public static boolean checkIfLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

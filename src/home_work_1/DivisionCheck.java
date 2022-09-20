package home_work_1;

import java.util.Scanner;

public class DivisionCheck {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = console.nextInt();
        System.out.println("Введите второе число: ");
        int b = console.nextInt();

        boolean result = canBeDivided(a, b);
        System.out.println(result);
    }

    public static boolean canBeDivided(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            System.out.println("Остаток от деления = " + (a % b));
            return false;
        }
    }
}

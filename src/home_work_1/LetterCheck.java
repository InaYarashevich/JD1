package home_work_1;

import java.util.Scanner;

public class LetterCheck {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите символ: ");
        char symbol = console.next().charAt(0);

        boolean result = checkSymbol(symbol);
        System.out.println("Введеный символ - буква? - " + result);    }

    public static boolean checkSymbol(char symbol) {
        if (symbol >= 'a' && symbol <= 'z' || symbol >= 'A' && symbol <= 'Z') {
            return true;
        } else {
            return false;
        }
    }
}
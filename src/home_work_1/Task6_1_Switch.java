package home_work_1;

import java.util.Scanner;

public class Task6_1_Switch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя: ");

        String name = console.next();

        System.out.println(printWelcome(name));
    }

    public static String printWelcome(String name) {
        try {
            switch (name) {
                case "Вася":
                    return "Привет! \nЯ тебя так долго ждал";
                case "Анастасия":
                    return "Я тебя так долго ждал";
                default:
                    return "Добрый день, а вы кто?";
            }
        } catch (NullPointerException e) {
            return "Добрый день, а вы кто?";
        }
    }
}
package home_work_1;

import java.util.Scanner;

public class Task6_1_IfElseIf {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя: ");

        String name = console.next();

        System.out.println(printWelcome(name));
    }

    public static String printWelcome(String name) {
        if (name.equalsIgnoreCase("Вася")) {
            return "Привет! \nЯ тебя так долго ждал";
        } else {
            if (name.equalsIgnoreCase("Анастасия")) {
                return "Я тебя так долго ждал";
            } else {
                return "Добрый день, а вы кто?";
            }
        }
    }
}

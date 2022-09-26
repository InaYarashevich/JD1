package home_work_1.Task6_redone;

import home_work_1.Task6_redone.api.ICommunicationPrinter;

public class Task6_1_IfElse implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        try {
            if (name.equalsIgnoreCase("Вася")) {
                return "Привет! \nЯ тебя так долго ждал";
            } else {
                if (name.equalsIgnoreCase("Анастасия")) {
                    return "Я тебя так долго ждал";
                } else {
                    return "Добрый день, а вы кто?";
                }
            }
        } catch (NullPointerException e) {
            return "Добрый день, а вы кто?";
        }
    }
}

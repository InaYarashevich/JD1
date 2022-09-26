package home_work_1.Task6_redone;

import home_work_1.Task6_redone.api.ICommunicationPrinter;

public class Task6_1_Switch implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
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

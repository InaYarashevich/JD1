package home_work_6.pizzeria.job;

public class MakePizzaJob implements Runnable {
    @Override
    public void run() {
        System.out.println("Начинаю готовить пиццу");
        System.out.println("Готовлю пиццу");
        System.out.println("Заканчиваю готовить пиццу");
        System.out.println("Приготовил пиццу");
    }
}

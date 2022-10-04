package home_work_6.pizzeria.runners;


import home_work_6.pizzeria.api.IStage;
import home_work_6.pizzeria.objects.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(new Pizza("Ранч пицца", 1));
        pizzaList.add(new Pizza("Баварская", 2));
        pizzaList.add( new Pizza("Гавайская", 1));
        Menu menu = new Menu(pizzaList);

        SelectedItem selectedItem = new SelectedItem(
                new MenuRow(
                        new PizzaInfo(
                                1,
                                "Баварская",
                        "сладкий горчичный соус, охотничьи колбаски, свежие шампиньоны, свежий лук, свежие томаты, сыр моцарелла, базилик"),
                10.00), 1);

        List<SelectedItem> items = new ArrayList<>();
        items.add(selectedItem);

        Order order = new Order(items);
        
        Ticket ticket = new Ticket("2", LocalDateTime.now(), order);

        Stage stage1 = new Stage("Заказ принят ", IStage.getTime());
        Stage stage2 = new Stage("Начато приготовление пиццы ", IStage.getTime());
        Stage stage3 = new Stage("Заказ пакуется ", IStage.getTime());
        Stage stage4 = new Stage("Заказ готов ", IStage.getTime());

        List<Stage> stages = new ArrayList<>();
        stages.add(stage1);
        stages.add(stage2);
        stages.add(stage3);
        stages.add(stage4);

        OrderStatus orderStatus = new OrderStatus(stages, false, ticket);
        DoneOrder doneOrder = new DoneOrder(ticket, pizzaList);

        Pizzeria pizzeria = new Pizzeria(new Menu(pizzaList),
                ticket,
                orderStatus,
                doneOrder);


        System.out.println("Заказ создан и выдан квиток: " + pizzeria.create(order));
        System.out.println("Информация о стадии приготовления: " + pizzeria.check(ticket));
    }
}

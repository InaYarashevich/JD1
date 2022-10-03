package home_work_6.pizzeria.runners;


import home_work_6.pizzeria.objects.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название пиццы: ");
        String name = scanner.next();
        System.out.println("Введите размер пиццы: ");
        int size = Integer.parseInt(scanner.next());
        System.out.println("Состав пиццы: ");
        String description = scanner.next();



        List<SelectedItem> pizzas = new ArrayList<>();
        pizzas.add(new SelectedItem(
                        new MenuRow(
                                new PizzaInfo(
                                        size, name, description
                                ), 25.00
                        ),1));
        Order order = new Order(pizzas);
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(0, new Pizza(name, size));
        Ticket ticket = new Ticket("2",LocalDateTime.now(), order);
        List<Stage> stages = new ArrayList<>();
        stages.add(new Stage("Заказ принят", LocalTime.now()));
        OrderStatus orderStatus = new OrderStatus(stages, false, ticket);
        DoneOrder doneOrder = new DoneOrder(ticket, pizzaList);

        Pizzeria pizzeria = new Pizzeria(new Menu(pizzaList),
                ticket,
                orderStatus,
                doneOrder);


        System.out.println(pizzeria.create(order));


    }
}

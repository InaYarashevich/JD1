package home_work_6.pizzeria.runners;


import home_work_6.pizzeria.objects.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите пиццу: ");
        int pizza = scanner.nextInt();
        menu.getItems().get(pizza);
    }
}

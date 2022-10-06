package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IMenuRow;
import home_work_6.pizzeria.api.IPizzaInfo;

public class MenuRow implements IMenuRow {
    private IPizzaInfo pizzaInfo;
    private double price;

    public MenuRow(IPizzaInfo pizzaInfo, double price) {
        this.pizzaInfo = pizzaInfo;
        this.price = price;
    }

    public void setPizzaInfo(IPizzaInfo pizzaInfo) {
        this.pizzaInfo = pizzaInfo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public IPizzaInfo getInfo() {
        return pizzaInfo;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {

        return '\n' + "Pizza: " + pizzaInfo +
                ", Price: " + price + " BYN";
    }
}

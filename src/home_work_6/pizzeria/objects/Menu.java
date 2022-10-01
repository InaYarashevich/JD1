package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IMenu;
import home_work_6.pizzeria.api.IPizza;

import java.util.ArrayList;
import java.util.List;


public class Menu implements IMenu {
    private List<Pizza> items;

    public Menu(List<Pizza> items) {
        this.items = items;
    }

    public void setItems(List<Pizza> items) {
        this.items = items;
    }

    @Override
    public List<IPizza> getItems() {
        return new ArrayList<>(items);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                '}';
    }
}

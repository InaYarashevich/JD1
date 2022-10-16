package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IOrder;
import home_work_6.pizzeria.api.ISelectedItem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {
    private List<ISelectedItem> selectedItem;

    public Order(List<ISelectedItem> selectedItem) {
        this.selectedItem = selectedItem;
    }

    public Order(){}

    public void setSelectedItem(List<ISelectedItem> theSelectedItem){
        this.selectedItem = theSelectedItem;
    }

    @Override
    public List<ISelectedItem> getSelected() {
        return selectedItem;
    }

    @Override
    public String toString() {
        return "Order: " + selectedItem;
    }
}

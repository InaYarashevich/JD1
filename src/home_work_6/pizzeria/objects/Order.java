package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IOrder;
import home_work_6.pizzeria.api.ISelectedItem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {
    private List<SelectedItem> selectedItem;

    public Order(List<SelectedItem> selectedItem) {
        this.selectedItem = selectedItem;
    }

    public void setSelectedItem(List<SelectedItem> theSelectedItem){
        this.selectedItem = theSelectedItem;
    }

    @Override
    public List<ISelectedItem> getSelected() {
        return new ArrayList<>(selectedItem);
    }

    @Override
    public String toString() {
        return "Order{" +
                "selectedItem=" + selectedItem +
                '}';
    }
}

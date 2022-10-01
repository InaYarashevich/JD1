package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IMenuRow;
import home_work_6.pizzeria.api.ISelectedItem;

public class SelectedItem implements ISelectedItem {
    private MenuRow menuRow;
    private int count;

    public SelectedItem(MenuRow menuRow, int count){
        this.menuRow = menuRow;
        this.count = count;
    }

    public void setMenuRow(MenuRow theMenuRow){
        this.menuRow = theMenuRow;
    }

    public void setCount(int theCount){
        this.count = theCount;
    }

    @Override
    public IMenuRow getRow() {
        return menuRow;
    }

    @Override
    public int getCount() {
        return count;
    }
}

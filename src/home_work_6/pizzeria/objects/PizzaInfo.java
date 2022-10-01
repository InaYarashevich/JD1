package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IPizzaInfo;

public class PizzaInfo implements IPizzaInfo {
    private int size;
    private String name;
    private String description;

    public PizzaInfo(int size, String name, String description) {
        this.size = size;
        this.description = description;
        this.name = name;
    }

    public void setSize(int theSize) {
        this.size = theSize;
    }

    public void setDescription(String theDescription) {
        this.description = theDescription;
    }

    public void setName(String theName) {
        this.name = theName;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return '{' + "name='" + this.name + "\'" +
                ", description='" + this.description + "\'" +
                ", size=" + this.size + '}';
    }
}

package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IDoneOrder;
import home_work_6.pizzeria.api.IPizza;
import home_work_6.pizzeria.api.ITicket;

import java.util.ArrayList;
import java.util.List;

public class DoneOrder implements IDoneOrder {
    private ITicket ticket;
    private List<IPizza> items;


    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IPizza> getItems() {
        return items;
    }
}

package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IDoneOrder;
import home_work_6.pizzeria.api.IPizza;
import home_work_6.pizzeria.api.ITicket;

import java.util.ArrayList;
import java.util.List;

public class DoneOrder implements IDoneOrder {
    private Ticket ticket;
    private List<Pizza> items;

    public DoneOrder(Ticket ticket, List<Pizza> pizzas) {
        this.ticket = ticket;
        this.items = pizzas;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.items = pizzas;
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IPizza> getItems() {
        return new ArrayList<>(items);
    }
}

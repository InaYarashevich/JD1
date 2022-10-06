package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.*;
import home_work_6.pizzeria.supplier.RandomUUIDSupplier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;


public class Pizzeria implements IPizzeria {
    private IMenu menu;
    private Supplier<String> numberGenerator;
    private Map<ITicket, IDoneOrder> orders = new HashMap<>();

    public Pizzeria(List<IMenuRow> rows) {
        this.menu = new Menu(rows);
        this.numberGenerator = new RandomUUIDSupplier();
    }


    @Override
    public IMenu takeMenu() {
        return this.menu;
    }

    @Override
    public ITicket create(IOrder order) {
        String number = null;
        do{
            number = numberGenerator.get();
            for (ITicket iTicket : this.orders.keySet()) {
                if(number.equals(iTicket.getNumber())){
                    number = null;
                    break;
                }
            }
        } while (number == null);

        Ticket ticket = new Ticket(number, order);

        this.orders.put(ticket, null);

        return ticket;
    }

    @Override
    public IOrderStatus check(ITicket ticket) {

        return new OrderStatus();
    }

    @Override
    public IDoneOrder pickup(ITicket ticket) {
        return null;
    }
}
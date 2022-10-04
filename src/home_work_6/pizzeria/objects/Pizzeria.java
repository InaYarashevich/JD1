package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.*;


public class Pizzeria implements IPizzeria {
    private Menu menu;
    private Ticket ticket;
    private OrderStatus orderStatus;
    private DoneOrder doneOrder;

    public Pizzeria(Menu menu, Ticket ticket,
                    OrderStatus orderStatus, DoneOrder doneOrder) {
        this.menu = menu;
        this.ticket = ticket;
        this.orderStatus = orderStatus;
        this.doneOrder = doneOrder;
    }

    public void setMenu(Menu theMenu) {
        this.menu = theMenu;
    }

    public void setTicket(Ticket theTicket) {
        this.ticket = theTicket;
    }

    public void setOrderStatus(OrderStatus theOrderStatus) {
        this.orderStatus = theOrderStatus;
    }

    public void setDoneOrder(DoneOrder theDoneOrder) {
        this.doneOrder = theDoneOrder;
    }

    @Override
    public IMenu takeMenu() {
        return menu;
    }

    @Override
    public ITicket create(IOrder order) {
        return ticket;
    }

    @Override
    public IOrderStatus check(ITicket ticket) {

        return orderStatus;
    }

    @Override
    public IDoneOrder pickup(ITicket ticket) {
        return doneOrder;
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "menu=" + menu +
                ", ticket=" + ticket +
                ", orderStatus=" + orderStatus +
                ", doneOrder=" + doneOrder +
                '}';
    }
}
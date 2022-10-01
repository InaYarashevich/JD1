package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IOrder;
import home_work_6.pizzeria.api.ITicket;

import java.time.LocalDateTime;


public class Ticket implements ITicket {
    private String number;
    private LocalDateTime createAt;
    private Order order;

    public Ticket(String number, LocalDateTime createAt, Order order) {
        this.number = number;
        this.createAt = createAt;
        this.order = order;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public LocalDateTime getCreateAt() {
        return createAt;
    }

    @Override
    public IOrder getOrder() {
        return order;
    }
}
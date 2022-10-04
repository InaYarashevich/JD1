package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IOrder;
import home_work_6.pizzeria.api.ITicket;

import java.time.LocalDateTime;


public class Ticket implements ITicket {
    private String number;
    private LocalDateTime createdAt;
    private Order order;

    public Ticket(String number, LocalDateTime createdAt, Order order) {
        this.number = number;
        this.createdAt = createdAt;
        this.order = order;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public IOrder getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ", order=" + order +
                '}';
    }
}
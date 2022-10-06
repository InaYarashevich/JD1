package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IOrder;
import home_work_6.pizzeria.api.ITicket;
import home_work_6.pizzeria.supplier.RandomUUIDSupplier;

import java.time.LocalDateTime;


public class Ticket implements ITicket {
    private String number;
    private LocalDateTime createdAt;
    private IOrder order;

    public Ticket(String number, IOrder order) {
        this.number = number;
        this.createdAt = LocalDateTime.now();
        this.order = order;
    }
    public Ticket(String number, LocalDateTime createdAt, IOrder order) {
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

    public void setOrder(IOrder order) {
        this.order = order;
    }

    @Override
    public String getNumber() {
        RandomUUIDSupplier randomUUIDSupplier = new RandomUUIDSupplier();
        number = randomUUIDSupplier.get();
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
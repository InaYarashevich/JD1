package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.*;

import java.util.ArrayList;
import java.util.List;

public class OrderStatus implements IOrderStatus {
    private List<Stage> stages;
    private boolean isDone;
    private Ticket ticket;

    public OrderStatus(List<Stage> stages, boolean isDone, Ticket ticket){
        this.stages = stages;
        this.isDone = isDone;
        this.ticket = ticket;
    }

    public void setStage(List<Stage> theStages){
        this.stages = theStages;
    }

    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }

    public void setTicket(Ticket theTicket){
        this.ticket = theTicket;
    }

    @Override
    public List<IStage> getHistory() {
        return new ArrayList<>(stages);
    }

    @Override
    public boolean isDone() {
        return isDone;
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "stages=" + stages +
                ", isDone=" + isDone +
                ", ticket=" + ticket +
                '}';
    }
}
package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.*;

import java.util.List;

public class OrderStatus implements IOrderStatus {
    private List<IStage> stages;
    private boolean isDone;
    private ITicket ticket;

    public OrderStatus(List<IStage> stages, boolean isDone, ITicket ticket){
        this.stages = stages;
        this.isDone = isDone;
        this.ticket = ticket;
    }
    public OrderStatus(){}

    public void setStage(List<IStage> theStages){
        this.stages = theStages;
    }

    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }

    public void setTicket(ITicket theTicket){
        this.ticket = theTicket;
    }

    @Override
    public List<IStage> getHistory() {
        stages.add(new Stage("Заказ принят"));
        stages.add(new Stage("Начато приготовление пиццы"));
        stages.add(new Stage("Заказ пакуется"));
        stages.add(new Stage("Заказ готов"));
        return stages;
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
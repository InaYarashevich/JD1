package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IStage;

import java.time.LocalTime;

public class Stage implements IStage {
    private String description;
    private LocalTime time;

    public Stage(String description, LocalTime time) {
        this.description = description;
        this.time = time;
    }

    public void setDescription(String theDescription) {
        this.description = theDescription;
    }

    public void setTime(LocalTime theTime) {
        this.time = theTime;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description + time;
    }
}

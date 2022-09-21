package home_work_5.comparators;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class AnimalAgeAndNicksComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() == o2.getAge()) {
            return o1.getNick().compareTo(o2.getNick());
        } else {
            return (o1.getAge() - o2.getAge());
        }
    }
}

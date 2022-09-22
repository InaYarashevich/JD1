package home_work_5.runners;

import home_work_5.dto.Person;
import home_work_5.utils.RandomGenerator;

import java.util.*;

import static home_work_5.utils.FillingOutCollection.createListOfPeople;

public class PersonTask6_4_1 {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        List<Person> people1 = new LinkedList<>();
        List<Person> people2 = new ArrayList<>();
        Set<Person> people3 = new HashSet<>();
        Set<Person> people4 = new TreeSet<>();

        long start1 = System.currentTimeMillis();
        createListOfPeople(people1);
        long stop1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        createListOfPeople(people2);
        long stop2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        createListOfPeople(people3);
        long stop3 = System.currentTimeMillis();

        long start4 = System.currentTimeMillis();
        createListOfPeople(people4);
        long stop4 = System.currentTimeMillis();

        System.out.println("Операция: <заполнение LinkedList 100_000 объектами Person>. " +
                String.format("Заняла <%s> ", (stop1 - start1)) + "мс.");

        System.out.println("Операция: <заполнение ArrayList 100_000 объектами Person>. " +
                String.format("Заняла: <%s> ", (stop2 - start2)) + "мс.");

        System.out.println("Операция: <заполнение HashSet 100_000 объектами Person>. " +
                String.format("Заняла: <%s> ", (stop3 - start3)) + "мс.");

        System.out.println("Операция: <заполнение TreeSet 100_000 объектами Person>. " +
                String.format("Заняла: <%s> ", (stop4 - start4)) + "мс.");
    }
}

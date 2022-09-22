package home_work_5.runners;

import home_work_5.dto.Person;

import java.util.*;

import static home_work_5.utils.FillingOutCollection.createListOfPeople;

public class PersonTask6_4_2_1 {
    public static void main(String[] args) {
        List<Person> people1 = new LinkedList<>();
        List<Person> people2 = new ArrayList<>();
        Set<Person> people3 = new HashSet<>();
        Set<Person> people4 = new TreeSet<>();

        createListOfPeople(people1);
        createListOfPeople(people2);
        createListOfPeople(people3);
        createListOfPeople(people4);

        Iterator<Person> iterator1 = people1.iterator();
        long start1 = System.currentTimeMillis();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + " ");
        }
        long stop1 = System.currentTimeMillis();

        Iterator<Person> iterator2 = people2.iterator();
        long start2 = System.currentTimeMillis();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next() + " ");
        }
        long stop2 = System.currentTimeMillis();

        Iterator<Person> iterator3 = people3.iterator();
        long start3 = System.currentTimeMillis();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next() + " ");
        }
        long stop3 = System.currentTimeMillis();

        Iterator<Person> iterator4 = people4.iterator();
        long start4 = System.currentTimeMillis();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next() + " ");
        }
        long stop4 = System.currentTimeMillis();

        System.out.println("Операция: <итерирование LinkedList> с помощью <iterator()>. " +
                String.format("Заняла <%s> ", (stop1 - start1)) + "мс.");

        System.out.println("Операция: <итерирование ArrayList> с помощью <iterator()>. " +
                String.format("Заняла <%s> ", (stop2 - start2)) + "мс.");

        System.out.println("Операция: <итерирование HashSet> с помощью <iterator()>. " +
                String.format("Заняла <%s> ", (stop3 - start3)) + "мс.");

        System.out.println("Операция: <итерирование TreeSet> с помощью <iterator()>. " +
                String.format("Заняла <%s> ", (stop4 - start4)) + "мс.");
    }
}

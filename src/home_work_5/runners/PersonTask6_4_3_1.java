package home_work_5.runners;

import home_work_5.dto.Person;

import java.util.*;

import static home_work_5.utils.FillingOutCollection.createListOfPeople;

public class PersonTask6_4_3_1 {
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
        while(iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove();
        }
        long stop1 = System.currentTimeMillis();

        Iterator<Person> iterator2 = people2.iterator();
        long start2 = System.currentTimeMillis();
        while(iterator2.hasNext()) {
            iterator2.next();
            iterator2.remove();
        }
        long stop2 = System.currentTimeMillis();

        Iterator<Person> iterator3 = people3.iterator();
        long start3 = System.currentTimeMillis();
        while(iterator3.hasNext()) {
            iterator3.next();
            iterator3.remove();
        }
        long stop3 = System.currentTimeMillis();

        Iterator<Person> iterator4 = people4.iterator();
        long start4 = System.currentTimeMillis();
        while(iterator4.hasNext()) {
            iterator4.next();
            iterator4.remove();
        }
        long stop4 = System.currentTimeMillis();

        System.out.println("Операция: <удаление всех элементов из LinkedList> с помощью <iterator()>. " +
                String.format("Заняла <%s> ", (stop1 - start1)) + "мс.");

        System.out.println("Операция: <удаление всех элементов из ArrayList> с помощью <iterator()>. " +
                String.format("Заняла <%s> ", (stop2 - start2)) + "мс.");

        System.out.println("Операция: <удаление всех элементов из HashSet> с помощью <iterator()>. " +
                String.format("Заняла <%s> ", (stop3 - start3)) + "мс.");

        System.out.println("Операция: <удаление всех элементов из TreeSet> с помощью <iterator()>. " +
                String.format("Заняла <%s> ", (stop4 - start4)) + "мс.");
    }
}

package home_work_5.runners;

import home_work_5.dto.Person;
import home_work_5.utils.RandomGenerator;

import java.util.*;

import static home_work_5.utils.FillingOutCollection.createListOfPeople;
import static home_work_5.utils.RandomGenerator.*;

public class PersonTask6_4_2_2 {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        List<Person> people1 = new LinkedList<>();
        List<Person> people2 = new ArrayList<>();
        Set<Person> people3 = new HashSet<>();
        Set<Person> people4 = new TreeSet<>();

        createListOfPeople(people1);
        createListOfPeople(people2);
        createListOfPeople(people3);

        for (int i = 0; i < 100_000; i++) {
            people4.add(new Person(randomGenerator.generateRandomNamesAndNicks(NICKS),
                    randomGenerator.generatePassword(RANDOM_CHARS, 50),
                    randomGenerator.generateRandomNamesAndNicks(NAMES)));
        }

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < people1.size(); i++) {
            System.out.println(people1.get(i));
        }
        long stop1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < people2.size(); i++) {
            System.out.println(people2.get(i));
        }
        long stop2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        people3.forEach(System.out::println);
        long stop3 = System.currentTimeMillis();

        long start4 = System.currentTimeMillis();
        people4.forEach(System.out::println);
        long stop4 = System.currentTimeMillis();

        System.out.println("Операция: <итерирование LinkedList>. " +
                String.format("Заняла <%s> ", (stop1 - start1)) + "мс.");

        System.out.println("Операция: <итерирование ArrayList>. " +
                String.format("Заняла <%s> ", (stop2 - start2)) + "мс.");

        System.out.println("Операция: <итерирование HashSet>. " +
                String.format("Заняла <%s> ", (stop3 - start3)) + "мс.");

        System.out.println("Операция: <итерирование TreeSet>. " +
                String.format("Заняла <%s> ", (stop4 - start4)) + "мс.");
    }
}

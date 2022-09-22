package home_work_5.runners;

import home_work_5.dto.Animal;
import home_work_5.utils.RandomGenerator;

import java.util.*;

import static home_work_5.utils.FillingOutCollection.createListOfAnimals;
import static home_work_5.utils.RandomGenerator.ENGLISH_CHARS;

public class AnimalTask6_4_2_2 {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        List<Animal> animals = new LinkedList<>();
        List<Animal> animals2 = new ArrayList<>();
        Set<Animal> animals3 = new HashSet<>();
        Set<Animal> animals4 = new TreeSet<>();

        createListOfAnimals(animals);
        createListOfAnimals(animals2);
        createListOfAnimals(animals3);
        for (int i = 0; i < 100_000; i++) {
            animals4.add(new Animal(
                    randomGenerator.generateAge(),
                    randomGenerator.generateRandomString(ENGLISH_CHARS, 5, 20)));
        }

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        long stop1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < animals2.size(); i++) {
            System.out.println(animals2.get(i));
        }
        long stop2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        animals3.forEach(System.out::println);
        long stop3 = System.currentTimeMillis();

        long start4 = System.currentTimeMillis();
        animals4.forEach(System.out::println);
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

package home_work_5.runners;

import home_work_5.comparators.AnimalAgeAndNicksComparator;
import home_work_5.comparators.AnimalAgeComparator;
import home_work_5.dto.Animal;

import java.util.*;

import static home_work_5.utils.FillingOutCollection.createListOfAnimals;

public class AnimalTask6_3_1 {
    public static void main(String[] args) {
        List<Animal> animals = new LinkedList<>();
        List<Animal> animals2 = new ArrayList<>();
        Set<Animal> animals3 = new HashSet<>();
        Set<Animal> animals4 = new TreeSet<Animal>(animals3);

        AnimalAgeComparator comparator1 = new AnimalAgeComparator();
        AnimalAgeAndNicksComparator comparator2 = new AnimalAgeAndNicksComparator();

        createListOfAnimals(animals);
        System.out.println("<LinkedList> до сортировки по возрасту: " + animals);
        animals.sort(comparator1);
        System.out.println("<LinkedList> после сортировки по возрасту: " + animals);
        animals.sort(comparator2);
        System.out.println("<LinkedList> после сортировки по возрасту и кличке: " + animals);

        createListOfAnimals(animals2);
        System.out.println("<ArrayList> до сортировки по возрасту: " + animals2);
        animals2.sort(comparator1);
        System.out.println("<ArrayList> после сортировки по возрасту: " + animals2);
        animals2.sort(comparator2);
        System.out.println("<ArrayList> после сортировки по возрасту и кличке: " + animals2);

        createListOfAnimals(animals3);
        List<Animal> animals5 = new ArrayList<Animal>(animals3);
        System.out.println("<HashSet> до сортировки по возрасту: " + animals5);
        animals5.sort(comparator1);
        System.out.println("<HashSet> после сортировки по возрасту: " + animals5);
        animals5.sort(comparator2);
        System.out.println("<HashSet> после сортировки по возрасту и кличке: " + animals5);

        animals4.addAll(animals3);
        System.out.println("<TreeSet>: " + animals4);


    }
}

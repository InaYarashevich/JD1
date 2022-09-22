package home_work_5.runners;

import home_work_5.comparators.PersonPasswordAndNicksComparator;
import home_work_5.comparators.PersonPasswordComparator;
import home_work_5.dto.Person;

import java.util.*;

import static home_work_5.utils.FillingOutCollection.createListOfPeople;

public class PersonTask6_3_1 {
    public static void main(String[] args) {
        List<Person> people1 = new LinkedList<>();
        List<Person> people2 = new ArrayList<>();
        Set<Person> people3 = new HashSet<>();
        Set<Person> people4 = new TreeSet<>();

        PersonPasswordComparator comparator1 = new PersonPasswordComparator();
        PersonPasswordAndNicksComparator comparator2 = new PersonPasswordAndNicksComparator();

        createListOfPeople(people1);
        System.out.println("<LinkedList> до сортировки по возрасту: " + people1);
        people1.sort(comparator1);
        System.out.println("<LinkedList> после сортировки по возрасту: " + people1);
        people1.sort(comparator2);
        System.out.println("<LinkedList> после сортировки по возрасту и кличке: " + people1);

        createListOfPeople(people2);
        System.out.println("<ArrayList> до сортировки по возрасту: " + people2);
        people2.sort(comparator1);
        System.out.println("<ArrayList> после сортировки по возрасту: " + people2);
        people2.sort(comparator2);
        System.out.println("<ArrayList> после сортировки по возрасту и кличке: " + people2);

        createListOfPeople(people3);
        List<Person> people5 = new ArrayList<Person>(people3);
        System.out.println("<HashSet> до сортировки по возрасту: " + people3);
        people5.sort(comparator1);
        System.out.println("<HashSet> после сортировки по возрасту: " + people5);
        people5.sort(comparator2);
        System.out.println("<HashSet> после сортировки по возрасту и кличке: " + people5);

        people4.addAll(people3);
        System.out.println("<TreeSet>: " + people4);


    }
}

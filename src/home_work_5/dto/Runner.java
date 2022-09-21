package home_work_5.dto;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person("asdf", "asdfgs", "asdf");

        List<Person> people = new LinkedList<>();
        List<Person> people2 = new ArrayList<>();
        Set<Person> people3 = new HashSet<>();
        Set<Person> people4 = new TreeSet<>();

        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 10_000; i++) {
            people.add(new Person("asdf", "asdfgs", "asdf"));
        }
    }
}

package home_work_5.utils;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;

import java.util.Collection;

import static home_work_5.utils.RandomGenerator.*;

public class FillingOutCollection {
    public static Collection<Person> createListOfPeople(Collection<Person> people) {
        RandomGenerator randomGenerator = new RandomGenerator();

        for (int i = 0; i < 100_000; i++) {
            people.add(new Person(randomGenerator.generateRandomNamesAndNicks(NICKS),
                    randomGenerator.generatePassword(RANDOM_CHARS, 60),
                    randomGenerator.generateRandomNamesAndNicks(NAMES)));
        }
        return people;
    }

    public static Collection<Animal> createListOfAnimals(Collection<Animal> animals) {
        RandomGenerator randomGenerator = new RandomGenerator();
        for (int i = 0; i < 100_000; i++) {
            animals.add(new Animal(randomGenerator.generateAge(),
                    randomGenerator.readNameOrNickFromFile(FILE_PATH_NICKS_ANIMALS, 18)));
        }
        return animals;
    }
}

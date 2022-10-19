package home_work_7.task2;

import home_work_7.comparator.ComparatorString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2_1 {
    public static Set<String> createSetFromString(String text) {
        Set<String> resultSet = new HashSet<String>();
        String[] words = text.split("[, ;.!]+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[()\",:;.!?]+", "");

            if (words[i].startsWith("-")) {
                words[i] = words[i].replaceAll("-", ""); //TODO
            }

            resultSet.add(words[i]);
        }
        return resultSet;
    }

    public static int getCountWords(Set<String> resultSet) {
        int count = 0;
        int size = resultSet.size();
        for (int i = 0; i < size; i++) {
            count++;
        }
        return count;
    }

    public static List<String> sortSetInAscendingOrder(Set<String> resultSet) {
        ComparatorString comparator = new ComparatorString();
        List<String> words = new ArrayList<>(resultSet);
        words.sort(comparator);
        return words;
    }
}

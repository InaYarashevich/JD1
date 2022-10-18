package home_work_7;

import home_work_7.Task4.EasySearch;
import home_work_7.Task4.RegExSearch;
import home_work_7.comparator.ComparatorInteger;
import home_work_7.comparator.ComparatorString;
import home_work_7.task2.Task2_1;
import home_work_7.utils.ReadFile;

import java.util.*;

import static home_work_7.task2.Task2_1.createSetFromString;
import static home_work_7.task2.Task2_1.getCountWords;
import static home_work_7.task2.Task2_2.*;

public class Main {
    public static void main(String[] args) {
        String text = ReadFile.read("Война_и_мир.txt");
        //String text = "бабушка бабушке бабушку";

        Set<String> stringSet = createSetFromString(text);
        Map<String, Integer> result = createMapFromString(text);

        System.out.println("Количество слов в тексте: " + getCountWords(stringSet));

        System.out.println("Set<String>: " + stringSet);

        System.out.println("Map<String, Integer>: " + result);

        System.out.println("Отсортированный по количеству использования слов List: " + sortListInDescendingOrder(createListFromMapValues(result)));

        //System.out.println(sortListInDescendingOrder(createListFromMapValues(wordsMap)));

        Map<String, Integer> result1 = getTopWords(result, sortListInDescendingOrder(createListFromMapValues(result)), 5);

         System.out.println("Top words: " + result1);

        //EasySearch easySearch = new EasySearch();
        //RegExSearch regExSearch = new RegExSearch();

        //System.out.println("Количество встречающихся слов: " + regExSearch.search(text, "мама"));

       // System.out.println("Количество встречающихся слов: " + easySearch.search(text, "Мама"));

    }
}

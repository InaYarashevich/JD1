package home_work_7;

import home_work_7.task2.WorkWithSet;
import home_work_7.task2.WorkWithMap;
import home_work_7.utils.ReadFromFile;

import java.util.Map;
import java.util.Set;

public class Task2And4Main {
    public static void main(String[] args) {
        String text = ReadFromFile.read("Война_и_мир.txt");
        //String text = "привет,какдела!привет,какдела!";
        //EasySearch easySearch = new EasySearch();
        //System.out.println("Количество встречающихся слов: " + easySearch.search(text, "мир"));

        //RegExSearch regExSearch = new RegExSearch();
        //System.out.println("Количество встречающихся слов: " + regExSearch.search(text, "мир"));

        WorkWithSet workWithSet = new WorkWithSet();
        WorkWithMap workWithMap = new WorkWithMap();
        Set<String> stringSet = workWithSet.createSetFromString(text);
        Map<String, Integer> result = workWithMap.createMapFromString(text);

        System.out.println("Количество слов в тексте: " + workWithSet.getCountWords(stringSet));
        System.out.println("Set<String>: " + stringSet);
        System.out.println("Map<String, Integer>: " + result);
        System.out.println("Отсортированный по количеству использования слов List: " +
                workWithMap.sortListInDescendingOrder(workWithMap.createListFromMapValues(result)));
        System.out.println(workWithMap.sortListInDescendingOrder(workWithMap.createListFromMapValues(result)));
        Map<String, Integer> result1 = workWithMap.getTopWords(
                result,
                workWithMap.sortListInDescendingOrder(
                        workWithMap.createListFromMapValues(result)),
                5);
        System.out.println("Top words: " + result1);

    }
}

package home_work_7;

import home_work_7.dto.EasySearch;

public class Task2And4Main {
    public static void main(String[] args) {
        //String text = ReadFromFile.read("Война_и_мир.txt");
        String text = "привет,какдела!привет,какдела!";
        EasySearch easySearch = new EasySearch();
        System.out.println("Количество встречающихся слов: " + easySearch.search(text, "какдела"));

        //RegExSearch regExSearch = new RegExSearch();
        //System.out.println("Количество встречающихся слов: " + regExSearch.search(text, "мир"));

        //Set<String> stringSet = createSetFromString(text);
        //Map<String, Integer> result = createMapFromString(text);

        //System.out.println("Количество слов в тексте: " + getCountWords(stringSet));
        //System.out.println("Set<String>: " + stringSet);
        //System.out.println("Map<String, Integer>: " + result);
        //System.out.println("Отсортированный по количеству использования слов List: " + sortListInDescendingOrder(createListFromMapValues(result)));
        //System.out.println(sortListInDescendingOrder(createListFromMapValues(wordsMap)));
        //Map<String, Integer> result1 = getTopWords(result, sortListInDescendingOrder(createListFromMapValues(result)), 5);
        //System.out.println("Top words: " + result1);

    }
}

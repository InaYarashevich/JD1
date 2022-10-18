package home_work_7.task2;

import home_work_7.comparator.ComparatorInteger;

import java.util.*;

public class Task2_2 {
    public static Map<String, Integer> createMapFromString(String text) {
        String[] words = text.split("[, ;.!]+");
        Map<String, Integer> wordsMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[()\",:;.!?]+", "");
            words[i] = words[i].replace("-", "");

            Integer value = wordsMap.get(words[i]);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            wordsMap.put(words[i], value);
        }
        return wordsMap;
    }

    public static List<Integer> createListFromMapValues(Map<String, Integer> wordsMap) {
        List<Integer> valuesList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            valuesList.add(entry.getValue());
        }
        return valuesList;
    }

    public static List<Integer> sortListInDescendingOrder(List<Integer> valuesList) {
        ComparatorInteger comparator = new ComparatorInteger();
        List<Integer> listToSort = new ArrayList<>(valuesList);
        Collections.sort(listToSort, Collections.reverseOrder());
        return listToSort;
    }

    public static Map<String, Integer> getTopWords(Map<String, Integer> wordsMap, List<Integer> valuesList, int topCount){
        Map<String, Integer> topResults = new HashMap<>();
        for (int i = 0; i < valuesList.subList(0, topCount).size(); i++) {
            for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
                if (entry.getValue().equals(valuesList.subList(0, topCount).get(i))){
                    topResults.put(entry.getKey(), valuesList.subList(0, topCount).get(i));
                }
            }
        }
        return topResults;
    }
}

package home_work_7.task2;

import home_work_7.comparator.ComparatorInteger;

import java.util.*;

public class WorkWithMap {

    /**
     * метод создает Map из переданного как аргумент текста, где ключ - слово,
     * значение - количество раз, которое слово встречается в тексте
     *
     * @param text - текст, из которого будет создаваться Map
     * @return Map, состояющую из ключей (слово) и значений (количество раз слово встречается в тексте)
     */
    public Map<String, Integer> createMapFromString(String text) {
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

    /**
     * метод создает список из значений Map, переданной как аргумент
     *
     * @param wordsMap - Map, из значений которой будет создаваться список
     * @return список значений (количество раз, которые слова встречаются в тексте)
     */
    public List<Integer> createListFromMapValues(Map<String, Integer> wordsMap) {
        List<Integer> valuesList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            valuesList.add(entry.getValue());
        }
        return valuesList;
    }

    /**
     * метод сортирует список int значений в убывающем порядке
     *
     * @param valuesList список значений, который нужно отсортировать
     * @return отсортированный список
     */
    public List<Integer> sortListInDescendingOrder(List<Integer> valuesList) {
        ComparatorInteger comparator = new ComparatorInteger();
        List<Integer> listToSort = new ArrayList<>(valuesList);
        Collections.sort(listToSort, Collections.reverseOrder());
        return listToSort;
    }

    /**
     * метод выбирает из Map слова, которые чаще всего встречаются в тексте, по которому был произведен поиск
     *
     * @param wordsMap   - Map, где ключ - строка (слово), поиск которой был осуществлен в тексте,
     *                   значение - количество раз, слово встретилось в тексте
     * @param valuesList - отсортированный в порядке убывания список значений, отражающий количество раз,
     *                   которое слово встречается в тексте
     * @param topCount   - количество результатов, которые нужно вернуть
     * @return Map слов, которые в тексте встречаются чаще всего
     */
    public Map<String, Integer> getTopWords(Map<String, Integer> wordsMap, List<Integer> valuesList, int topCount) {
        Map<String, Integer> topResults = new HashMap<>();
        for (int i = 0; i < valuesList.subList(0, topCount).size(); i++) {
            for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
                if (entry.getValue().equals(valuesList.subList(0, topCount).get(i))) {
                    topResults.put(entry.getKey(), valuesList.subList(0, topCount).get(i));
                }
            }
        }
        return topResults;
    }
}

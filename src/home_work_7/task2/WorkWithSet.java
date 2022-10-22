package home_work_7.task2;

import home_work_7.comparator.ComparatorString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorkWithSet {
    /**
     * метод создания сета из переданной в параметре строки
     *
     * @param text - текст, из которого будет формироваться Set строк
     * @return Set строк, сформированных из переданного текста
     */
    public Set<String> createSetFromString(String text) {
        Set<String> resultSet = new HashSet<String>();
        String[] words = text.split("[, ;.!]+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[()\",:;.!?]+", "");
            resultSet.add(words[i]);
        }
        return resultSet;
    }

    /**
     * метод подсчета количества уникальных слов в тексте
     *
     * @param resultSet - Set уникальных строк, подсчет которых будет производиться в методе
     * @return количество уникальных слов в тексте
     */
    public int getCountWords(Set<String> resultSet) {
        int count = 0;
        int size = resultSet.size();
        for (int i = 0; i < size; i++) {
            count++;
        }
        return count;
    }

    /**
     * метод сортирует Set строк в алфавитном порядке
     *
     * @param resultSet - Set строк, который будет отсортирован в методе
     * @return отсортированный в алфавитном порядке Set строк
     */
    public List<String> sortSetInAscendingOrder(Set<String> resultSet) {
        ComparatorString comparator = new ComparatorString();
        List<String> words = new ArrayList<>(resultSet);
        words.sort(comparator);
        return words;
    }
}

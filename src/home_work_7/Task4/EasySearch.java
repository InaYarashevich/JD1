package home_work_7.Task4;

import home_work_7.Task3.api.ISearchEngine;

import java.util.List;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        String[] words = text.split("[, ;.!]+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                count++;
            }
        }
        return count;
    }
}
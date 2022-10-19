package home_work_7.dto;

import home_work_7.api.ISearchEngine;

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
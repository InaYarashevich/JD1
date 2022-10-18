package home_work_7.Task4;

import home_work_7.Task3.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private static final String REGEX = "[a-zA-Z]+";

    @Override
    public long search(String text, String word) {
        long count = 0;
        String[] words = text.split("[, ;.!]+");
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(word);

        for (int i = 0; i < words.length; i++) {
            if (matcher.matches()){
                count++;
            }
        }
        return count;
    }
}

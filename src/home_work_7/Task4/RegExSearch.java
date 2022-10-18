package home_work_7.Task4;

import home_work_7.Task3.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private static final String REGEX = "[а-я]+";

    @Override
    public long search(String text, String word) {
        long count = 0;
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(word);

        while(matcher.find()){
            count++;
        }
        return count;
    }
}

package home_work_7.dto;

import home_work_7.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private static final String REGEX = "[а-я]+";

    @Override
    public long search(String text, String word) {
        long count = 0;
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(word);

        do{
          if (matcher.matches()) {
              count++;
          }

        }while(matcher.start() != matcher.end());
        return count;
    }
}

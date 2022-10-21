package home_work_7.dto;

import home_work_7.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private static final String REGEX = "[а-я]+";

    /**
     * метод поиска слова в тексте
     *
     * @param text = текст, в котором будет осуществляться поиск
     * @param word = искомое слово
     * @return = количество раз, которое искомое слово встречается в тексте
     */
    @Override
    public long search(String text, String word) {
        long count = 0;

        Pattern first = Pattern.compile("^" + word + "$");
        Matcher fir = first.matcher(text);
        if (fir.matches()) {
            count++;
        }

        first = Pattern.compile("(?m)^" + word + "\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.)\\s*");
        fir = first.matcher(text);
        if (fir.find(0)) {
            count++;
        }

        Pattern patern = Pattern.compile("\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.)\\s*"
                + word +
                "\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.)\\s*");
        Matcher matcher = patern.matcher(text);

        boolean flag;
        while ((flag = matcher.find())) {
            if (flag) {
                count++;
            }
        }

        patern = Pattern.compile("\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.)\\s*"
                + word + "$");
        matcher = patern.matcher(text);
        if (matcher.find()) {
            count++;
        }

        return count;
    }
}

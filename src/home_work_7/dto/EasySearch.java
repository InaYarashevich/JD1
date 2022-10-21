package home_work_7.dto;

import home_work_7.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    private static final String[]FIRST = {" ",".","?",",","!", "..", "...", ";", ":", " -", "--", "*", "'", "\"", "(", ")"};
    private static final String[]LAST = {" ","\n",".","?",",","!", "..", "...", ";", ":", "--", "*", "'", "\"", "(", ")"};

    /**
     * метод поиска слова в тексте
     * @param text = текст, в котором будет осуществляться поиск
     * @param word = искомое слово
     * @return = количество раз, которое искомое слово встречается в тексте
     */
    @Override
    public long search(String text, String word) {
        int index = 0;
        long count = 0;

        if(text.startsWith(word) && text.endsWith(word) && (word.length() == text.length())){
            count++;
        }
        for (int i = 0; i < LAST.length; i++){
            if(text.indexOf((word + LAST[i]), (index)) == 0){
                count++;
            }
            for (int j = 0; j < FIRST.length; j++){
                boolean flag = true;
                while (flag){
                    if((index = text.indexOf((FIRST[j] + word + LAST[i]), (index + 1))) != 0 &&
                            text.indexOf((FIRST[j] + word + LAST[i]), (index + 1)) != -1){
                        count++;
                    }
                    if (index == -1){
                        flag = false;
                    }
                }
            }
        }
        for (int j = 0; j < FIRST.length; j++){
            if(text.endsWith(FIRST[j] + word)){
                count++;
            }
        }
        return count;
    }
}
package home_work_7.Task4;

import home_work_7.Task3.api.ISearchEngine;

import java.util.List;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        /*int index = text.indexOf(word);
        for (int i = 0; i < text.length(); i++){
            if(index >= 0){
                int length = text.length();
                if (length > index){
                    text = text.substring(0);

                }
                count++;
                System.out.println(index);
                System.out.println(text);
            }
        }*/

        String[] words = text.split("[, ;.!]+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                count++;
            }
        }
        return count;
    }
}
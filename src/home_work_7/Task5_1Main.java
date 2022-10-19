package home_work_7;

import home_work_7.dto.EasySearch;
import home_work_7.utils.ReadFromFile;

public class Task5_1Main {
    public static void main(String[] args) {
        EasySearch easySearch = new EasySearch();
        String text = ReadFromFile.read("Война_и_мир.txt");

        System.out.println(String.format(
                "Слово <война> используется <%s> раз в тексте.",
                easySearch.search(text, "война")));

        System.out.println(String.format(
                "Союз <и> используется <%s> раз в тексте.",
                easySearch.search(text, "и")));

        System.out.println(String.format(
                "Слово <и> используется <%s> раз в тексте.",
                easySearch.search(text, "мир")));
    }
}

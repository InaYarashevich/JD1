package home_work_7.Task8.dto;

import java.util.List;

public class Book {
    private String name;
    private List<String> words;

    public Book(List<String> words) {
        this.words = words;
    }

    public Book(String name) {
        this.name = name;
    }

    public List<String> getWord() {
        return words;
    }

    public void setWord(List<String> word) {
        this.words = word;
    }

    @Override
    public String toString() {
        return "Book{" +
                "word=" + words +
                '}';
    }
}

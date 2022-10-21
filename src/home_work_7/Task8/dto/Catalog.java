package home_work_7.Task8.dto;

import java.util.List;

public class Catalog {
    private List<Book> books;

    public Catalog(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "books=" + books +
                '}';
    }
}

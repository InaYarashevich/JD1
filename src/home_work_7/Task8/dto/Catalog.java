package home_work_7.Task8.dto;

import java.util.ArrayList;
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

    public List<Book> createBooksCatalog(int size, Book book){
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            books.add(new Book(book.getName(), book.getText()));
        }
        return books;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "books=" + books +
                '}';
    }
}

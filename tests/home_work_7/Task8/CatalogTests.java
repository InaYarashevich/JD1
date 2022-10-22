package home_work_7.Task8;

import home_work_7.Task8.dto.Book;
import home_work_7.Task8.dto.Catalog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CatalogTests {
    List<Book> books = new ArrayList<>();
    Catalog catalog = new Catalog(books);

    @Test
    public void getBooksTest() {
        books.add(new Book("name1", "text1"));
        books.add(new Book("name2", "text2"));
        books.add(new Book("name3", "text3"));
        Assertions.assertEquals(
                books,
                catalog.getBooks(),
                "Список книг из метода не равен созданному списку книг."
        );
    }

    @Test
    public void setBooksTest() {
        List<Book> newBooks = new ArrayList<>();
        newBooks.add(new Book("newName1", "newText1"));
        newBooks.add(new Book("newName2", "newText2"));
        newBooks.add(new Book("newName3", "newText3"));
        catalog.setBooks(newBooks);

        Assertions.assertEquals(
                newBooks,
                catalog.getBooks(),
                "Список книг из метода не равен созданному списку книг."
        );
    }
}

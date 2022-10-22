package home_work_7.Task8;

import home_work_7.Task8.dto.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTests {
    Book book = new Book("bookName", "bookContent");

    @Test
    public void getBookNameTest(){
        Assertions.assertEquals(
                "bookName",
                book.getName(),
                "Название книги из метода не соответсвует названию книги."
        );
    }

    @Test
    public void setBookNameTest(){
        book.setName("newBookName");
        Assertions.assertEquals(
                "newBookName",
                book.getName(),
                "Название книги не соотвествует новому установленному имени."
        );
    }

    @Test
    public void getBookTextTest(){
        Assertions.assertEquals(
                "bookContent",
                book.getText(),
                "Содержимое книги из метода не соответсвует содержимому книги."
        );
    }

    @Test
    public void setBookTextTest(){
        book.setText("newBookContent");
        Assertions.assertEquals(
                "newBookContent",
                book.getText(),
                "Содержимое книги из метода не соответсвует содержимому книги."
        );
    }
}

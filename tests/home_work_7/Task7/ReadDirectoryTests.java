package home_work_7.Task7;

import home_work_7.utils.ReadDirectory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReadDirectoryTests {
    @Test
    public void readDirectoryNumberOfFilesTest(){
        Assertions.assertEquals(
               18, ReadDirectory.getFiles("E:/library").size(),
                "Количество файлов в папке не соответствует количеству файлов, возвращенное методом."
        );
    }

    @Test
    public void readDirectoryFirstElementTest(){
        Assertions.assertEquals(
                "agile_testing.txt", ReadDirectory.getFiles("E:/library").get(0),
                "Название 1-го файла в списке, возвращенного методом, не соответсвует названию 1-го файла в папке."
        );
    }
}

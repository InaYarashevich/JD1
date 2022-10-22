package home_work_7.Task7;

import home_work_7.utils.ReadFromFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReadFromFileTests {
    @Test
    public void readFromFileTest(){
        Assertions.assertFalse(
                ReadFromFile.read("E:/library/concurrency.TXT").isEmpty(),
                "Файл пустой."
        );
    }

    @Test
    public void readFromFileBeginningOfTheTextTest(){
        Assertions.assertTrue(
                ReadFromFile.read("C:/Users/Ina/IdeaProjects/JAVA_PROGRAMMING/Война_и_мир.txt").startsWith("Война"),
                "Содержимое файла не начинается со слова <Война>."
        );
    }

    @Test
    public void readFromFileLengthOfTheTextTest(){
        Assertions.assertEquals(
                1_898_053,
                ReadFromFile.read("C:/Users/Ina/IdeaProjects/JAVA_PROGRAMMING/Война_и_мир.txt").length(),
                "Длина строки, возвращенная методом, не соответсвует длине строки файла."
        );
    }
}

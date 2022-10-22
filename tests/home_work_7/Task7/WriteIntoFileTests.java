package home_work_7.Task7;

import home_work_7.utils.ReadFromFile;
import home_work_7.utils.WriteIntoFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WriteIntoFileTests {

    private String fileName = "C:/Users/Ina/IdeaProjects/JAVA_PROGRAMMING/newResult.txt";
    private String text = "мама мыла раму";

    @Test
    public void writeIntoFileTest(){
        WriteIntoFile.writeIntoFile(text, fileName);
        Assertions.assertEquals(
                text,
                ReadFromFile.read(fileName),
                "Текст, записанный файл, не соответствует тексту в файле"
                );
    }
}

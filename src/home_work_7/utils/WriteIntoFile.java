package home_work_7.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class WriteIntoFile {
    /**
     * метод записывает переданный в параметре тексте в файл
     *
     * @param text     - текст, который будет записан в файл
     * @param fileName - имя файла, в который будет записан переданный текст
     */
    public static void writeIntoFile(String text, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter out = new BufferedWriter(fileWriter);
            out.write(text);
            out.newLine();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

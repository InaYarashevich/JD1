package home_work_7.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class WriteIntoFile {
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

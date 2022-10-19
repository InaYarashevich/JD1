package home_work_7.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class ReadFromFile {
    public static String read(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = stringBuilder.toString();
        return text;
    }
}

package home_work_7.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadDirectory {
    public static List<String> getFiles(String path) {
        List<String> files = new ArrayList<>();
        File directory = new File(path);
        for (String file : directory.list()) {
            files.add(file);
        }
        return files;
    }
}

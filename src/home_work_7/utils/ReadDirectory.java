package home_work_7.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class ReadDirectory {
    /**
     * метод чтения содержимого каталога/ папки
     *
     * @param path - адрес папки, содержимое которой будет читаться
     * @return список файлов, находящихся в папке
     */
    public static List<String> getFiles(String path) {
        List<String> files = new ArrayList<>();
        File directory = new File(path);
        for (String file : directory.list()) {
            files.add(file);
        }
        return files;
    }
}

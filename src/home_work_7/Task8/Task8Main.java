package home_work_7.Task8;

import home_work_7.Task4.EasySearch;
import home_work_7.Task7.ScanFolder;
import home_work_7.utils.ReadFile;
import home_work_7.utils.WriteIntoFile;

import java.util.Scanner;
import java.util.concurrent.*;

public class Task8Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        EasySearch easySearch = new EasySearch();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес папки: ");
        String path = scanner.next();

        System.out.println("Введите искомое слово: ");
        String word = scanner.next();
        String text = null;

        for (int i = 0; i < ScanFolder.getFiles(path).size(); i++) {
            text = ScanFolder.getFiles(path).get(i);
        }
        String finalText = text;
        String word1 = word;

        Callable<Long> callableTask = () -> easySearch.search(finalText, word1);

        Future<Long> future =
                executorService.submit(callableTask);

        WriteIntoFile.writeIntoFile(finalText + " - " + word + " - " + future, "result.txt");

        executorService.shutdown();
    }
}

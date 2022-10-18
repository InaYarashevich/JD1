package home_work_7.Task8;

import home_work_7.Task4.EasySearch;
import home_work_7.Task7.ScanFolder;
import home_work_7.utils.ReadFile;
import home_work_7.utils.WriteIntoFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Task8Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        EasySearch easySearch = new EasySearch();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес папки: ");
        String path = scanner.next();

        System.out.println("Введите искомое слово: ");
        String word = scanner.next();

        List<String> files = ScanFolder.getFiles(path);
        List<String> texts = new ArrayList<>();

        for (int i = 0; i < files.size(); i++) {
            texts.add(ReadFile.read(path + "\\" + files.get(i)));
        }

        Callable<Long> callableTask = () -> easySearch.search(texts.get(0), word);

        Future<Long> future = executorService.submit(callableTask);

        WriteIntoFile.writeIntoFile(files + " - " + word + " - " + future.get(), "result.txt");

        executorService.shutdown();
    }
}

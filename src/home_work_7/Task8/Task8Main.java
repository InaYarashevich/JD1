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
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        EasySearch easySearch = new EasySearch();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес папки: ");
        String path = scanner.next();


        List<String> files = ScanFolder.getFiles(path);
        List<String> texts = new ArrayList<>();
        int choice = 0;

        do {
            System.out.println("Введите искомое слово: ");
            String word = scanner.next();

            for (int i = 0; i < files.size(); i++) {
                int iter = i;
                texts.add(ReadFile.read(path + "\\" + files.get(i)));

                Callable<Long> callableTask = () -> easySearch.search(texts.get(iter), word);

                List<Callable<Long>> callables = new ArrayList<>();

                for (int j = 0; j < files.size(); j++) {
                    callables.add(callableTask);
                }

                List<Future<Long>> futures = executorService.invokeAll(callables);

                WriteIntoFile.writeIntoFile(files.get(i) + " - " + word + " - " + futures.get(i).get(), "result.txt");
            }
            System.out.println("0 - продолжить поиск в текущем файле;\n1 - завершить поиск в текущем файле;");
            choice = scanner.nextInt();
        } while (choice != 1);

        executorService.shutdown();
    }
}

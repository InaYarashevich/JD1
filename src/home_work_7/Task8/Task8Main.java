package home_work_7.Task8;

import home_work_7.Task8.dto.Book;
import home_work_7.Task8.dto.Catalog;
import home_work_7.dto.EasySearch;
import home_work_7.utils.ReadDirectory;
import home_work_7.utils.ReadFromFile;
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


        int catalogSize = ReadDirectory.getFiles(path).size();
        List<String> booksNames = ReadDirectory.getFiles(path);
        List<String> booksText = new ArrayList<>();


        for (int i = 0; i < catalogSize; i++) {
            booksText.add(ReadFromFile.read(path + "/" + booksNames.get(i)));
        }

        List<Book> books = new ArrayList<>();

        for (int i = 0; i < booksNames.size(); i++) {
            books.add(new Book(booksNames.get(i), booksText.get(i)));
        }
        Catalog catalog = new Catalog(books);

        int choice = 0;

        do {
            System.out.println("Введите искомое слово: ");
            String word = scanner.next();

            for (int i = 0; i < catalog.getBooks().size(); i++) {
                int iter = i;
                booksText.add(ReadFromFile.read(path + "/" + catalog.getBooks().get(i).getName()));

                Callable<Long> callableTask = () -> easySearch.search(booksText.get(iter), word);

                List<Callable<Long>> callables = new ArrayList<>();

                for (int j = 0; j < catalog.getBooks().size(); j++) {
                    callables.add(callableTask);
                }

                List<Future<Long>> futures = executorService.invokeAll(callables);

                WriteIntoFile.writeIntoFile(
                        catalog.getBooks().get(i).getName() + " - " + word + " - " + futures.get(i).get(), "result.txt");
            }

            System.out.println("0 - продолжить поиск;\n1 - завершить поиск;");
            choice = scanner.nextInt();
        } while (choice != 1);

        executorService.shutdown();
    }
}

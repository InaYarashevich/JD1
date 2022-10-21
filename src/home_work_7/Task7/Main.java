package home_work_7.Task7;

import home_work_7.dto.EasySearch;
import home_work_7.utils.ReadFromFile;
import home_work_7.utils.ReadDirectory;
import home_work_7.utils.WriteIntoFile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес папки: ");
        String path = scanner.next();

        System.out.println("Файлы: " + ReadDirectory.getFiles(path));

        EasySearch easySearch = new EasySearch();
        int choice = 0;
        String word = null;
        long countResults = 0;
        int fileChoice = 0;
        do {
            System.out.println("Выберите файл: ");
            String selectedFile = scanner.next();
            String text = ReadFromFile.read(path + "/" + selectedFile);
            do {
                System.out.println("Введите искомое слово: ");
                word = scanner.next();
                countResults = easySearch.search(text, word);

                System.out.println("0 - продолжить поиск в текущем файле;\n1 - завершить поиск в текущем файле;");
                choice = scanner.nextInt();

                if (choice != 0 && choice != 1) {
                    System.out.println("0 - продолжить поиск в текущем файле;\n1 - завершить поиск в текущем файле;");
                }

                WriteIntoFile.writeIntoFile(
                        selectedFile + " - " + word + " - " + countResults, "result.txt");

            } while (choice != 1);

            System.out.println("0 - искать в новом файле;\n1 - завершить поиск.");
            fileChoice = scanner.nextInt();

            if (fileChoice != 0 && fileChoice != 1) {
                System.out.println("0 - искать в новом файле;\n1 - завершить поиск.");
            }

            if (fileChoice == 0){
                System.out.println("Файлы: " + ReadDirectory.getFiles(path));
            }
        } while (fileChoice != 1);
    }
}

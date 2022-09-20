package home_work_1;

import java.util.Scanner;

public class BytesIntoKiloBytes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество байт: ");
        int bytesSize = console.nextInt();

        double result = convertToKb(bytesSize);
        System.out.println("В Kilobytes это будет: " + result);
    }

    public static double convertToKb(int bytes) {
        return bytes / 1024.0;
    }
}

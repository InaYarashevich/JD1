package home_work_2.loops.Task1Redone;

import java.util.Scanner;

public class Task1_6 {
    public static void printRow(int from, int to) {
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                int result = 0;
                result = i * j;
                System.out.print(j + " * " + i + " = " + result + "\t");
            }
            System.out.print("\n");
        }
    }
}

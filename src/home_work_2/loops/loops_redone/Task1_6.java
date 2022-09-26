package home_work_2.loops.loops_redone;

import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("С какого числа начинаем таблицу умножения?");
        int startNumber = scanner.nextInt();
        System.out.println("Введите максимальное количество столбцов в строке");
        int maxCountColumnsInRow = scanner.nextInt();
        System.out.println("Введите количество столбцов в таблице умножения");
        int countColumns = scanner.nextInt();

        int countRow = (int) Math.ceil(countColumns / (double) maxCountColumnsInRow); // получить количество строк, то есть
        //узнать, сколько будет строк на основании того, сколько у нас максимальное количество колонок и сколько
        // колонок нужно отображать в одной строке. Строка, здесь, - это часть до переноса строки (все умножения для одной
        // цифры), к примеру, 2*(1-10) - после последнего вычисления будет перенос строки
        for (int i = 0; i < countRow; i++) { //делаем, пока i < количества полученных строк из расчета
            int currentTo = startNumber + maxCountColumnsInRow + (maxCountColumnsInRow * i) - 1; // находим значение,
            //до которого будем печатать колонки и строки
            int tmp = countColumns - (maxCountColumnsInRow * i); //временная переменная, которая отображает, сколько
            // колонок остается еще напечатать из расчета того, что мы знаем макс количество колонок
            if (tmp < maxCountColumnsInRow) { // если количество колонок меньше макс количества колонок в строке
                currentTo = startNumber + (maxCountColumnsInRow * i) + tmp - 1; //стартовому число + временная переменная
            }
            printRow(startNumber + (maxCountColumnsInRow * i), currentTo);
            System.out.println();
        }
    }

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

package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        int sumResult = getSumOfEvenPositiveNumbers(50, 100);
        System.out.println(sumResult);

        int maxResult = getMax(50, 100);
        System.out.println(maxResult);

        getElementsLessThanArithmeticMean(50, 100);
        System.out.println();

        getMinElements(50, 100);

        Scanner console = new Scanner(System.in);
        System.out.println("Введите нижнюю границу диапазона: ");
        int lowBorder = console.nextInt();
        System.out.println("Введите верхнюю границу диапазона: ");
        int highBorder = console.nextInt();

        removeElementsFromArray(50, 100, lowBorder, highBorder);

        int sumOfArrayElementsResult = getSumOfArrayElementsNumbers(50, 100);
        System.out.println(sumOfArrayElementsResult);
    }

    public static int getSumOfEvenPositiveNumbers(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (array[i] % 2 == 0)) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int getMax(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int max = 0;
        for (int i = 1; i < array.length; i += 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void getElementsLessThanArithmeticMean(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int sum = 0;
        int mean = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        mean = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < mean) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void getMinElements(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int min1;
        int min2;
        if (array[0] > array[1]) {
            min1 = 0;
            min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] < array[min1]) {
                int newMin = min1;
                min1 = i;
                if (array[newMin] < array[min2]) {
                    min2 = newMin;
                }
            } else if (array[i] < array[min2]) {
                min2 = i;
            }
        }
        System.out.println("Первый минимальный элемент: " + array[min1]);
        System.out.println("Второй минимальный элемент: " + array[min2]);
    }

    public static void removeElementsFromArray(int size, int maxValueExclusion, int lowBorder, int highBorder) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int i = 0;
        while (i < array.length) {
            if ((lowBorder <= i) && (i <= highBorder)) {
                array[i] = 0;
            }
            i++;
        }
    }

    public static int getSumOfArrayElementsNumbers(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            while (array[i] != 0) {
                sum += array[i] % 10;
                array[i] /= 10;
            }
        }
        return sum;
    }
}

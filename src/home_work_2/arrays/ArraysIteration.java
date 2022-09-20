package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void printAllElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        int k = 0;
        do {
            System.out.print(array[k] + " ");
            k++;
        } while (k < array.length);

        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void printEachSecondElement() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        int k = 0;
        int iteration = 0;

        do {
            if ((k % 2 != 0) && (k > 0)) {
                System.out.print(array[k] + " ");
            }
            k++;
        } while (k < array.length);
        System.out.println();

        while (i < array.length) {
            if ((i % 2 != 0) && (i > 0)) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            if (j % 2 != 0) {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();

        for (int element : array) {
            if (iteration % 2 != 0) {
                System.out.print(element + " ");
            }
            iteration++;
        }
        System.out.println();
    }

    public static void printRevertedArray() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = array.length - 1;
        int k = array.length - 1;
        int iteration = array.length - 1;
        do {
            System.out.print(array[k] + " ");
            k--;
        } while (k >= 0);
        System.out.println();

        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        for (int element : array) {
            if (iteration >= 0) {
                System.out.print(array[iteration] + " ");
            }
            iteration--;
        }
        System.out.println();
    }
}

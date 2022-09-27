package home_work_2.utils;

public class SortsUtils {
    public static int[] bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = (array.length - 1); j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] shake(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            boolean swapped = false;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j+1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }

            for (int j = arr.length - 2 - i; j > i; j--) {
                if (arr[j-1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }
        return arr;
    }
}

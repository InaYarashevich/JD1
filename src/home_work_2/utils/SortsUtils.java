package home_work_2.utils;

public class SortsUtils {
    public static int[] bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] shake(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            boolean swapped = false;
            for (int j = i; j < arr.length - i - 1; j++) {

                if (arr[j] < arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }
            for (int j = arr.length - 2 - i; j > i; j--) {
                if (arr[j] > arr[j-1]) {
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

package home_work_2.arrays.Task2_3;

import home_work_2.arrays.api.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public int[] printAllElements(int[] array) {
        int k = 0;
        int i = 0;
        int[] newArray = new int[array.length];
        do {
            newArray[i] = array[k];
            i++;
            k++;
        } while (k < array.length);
        return newArray;
    }

    @Override
    public int[] printEachSecondElement(int[] array) {
        int k = 0;
        int i = 0;
        int[] newArray = new int[array.length];
        do {
            if ((k % 2 != 0) && (k > 0)) {
                newArray[i] = array[k];
            }
            k++;
            i++;
        } while (k < array.length);
        return newArray;
    }

    @Override
    public int[] printRevertedArray(int[] array) {
        int k = array.length - 1;
        int[] revertedArray = new int[array.length];
        int i = 0;
        do {
            revertedArray[i] = array[k];
            i++;
            k--;
        } while (k >= 0);
        return revertedArray;
    }
}

package home_work_2.arrays.Task2_3;

import home_work_2.arrays.api.IArraysOperation;

public class ForOperation implements IArraysOperation {
    @Override
    public int[] printAllElements(int[] array) {
        int j = 0;
        int i = 0;
        int[] newArray = new int[array.length];
        for (j = 0; j < array.length; j++) {
            newArray[i] = array[j];
            i++;
        }
        return newArray;
    }

    @Override
    public int[] printEachSecondElement(int[] array) {
        int i = 0;
        int[] newArray = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            if (j % 2 != 0) {
                newArray[i] = array[j];
            }
            i++;
        }
        return newArray;
    }

    @Override
    public int[] printRevertedArray(int[] array) {
        int[] revertedArray = new int[array.length];
        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            revertedArray[i] = array[j];
            i++;
        }
        return revertedArray;
    }
}

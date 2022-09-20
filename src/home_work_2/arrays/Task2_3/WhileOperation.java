package home_work_2.arrays.Task2_3;

import home_work_2.arrays.api.IArraysOperation;

public class WhileOperation implements IArraysOperation {
    @Override
    public int[] printAllElements(int[] array) {
        int i = 0;
        int j = 0;
        int[] newArray = new int[array.length];
        while (i < array.length) {
            newArray[j] = array[i];
            i++;
            j++;
        }
        return newArray;
    }

    @Override
    public int[] printEachSecondElement(int[] array) {
        int i = 0;
        int j = 0;
        int[] newArray = new int[array.length];
        while (i < array.length) {
            if ((i % 2 != 0) && (i > 0)) {
                newArray[j] = array[i];
            }
            i++;
            j++;
        }
        return newArray;
    }

    @Override
    public int[] printRevertedArray(int[] array) {
        int i = array.length - 1;
        int[] revertedArray = new int[array.length];
        int j = 0;
        while (i >= 0) {
            revertedArray[j] = array[i];
            i--;
            j++;
        }
        return revertedArray;
    }
}

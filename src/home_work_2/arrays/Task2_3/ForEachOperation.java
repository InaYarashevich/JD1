package home_work_2.arrays.Task2_3;

import home_work_2.arrays.api.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    @Override
    public int[] printAllElements(int[] array) {
        int i = 0;
        int[] newArray = new int[array.length];
        int j = 0;
        for (int element : array) {
            newArray[j] = array[i];
            i++;
            j++;
        }
        return newArray;
    }

    @Override
    public int[] printEachSecondElement(int[] array) {
        int iteration = 0;
        int i = 0;
        int[] newArray = new int[array.length];
        for (int element : array) {
            if (iteration % 2 != 0) {
                newArray[i] = element;
            }
            iteration++;
            i++;
        }
        return newArray;
    }

    @Override
    public int[] printRevertedArray(int[] array) {
        int iteration = array.length - 1;
        int[] revertedArray = new int[array.length];
        int i = 0;
        for (int element : array) {
            if (iteration >= 0) {
                revertedArray[i] = array[iteration];
            }
            i++;
            iteration--;
        }
        return revertedArray;
    }
}

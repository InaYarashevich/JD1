package home_work_2.arrays;

import home_work_2.arrays.Task2_3.DoWhileOperation;
import home_work_2.arrays.Task2_3.ForEachOperation;
import home_work_2.arrays.Task2_3.ForOperation;
import home_work_2.arrays.Task2_3.WhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_3Tests {
    
    @Test
    public void doWhileOperationPrintAllTest() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        Assertions.assertArrayEquals(
                new int[]{1, 3, 4, 6, 2, 0},
                doWhileOperation.printAllElements(new int[]{1, 3, 4, 6, 2, 0}));
    }

    @Test
    public void whileOperationPrintAllTest() {
        WhileOperation whileOperation = new WhileOperation();
        Assertions.assertArrayEquals(
                new int[]{1, 3, 4, 6, 2, 0},
                whileOperation.printAllElements(new int[]{1, 3, 4, 6, 2, 0}));
    }

    @Test
    public void forOperationPrintAllTest() {
        ForOperation forOperation = new ForOperation();
        Assertions.assertArrayEquals(
                new int[]{1, 3, 4, 6, 2, 0},
                forOperation.printAllElements(new int[]{1, 3, 4, 6, 2, 0}));
    }

    @Test
    public void forEachOperationPrintAllTest() {
        ForEachOperation forEachOperation = new ForEachOperation();
        Assertions.assertArrayEquals(
                new int[]{1, 3, 4, 6, 2, 0},
                forEachOperation.printAllElements(new int[]{1, 3, 4, 6, 2, 0}));
    }

    @Test
    public void doWhileOperationPrintEachSecondElementTest() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        Assertions.assertArrayEquals(
                new int[]{0, 3, 0, 6, 0, 0},
                doWhileOperation.printEachSecondElement(new int[]{1, 3, 4, 6, 5, 0}));
    }

    @Test
    public void whileOperationPrintEachSecondElementTest() {
        WhileOperation whileOperation = new WhileOperation();
        Assertions.assertArrayEquals(
                new int[]{0, 3, 0, 6, 0, 0},
                whileOperation.printEachSecondElement(new int[]{1, 3, 4, 6, 5, 0}));
    }

    @Test
    public void ForOperationPrintEachSecondElementTest() {
        ForOperation forOperation = new ForOperation();
        Assertions.assertArrayEquals(
                new int[]{0, 3, 0, 6, 0, 0},
                forOperation.printEachSecondElement(new int[]{1, 3, 4, 6, 5, 0}));
    }

    @Test
    public void ForEachOperationPrintEachSecondElementTest() {
        ForEachOperation forEachOperation = new ForEachOperation();
        Assertions.assertArrayEquals(
                new int[]{0, 3, 0, 6, 0, 0},
                forEachOperation.printEachSecondElement(new int[]{1, 3, 4, 6, 5, 0}));
    }

    @Test
    public void doWhileOperationPrintRevertedArrayTest() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8},
                doWhileOperation.printRevertedArray(new int[]{8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void whileOperationPrintRevertedArrayTest() {
        WhileOperation whileOperation = new WhileOperation();
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8},
                whileOperation.printRevertedArray(new int[]{8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void forOperationPrintRevertedArrayTest() {
        ForOperation forOperation = new ForOperation();
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8},
                forOperation.printRevertedArray(new int[]{8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void forEachOperationPrintRevertedArrayTest() {
        ForEachOperation forEachOperation = new ForEachOperation();
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8},
                forEachOperation.printRevertedArray(new int[]{8, 7, 6, 5, 4, 3, 2, 1}));
    }
}

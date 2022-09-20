package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsBubbleTests {
    @Test
    public void bubbleSort1Test() {
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                SortsUtils.bubble(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void bubbleSort2Test() {
        Assertions.assertArrayEquals(
                new int[]{1, 1, 1, 1},
                SortsUtils.bubble(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void bubbleSort3Test() {
        Assertions.assertArrayEquals(
                new int[]{1, 5, 9, 9, 9, 99},
                SortsUtils.bubble(new int[]{9, 1, 5, 99, 9, 9}));
    }

    @Test
    public void bubbleSort4Test() {
        Assertions.assertArrayEquals(
                new int[]{1, 5, 9, 9, 9, 99},
                SortsUtils.bubble(new int[]{9, 1, 5, 99, 9, 9}));
    }

    @Test
    public void bubbleSort5Test() {
        Assertions.assertArrayEquals(
                new int[]{},
                SortsUtils.bubble(new int[]{}));
    }

    @Test
    public void bubbleSort6Test() {
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                SortsUtils.bubble(new int[]{6, 5, 4, 3, 2, 1}));
    }

    // @Test
    // public void bubbleSort7Test(){
    //      Assertions.assertArrayEquals(
    //              ArraysUtils.arrayRandom(50, 100),
    //             SortsUtils.bubble(ArraysUtils.arrayRandom(50, 100)));
    //  }

    @Test
    public void bubbleSort8Test() {
        Assertions.assertArrayEquals(
                new int[]{11, 13, 16, 24, 35, 36},
                SortsUtils.bubble(ArraysUtils.arrayFromConsole()));
    }

    @Test
    public void bubbleSort9Test() {
        Assertions.assertArrayEquals(
                new int[]{-2, 10, 14, 15, 15, 31},
                SortsUtils.bubble(new int[]{10, -2, 31, 14, 15, 15}));
    }

    @Test
    public void bubbleSort10Test() {
        Assertions.assertArrayEquals(
                new int[]{0, 0, 1, 2, 3},
                SortsUtils.bubble(new int[]{3, 0, 1, 0, 2}));
    }

}

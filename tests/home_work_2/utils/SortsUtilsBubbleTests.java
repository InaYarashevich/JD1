package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.Logger;


public class SortsUtilsBubbleTests {
    public static final Logger LOGGER =
            Logger.getLogger(SortsUtilsBubbleTests.class.getName());

    @Test
    public void bubbleSort1Test() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.bubble(array)));
        Assertions.assertArrayEquals(
                array,
                SortsUtils.bubble(array));
    }

    @Test
    public void bubbleSort2Test() {
        int[] array = new int[]{1, 1, 1, 1};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.bubble(array)));
        Assertions.assertArrayEquals(
                array,
                SortsUtils.bubble(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void bubbleSort3Test() {
        int[] array = new int[]{9, 1, 5, 99, 9, 9};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.bubble(array)));
        Assertions.assertArrayEquals(
                new int[]{1, 5, 9, 9, 9, 99},
                SortsUtils.bubble(array));
    }

    @Test
    public void bubbleSort5Test() {
        int[] array = new int[]{};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.bubble(array)));
        Assertions.assertArrayEquals(
                new int[]{},
                SortsUtils.bubble(array));
    }

    @Test
    public void bubbleSort6Test() {
        int[] array = new int[]{6, 5, 4, 3, 2, 1};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.bubble(array)));
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                SortsUtils.bubble(array));
    }

   /* @Test
    public void bubbleSort7Test() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int[] sortedArray = new int[array.length];
        Assertions.assertArrayEquals(
                sortedArray,
                SortsUtils.bubble(array));
    }

    @Test
    public void bubbleSort8Test() {
        Assertions.assertArrayEquals(
                new int[]{11, 13, 16, 24, 35, 36},
                SortsUtils.bubble(ArraysUtils.arrayFromConsole()));
    }*/

    @Test
    public void bubbleSort9Test() {
        int[] array = new int[]{-2, 31, 0, 15, 16, 15};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.bubble(array)));
        Assertions.assertArrayEquals(
                new int[]{-2, 0, 15, 15, 16, 31},
                SortsUtils.bubble(array));
    }

    @Test
    public void bubbleSort10Test() {
        int[] array = new int[]{3, 0, 1, 0, 2};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.bubble(array)));
        Assertions.assertArrayEquals(
                new int[]{0, 0, 1, 2, 3},
                SortsUtils.bubble(array));
    }
}

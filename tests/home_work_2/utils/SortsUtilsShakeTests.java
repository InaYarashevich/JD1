package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.Logger;

public class SortsUtilsShakeTests {
    public static final Logger LOGGER =
            Logger.getLogger(SortsUtilsBubbleTests.class.getName());

    @Test
    public void shakeSort1Test() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.shake(array)));
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                SortsUtils.shake(array));
    }

    @Test
    public void shakeSort2Test() {
        int[] array = new int[]{1, 1, 1, 1};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.shake(array)));
        Assertions.assertArrayEquals(
                array,
                SortsUtils.shake(array));
    }

    @Test
    public void shakeSort3Test() {
        int[] array = new int[]{9, 1, 5, 99, 9, 9};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.shake(array)));
        Assertions.assertArrayEquals(
                new int[]{1, 5, 9, 9, 9, 99},
                SortsUtils.shake(array));
    }

    @Test
    public void shakeSort5Test() {
        int[] array = new int[]{};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.shake(array)));
        Assertions.assertArrayEquals(
                new int[]{},
                SortsUtils.shake(array));
    }

    @Test
    public void shakeSort6Test() {
        int[] array = new int[]{6, 5, 4, 3, 2, 1};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.shake(array)));
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                SortsUtils.shake(array));
    }

    @Test
    public void shakeSort7Test() {
        int[] array = new int[]{-2, 31, 0, 15, 16, 15};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.shake(array)));
        Assertions.assertArrayEquals(
                new int[]{-2, 0, 15, 15, 16, 31},
                SortsUtils.shake(array));
    }

    @Test
    public void shakeSort8Test() {
        int[] array = new int[]{3, 0, 1, 0, 2};
        LOGGER.info(Arrays.toString(array) + " -> " + Arrays.toString(SortsUtils.shake(array)));
        Assertions.assertArrayEquals(
                new int[]{0, 0, 1, 2, 3},
                SortsUtils.shake(array));
    }

    /* @Test
    public void shakeSort9Test() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int[] sortedArray = new int[array.length];
        Assertions.assertArrayEquals(
                sortedArray,
                SortsUtils.shake(array));
    }

    @Test
    public void shakeSort10Test() {
        Assertions.assertArrayEquals(
                new int[]{11, 13, 16, 24, 35, 36},
                SortsUtils.shake(ArraysUtils.arrayFromConsole()));
    }*/
}

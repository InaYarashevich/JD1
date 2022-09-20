package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsShakeTests {
    @Test
    public void bubbleSort1Test() {
        Assertions.assertArrayEquals(
                new int[]{6, 5, 4, 3, 2, 1},
                SortsUtils.shake(new int[]{1, 2, 3, 4, 5, 6}));
    }
}

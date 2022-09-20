package home_work_2.loops;

import home_work_2.loops.loops_rework.Task1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tak1_1Test {
    @Test
    public void multiplyTest() {
        Assertions.assertEquals(
                6,
                Task1_1.multiply(3));
    }

    @Test
    public void multiply2Test() {
        Assertions.assertEquals(
                120,
                Task1_1.multiply(5));
    }

    @Test
    public void multiplyEachTest() {
        Assertions.assertEquals(
                3628800,
                Task1_1.multiply(10));
    }
}

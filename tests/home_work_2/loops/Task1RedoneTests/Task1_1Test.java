package home_work_2.loops.Task1RedoneTests;

import home_work_2.loops.Task1Redone.Task1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_1Test {
    @Test
    public void multiplyTest() {
        Assertions.assertEquals(
                "1 * 2 * 3 = 6",
                Task1_1.multiply(3));
    }

    @Test
    public void multiply2Test() {
        Assertions.assertEquals(
                "1 * 2 * 3 * 4 * 5 = 120",
                Task1_1.multiply(5));
    }

    @Test
    public void multiply3Test() {
        Assertions.assertEquals(
                "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800",
                Task1_1.multiply(10));
    }

    @Test
    public void multiply4Test() {
        Assertions.assertEquals(
                " = 1",
                Task1_1.multiply(0));
    }
}

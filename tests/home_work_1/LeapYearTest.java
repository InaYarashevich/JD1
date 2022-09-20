package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Test
    public void checkLeapYear1Test() {
        Assertions.assertEquals(
                true,
                LeapYear.checkIfLeapYear(2000));
    }

    @Test
    public void checkLeapYear2Test() {
        Assertions.assertEquals(
                true,
                LeapYear.checkIfLeapYear(1996));
    }

    @Test
    public void checkLeapYear3Test() {
        Assertions.assertEquals(
                false,
                LeapYear.checkIfLeapYear(1900));
    }

    @Test
    public void checkLeapYear4Test() {
        Assertions.assertEquals(
                false,
                LeapYear.checkIfLeapYear(2023));
    }
}

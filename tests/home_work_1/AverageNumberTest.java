package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageNumberTest {
    @Test
    public void getAverageNumberTest(){
        Assertions.assertEquals(
                5,
                AverageNumber.getAverageNumber(1, 8, 5));
    }

    @Test
    public void getAverageNumberFromThreeSameTest(){
        Assertions.assertEquals(
                1,
                AverageNumber.getAverageNumber(1, 1, 1));
    }

    @Test
    public void getAverageNumberFromTwoEqualAndOneDifferentTest(){
        Assertions.assertEquals(
                2,
                AverageNumber.getAverageNumber(2, 2, 1));
    }
}

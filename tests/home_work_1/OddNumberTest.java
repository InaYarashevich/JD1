package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddNumberTest {
    @Test
    public void checkOddNumberTest(){
        Assertions.assertFalse(
                OddNumber.checkOddNumber(6));
    }

    @Test
    public void checkNotOddNumberTest(){
        Assertions.assertTrue(
                OddNumber.checkOddNumber(5));
    }

    @Test
    public void checkOddNegativeNumberTest(){
        Assertions.assertFalse(
                OddNumber.checkOddNumber(-2));
    }

    @Test
    public void checkNotOddNegativeNumberTest(){
        Assertions.assertTrue(
                OddNumber.checkOddNumber(-1));
    }

    @Test
    public void checkZeroTest(){
        Assertions.assertFalse(
                OddNumber.checkOddNumber(0));
    }
}

package home_work_2.loops.Task1RedoneTests;

import home_work_2.loops.Task1Redone.Task1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_2Tests {
    @Test
    public void multiplyEachTest(){
        Assertions.assertEquals(
                "Введено целое\n1 * 2 * 3 = 6",
                Task1_2.multiplyEach("123"));
    }

    @Test
    public void multiplyEach2Test(){
        Assertions.assertEquals(
                "Введено не число",
                Task1_2.multiplyEach(null));
    }

    @Test
    public void multiplyEach3Test(){
        Assertions.assertEquals(
                "Введено не целое число",
                Task1_2.multiplyEach("0.001"));
    }

    @Test
    public void multiplyEach4Test(){
        Assertions.assertEquals(
                "Введено не целое число",
                Task1_2.multiplyEach("qwerty"));
    }
}

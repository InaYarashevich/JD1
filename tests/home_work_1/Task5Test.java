package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {
    @Test
    public void checkFreeOrNot1Test(){
        Assertions.assertTrue(
                Task5.checkFreeOrNot(true, true));
    }

    @Test
    public void checkFreeOrNot2Test(){
        Assertions.assertTrue(
                Task5.checkFreeOrNot(true, false));
    }

    @Test
    public void checkFreeOrNot3Test(){
        Assertions.assertFalse(
                Task5.checkFreeOrNot(false, true));
    }

    @Test
    public void checkFreeOrNot4Test(){
        Assertions.assertTrue(
                Task5.checkFreeOrNot(false, false));
    }
}


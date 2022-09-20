package home_work_2.loops;

import home_work_2.loops.loops_rework.Task1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_3Test {
    @Test
    public void power1Test(){
        Assertions.assertEquals(125, Task1_3.power(5, 3));
    }

    @Test
    public void power2Test(){
        Assertions.assertEquals(1, Task1_3.power(1, 100));
    }

    @Test
    public void power3Test(){
        Assertions.assertEquals(1000.0, Task1_3.power(10.0, 3));
    }
}

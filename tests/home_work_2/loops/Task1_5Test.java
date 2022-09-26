package home_work_2.loops;

import home_work_2.loops.loops_redone.Task1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_5Test {
    @Test
    public void findMaxInt(){
        Assertions.assertEquals(5, Task1_5.findMaxInt(52341));
    }

    @Test
    public void findRateOfEvenNumbers(){
        //Assertions.assertEquals();
    }

    @Test
    public void countEvenNumbers1Test(){
        Assertions.assertEquals(2, Task1_5.countEvenNumbers(2453));
    }

    @Test
    public void countEvenNumbers2Test(){
        Assertions.assertEquals(0, Task1_5.countEvenNumbers(11111));
    }

    @Test
    public void countOddNumbers1Test(){
        Assertions.assertEquals(5, Task1_5.countOddNumbers(11111));
    }

    @Test
    public void countOddNumbers2Test(){
        Assertions.assertEquals(0, Task1_5.countOddNumbers(2468));
    }

    @Test
    public void getNumberInReverseOrderTest(){
        Assertions.assertEquals(8642, Task1_5.getNumberInReverseOrder(2468));
    }

    @Test
    public void printFibonacciSequenceTest(){

    }

    @Test
    public void printNumberSequenceWithStepTest(){

    }
}

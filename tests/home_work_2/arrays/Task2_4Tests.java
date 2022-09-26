package home_work_2.arrays;

        import home_work_2.arrays.Task2_4;
        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

public class Task2_4Tests {
    @Test
    public void getSumOfEvenPositiveNumbers1Test() {
        Assertions.assertTrue(
                (Task2_4.getSumOfEvenPositiveNumbers(50, 100) >= 0)
                        && (Task2_4.getSumOfEvenPositiveNumbers(50, 100) % 2 == 0));
    }

    @Test
    public void getSumOfEvenPositiveNumbers2Test() {
        Assertions.assertTrue(
                (Task2_4.getSumOfEvenPositiveNumbers(5, 100) >= 0)
                        && (Task2_4.getSumOfEvenPositiveNumbers(5, 100) % 2 == 0));
    }

    @Test
    public void getMaxTest() {
        Assertions.assertNotNull(Task2_4.getMax(10, 100));
    }

    @Test
    public void getElementsLessThanArithmeticMeanTest(){
        Assertions.assertNotNull(Task2_4.getElementsLessThanArithmeticMean(5, 100).length);
    }

    @Test
    public void getSumOfArrayElementsNumbersTest(){
        Assertions.assertNotNull(Task2_4.getSumOfArrayElementsNumbers(5, 200));
    }

    @Test
    public void removeElementsFromArray(){
        Assertions.assertArrayEquals(new int[]{}, Task2_4.removeElementsFromArray(5, 100));
    }
}

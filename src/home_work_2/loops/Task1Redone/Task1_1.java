package home_work_2.loops.Task1Redone;

public class Task1_1 {
    public static String multiply(long number) {
        String result = "";
        long multiplyResult = 1;
        for (long i = number; i > 0; i--) {
            multiplyResult *= i;

            if (!(i == number)) {
                result = " * " + result;
            }
            result = i + result;
        }
        return result + " = " + multiplyResult;
    }
}

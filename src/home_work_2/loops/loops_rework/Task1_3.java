package home_work_2.loops.loops_rework;

public class Task1_3 {
    public static double power(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}

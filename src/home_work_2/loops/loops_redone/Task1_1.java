package home_work_2.loops.loops_redone;

public class Task1_1 {
        public static long multiply(long number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
            if (!(i == number)) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }
        }
        return result;
    }
}

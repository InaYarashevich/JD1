package home_work_2.loops;

public class Task1_4 {
    public static void main(String[] args) {
        multiply(999999999);
    }

    public static void multiply(long number) {
        long a = 1;
        long result = 0;
        while (true) {
            result = a * number;
            if (result < 0){
                System.out.println("Результат после переполнения: " + result);
            }
        }
    }
}

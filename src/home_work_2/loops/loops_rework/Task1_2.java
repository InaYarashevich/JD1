package home_work_2.loops.loops_rework;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            System.out.println("Введено целое");
            String result = "";
            long number = scanner.nextInt();
            long multipleResult = 1;
            boolean needStar = false;
            while (number != 0){
                long digit = number % 10;

                if(needStar){
                    result = " * " + result;
                } else {
                    needStar = true;
                }

                result = digit + result;
                number /= 10;
                multipleResult *= digit;
            }
            System.out.println(result + " = " + multipleResult);
        } else if(scanner.hasNextDouble()){
            System.out.println("Введено не целое число");
        } else {
            System.out.println("Введено не число");
        }
    }

}

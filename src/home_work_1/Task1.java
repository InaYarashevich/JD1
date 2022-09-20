package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int firstNumber = in.nextInt(); // 5 = 101
        System.out.println("Input the 2nd number: ");
        int secondNumber = in.nextInt(); // 1 = 001

        int andResult = getBitwiseAndResult(firstNumber, secondNumber);
        int orResult = getBitwiseOrResult(firstNumber, secondNumber);

        System.out.println("& result: " + andResult);  // = 1 - по основанию 2, или 1 - по основанию 10
        System.out.println("| result: " + orResult); // = 101 - по основанию 2, или 5 по основанию 10
        // 42.5 - после нажатия Enter падает ошибка InputMismatchException
        // при попытке выполнить операции, заменив на double переменные, IDE
        // подчеркивает выражения с & | и пишет, что невозможно выполнить операции
        // типа & | с 'double'
    }

    public static int getBitwiseAndResult(int firstNumber, int secondNumber){
        return firstNumber & secondNumber;
    }

    public static int getBitwiseOrResult(int firstNumber, int secondNumber){
        return firstNumber | secondNumber;
    }
}

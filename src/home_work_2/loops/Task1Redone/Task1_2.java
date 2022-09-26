package home_work_2.loops.Task1Redone;

public class Task1_2 {
    public static String multiplyEach(String data) {
        if (data == null) {
            return "Введено не число";
        }

        try {
            long number = Long.parseLong(data);
            String result = "";
            long multipleResult = 1;
            boolean needStar = false;
            while (number != 0) {
                long digit = number % 10;

                if (needStar) {
                    result = " * " + result;
                } else {
                    needStar = true;
                }

                result = digit + result;
                number /= 10;
                multipleResult *= digit;
            }
            return ("Введено целое\n" + result + " = " + multipleResult);

        } catch (NumberFormatException e) {
            return "Введено не целое число";
        }
    }
}

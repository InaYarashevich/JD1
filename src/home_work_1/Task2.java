package home_work_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 7;
        boolean bool1 = true;
        boolean bool2 = false;

        int result1 = task2_1(a, b, c);
        System.out.println(result1); // результат выполнения программы = 5, но верный результат = 5.25. Дробная часть
        // обрезалась в результате, так как тип данных результата - int

        int result2 = task2_2(a, b, c);
        System.out.println(result2); //результат выполнения программы = 0, результат вычислений = 0.875 (в рез-те типа int
        //отсекается дробная часть)

        int result3 = task2_3(a, b, c);
        System.out.println(result3); // рез-тат выполнения программы = 0, т.к. рез-тат - переменная int, дробная
        // часть которой отрезается;
        // порядок расчета: a+b = 7 => 7 / 8 = 0.875

        int result4 = task2_4(a, b, c);
        System.out.println(result4); // рез-т=1, т.к. сначала выполняем выражение 5+2,
        // затем --с = 8-1 = 7 => 7/7 = 1; далее b будет равен 3

        int result5 = task2_5(a, b, c);
        System.out.println(result5); // рез-т выполнения = 0
        // порядок выполнения:
        // 1. b >> b - нужно сдвинуть вправо на 2 позиции (2/2 = 1; 1/2 = 0.5);
        // 2. 5 * 0.5 = 2.5;
        // 3. 2.5 / 7 = 0.35714286; => 0, так как int тип

        int result6 = task2_6(a, b, c, d);
        System.out.println(result6); // рез-т выполнения = 1
        // 1. проверяем условие a + d > 20 - false
        // 2. идем в ветку 22 * b >> b++
        // 3. сдвиг вправо на 2 позиции числа b ( 2/2 = 1; 1/2 = 0.5)
        // 4. 22 * 0.5 = 11
        // 5. --8 = 7
        // 6. 11 / 7 = 1.5714285714285
        // 7. b++ = 3
        // 9. обрезаем в результате дробную часть и получаем 1

       // int result7 = task2_7(a, b, c); // рез-т = ошибка компиляции -bad operand types for binary operator '/'
       // System.out.println(result7);

        boolean result8 = task2_8();
        System.out.println(result8); // результат выполнения = false
        // 1. 6 - 2 = 4;
        // 2. 4 > 3 = true;
        // 3. 12 * 12 = 144;
        // 4. 144 <= 119 = false;
        // 5. true && false = false;
        // 6. result = false

        boolean result9 = task2_9(bool1, bool2);
        System.out.println(result9);
        // result = false, так как true и false дают false

    }

    public static int task2_1(int a, int b, int c) {
        return a + b / c;
    }

    public static int task2_2(int a, int b, int c) {
        return (a + b) / c;
    }

    public static int task2_3(int a, int b, int c) {
        return (a + b++) / c;
    }

    public static int task2_4(int a, int b, int c) {
        return (a + b++) / --c;
    }

    public static int task2_5(int a, int b, int c) {
        return (a * b >> b++) / --c;
    }


    public static int task2_6(int a, int b, int c, int d) {
        return (a + d > 20 ? 68 : 22 * b >> b++) / --c;
    }

   // public static int task2_7(int a, int b, int c) {
   //     return (a + 7 > 20 ? 68 >= 68 : 22 * b >> b++) / --c;
    //}

    public static boolean task2_8() {
        return 6 - 2 > 3 && 12 * 12 <= 119;
    }

    public static boolean task2_9(boolean a, boolean b) {
        return a && b;
    }

}

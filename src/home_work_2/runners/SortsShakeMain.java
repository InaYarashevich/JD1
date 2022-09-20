package home_work_2.runners;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsShakeMain {
    public static void main(String[] args) {
        int[] initialArray1 = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(initialArray1) + " -> " + Arrays.toString(SortsUtils.shake(initialArray1)));

        int[] initialArray2 = new int[]{1,1,1,1};
        System.out.println(Arrays.toString(initialArray2) + " -> " + Arrays.toString(SortsUtils.shake(initialArray2)));

        int[] initialArray3 = new int[]{9,1,5,99,9,9};
        System.out.println(Arrays.toString(initialArray3) + " -> " + Arrays.toString(SortsUtils.shake(initialArray3)));

        int[] initialArray4 = new int[]{};
        System.out.println(Arrays.toString(initialArray4) + " -> " + Arrays.toString(SortsUtils.shake(initialArray4)));

        int[] initialArray5 = new int[]{6,5,4,3,2,1};
        System.out.println(Arrays.toString(initialArray5) + " -> " + Arrays.toString(SortsUtils.shake(initialArray5)));

        int[] initialArray6 = ArraysUtils.arrayRandom(50, 100);
        System.out.println(Arrays.toString(initialArray6) + " -> " + Arrays.toString(SortsUtils.shake(initialArray6)));

        int[] initialArray7 = ArraysUtils.arrayFromConsole();
        System.out.println(Arrays.toString(initialArray7) + " -> " + Arrays.toString(SortsUtils.shake(initialArray7)));
    }
}

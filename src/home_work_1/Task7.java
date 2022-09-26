package home_work_1;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(array));
    }

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "";
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                phoneNumber = phoneNumber.concat("(");
            } else if (i == 3) {
                phoneNumber = phoneNumber.concat(") ");
            } else if (i == 6) {
                phoneNumber = phoneNumber.concat("-");
            }
            phoneNumber = phoneNumber.concat(String.valueOf(numbers[i]));
        }
        return phoneNumber;
    }
}

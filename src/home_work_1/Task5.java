package home_work_1;

public class Task5 {
    public static void main(String[] args) {
        Task5.checkFreeOrNot(true, true);
        Task5.checkFreeOrNot(true, false);
        Task5.checkFreeOrNot(false, true);
        Task5.checkFreeOrNot(false, false);
    }

    public static boolean checkFreeOrNot(boolean vacation, boolean weekend){
        return vacation || !weekend;
    }
}

package home_work_7.comparator;

import java.util.Comparator;

public class ComparatorInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

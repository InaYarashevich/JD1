package home_work_7.comparator;

import java.util.Comparator;

public class ComparatorString implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}

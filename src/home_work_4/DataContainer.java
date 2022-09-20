package home_work_4;

import home_work_4.comparators.ComparatorComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T>{

    private T[] data;

    public DataContainer(T[] data) {
        this.data = Arrays.copyOf(data, data.length); //copy, чтобы первоначальный объект оставался нетронутым
    }


   /* public int add(T item) {
        if (item == null) {
            return -1;
        }
        int indexForInsert = -1;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null){
                indexForInsert = i;
                break;
            }
        }
    }*/

    public T get(int index) {
        return data[index];
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        T[] newArray = Arrays.copyOf(data, data.length);
        if ((index < 0) || (index >= data.length)) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (i == index) {
                data[i] = null;
            }
            newArray[j++] = data[i];
        }
        return true;
    }

    public boolean delete(T item) {
        T[] newArray = null;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                T first = data[0];
                data[i] = null;
                data[i] = data[i + 1];
                newArray = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    public void sort(Comparator<T> cmp){
        DataContainer.sort(this, cmp);
    }

    public static void sort(DataContainer<? extends Comparable> container){
        DataContainer.sort(container, new ComparatorComparable());
    }

    public static <T> void sort(DataContainer<T> container, Comparator<? super T> cmp){
        boolean sorted;
        do {
            sorted = true;
            for (int j = 0; j < container.data.length-1; j++){
                if(cmp.compare(container.data[j], container.data[j + 1]) > 0){
                    sorted = false;
                    T tmp = container.data[j + 1];
                    container.data[j + 1] = container.data[j];
                    container.data[j] = tmp;
                }
            }
        } while (!sorted);
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

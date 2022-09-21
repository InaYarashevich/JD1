package home_work_4;

import home_work_4.comparators.ComparatorComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class DataContainer<T> implements Iterable<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = Arrays.copyOf(data, data.length); //copy, чтобы первоначальный объект оставался нетронутым
    }


    public int add(T item) {
        if (item == null) {
            return -1;
        }

        int indexForInsert = -1;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                indexForInsert = i;
                break;
            }
        }

        if (indexForInsert == -1) {
            indexForInsert = this.data.length;
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }

        this.data[indexForInsert] = item;

        return indexForInsert;
    }

    public T get(int index) {
        if (!checkIndexExist(index)) {
            return null;
        }
        return this.data[index];
    }


    public T[] getItems() {
        return data;
    }

    private boolean checkIndexExist(int index) {
        return index >= 0 && index < this.data.length;
    }


    public boolean delete(int index) {
        if (!checkIndexExist(index)) {
            return false;
        }

        for (int i = index + 1; i < this.data.length; i++) {
            this.data[i - 1] = this.data[i];
        }
        this.data = Arrays.copyOf(this.data, this.data.length - 1);
        return true;
    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < this.data.length; i++) {
            if (Objects.equals(this.data[i], item)) {
                return delete(i);
            }
        }
        return false;
    }

    public void sort(Comparator<T> cmp) {
        DataContainer.sort(this, cmp);
    }

    public static void sort(DataContainer<? extends Comparable> container) {
        DataContainer.sort(container, new ComparatorComparable());
    }

    public static <T> void sort(DataContainer<T> container, Comparator<? super T> cmp) {
        boolean sorted;
        do {
            sorted = true;
            for (int j = 0; j < container.data.length - 1; j++) {
                if (cmp.compare(container.data[j], container.data[j + 1]) > 0) {
                    sorted = false;
                    T tmp = container.data[j + 1];
                    container.data[j + 1] = container.data[j];
                    container.data[j] = tmp;
                }
            }
        } while (!sorted);
    }

    public Iterator<T> iterator() {
        return new Iter();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        boolean needComma = false;
        for (T datum : this.data) {
            if (datum != null) {
                if (needComma) {
                    builder.append(", ");
                } else {
                    needComma = true;
                }
                builder.append(datum);
            }
        }
        builder.append("]");
        return builder.toString();
    }

    private class Iter implements Iterator<T> {
        private int currentPosition = -1;

        @Override
        public boolean hasNext() {
            return checkIndexExist(currentPosition + 1);
        }

        @Override
        public T next() {
            return data[++currentPosition];
        }

        @Override
        public void remove() {
            delete(currentPosition);
        }
    }
}

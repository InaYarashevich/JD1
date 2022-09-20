package home_work_4;

public class DataContainerMain4 {
    public static void main(String[] args) {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1,2,3});

        //System.out.println(container.add(777));
        //System.out.println(container.add(null));
        System.out.println(container.delete(2));

        //System.out.println(container.delete(3));

        //System.out.println(container);
    }
}

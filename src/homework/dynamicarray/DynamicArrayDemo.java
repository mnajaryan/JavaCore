package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray ex1 = new DynamicArray();
        for (int i = 1; i <= 50; i++) {
            ex1.add(i);
        }
        ex1.print();
        System.out.println();
        System.out.println(ex1.getByIndex(11));
        System.out.println(ex1.getByIndex(-11));

    }
}

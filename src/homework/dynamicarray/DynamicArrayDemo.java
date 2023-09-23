package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray ex1 = new DynamicArray();
        for (int i = 1; i <= 35; i++) {
            ex1.add(i);
        }
//        ex1.print();
        System.out.println();
//        System.out.println(ex1.getByIndex(11));
//        System.out.println(ex1.getByIndex(-11));

//        ex1.deleteByIndex(16);
//        System.out.println();
//        ex1.deleteByIndex(-16);
//        ex1.deleteByIndex(56);
//        ex1.deleteByIndex(8);
//        ex1.set(1, 55);
//        ex1.addElem(1,55);
//        System.out.println();
//        ex1.addElem(16, 99);
//        System.out.println(ex1.exists(70));
//        System.out.println(ex1.exists(7));
        System.out.println(ex1.getIndexByValue(7));

    }
}

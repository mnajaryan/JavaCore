package homework.dynamicarray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;


    public void add(int value) {
        if (array.length == size){
            extend();
        }
        array[size++] = value;
    }


    private void extend() {
        int[] array2 = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }


    public int getByIndex(int index) {
        if(index < size && index > -1){
            return array[index];
        }else
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > array[size-1]){
            System.out.println("false index");
            return;
        } else {
            for (int i = index; i < size; i++) {
                array[i - 1] = array[i];
            }
        }
        size--;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public void set(int index, int value) {
        if (index < 0 || index > array[size-1]){
            System.out.println("false index");
            return;
        }else{
            array[index] = value;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public void addElem(int index, int value) {
        if (index < 0 || index > array[size-1]){
            System.out.println("false index");
            return;
        }else{
            size++;
            for (int i = size; i > index; i--) {
                int tmp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = tmp;
            }
            array[index] = value;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public boolean exists(int value) {
        for (int i : array) {
            if (value == array[i]){
                return true;
            }
        }
        return false;
    }


    public int getIndexByValue(int value) {
        for (int i : array) {
            if (value == array[i]){
                return i;
            }
        }
        return -1;
    }

}

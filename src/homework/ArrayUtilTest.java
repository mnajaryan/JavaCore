package homework;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] number = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        ArrayUtil arr = new ArrayUtil();
        arr.numbers = number;

        arr.seeAllElem();
        arr.firstElem();
        arr.lastElem();
        arr.arrayLength();
        arr.minNum();
        arr.numOfEven();
        arr.numOfOdd();
        arr.printSum();
        arr.printAverage();
        arr.middlNum();

    }
}

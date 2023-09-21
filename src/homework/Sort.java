package homework;

public class Sort {
    public static void main(String[] args) {

        int[] arrSort = {1, 60, 2, 3, 0, 9, 20};

        //Վերանայած տարբերակը

        for (int i = 0; i < arrSort.length; i++) {
            for (int j = 1; j < arrSort.length; j++) {
                if (arrSort[j - 1] > arrSort[j]){
                    int x;
                    x = arrSort[j];
                    arrSort[j] = arrSort[j - 1];
                    arrSort[j - 1] = x;
                }
            }
        }
        for (int i : arrSort) {
            System.out.print(i + ", ");
        }
    }
}

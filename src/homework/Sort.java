package homework;

public class Sort {
    public static void main(String[] args) {

        int[] arrSort = {1, 60, 2, 3, 0, 9, 20};

        for (int j = 0; j < arrSort.length; j++) {
            for (int i = 0; i < arrSort.length; i++) {
                if (arrSort[i] != arrSort[arrSort.length-1] &&
                           arrSort[i] > arrSort[i+1]){
                    int x;
                    x = arrSort[i];
                    arrSort[i] = arrSort[i + 1];
                    arrSort[i + 1] = x;
                }
                if (j == arrSort.length-1){
                    System.out.print(arrSort[i] + ",");
                }
            }
        }

        // մի քիչ շատ խառը ստացվեց, կվերանայեմ ☻
    }
}

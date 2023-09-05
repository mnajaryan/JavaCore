package exampleOfBook;

public class Array {
    public static void main(String[] args) {
        //the first type
//        int[] array = new int[5];
//
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//        int[] arr2 = {1, 2, 3, 4, 5};
//
//        // other type
//
//        char[][] arrayOfChar = new char[2][3];
//        char  k = 'A';
//        int i, j;
//        for ( i = 0; i < 2; i++) {
//            for (j = 0; j < 3; j++) {
//                arrayOfChar[i][j] = k;
//                k++;
//            }
//        }
//        for (i = 0; i < 2; i++) {
//            for (j = 0; j < 3; j++) {
//                System.out.print(arrayOfChar[i][j] + ",");
//            }
//            System.out.println();
//        }

        int[][] arr3 = {
                {1111, 2222, 3333},
                {4444, 5555, 6666},
                {7777, 8888, 9999}
        };
        for (int l = 0; l <= 2; l++) {
            for (int p = 0; p <= 2; p++) {
                System.out.print(arr3[l][p] + " ");
            }
            System.out.println();
        }
    }
}

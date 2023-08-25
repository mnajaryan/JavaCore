package homework;

public class ex1For {
    public static void main(String[] args) {

        // ex 1
        System.out.println(" Example 1");
        System.out.println("******\n******\n******\n******\n******\n******");

        // ex 2
        System.out.println("\n Example 2");
        for (int i = 0; i < 6; i++) {
            System.out.println("******");
        }

        // ex 3
        System.out.println("\n Example 3");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();


        }// ex 4
        System.out.println("\n Example 4");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j <= 5){
                    System.out.print("*");
                }
                if (j == 5){
                    System.out.println();
                }
            }
        }



    }

}

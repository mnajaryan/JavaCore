package homework;

public class FigurePainter {
    public static void main(String[] args) {

        System.out.println("with for");
        System.out.println("Ex 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Ex 2");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Ex 3");
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                if (j < i){
                    System.out.print(" ");
                }
                if (j >= i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("Ex 4");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > j) {
                    System.out.print(" ");
                }
                if (i <= j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("Ex 5");
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                if (j < i){
                    System.out.print(" ");
                }
                if (j >= i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j) {
                    System.out.print(" ");
                }
                if (i <= j){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        System.out.println("with arrey");
        System.out.println("soon...");

    }
}

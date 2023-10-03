package exampleOfBook.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("pleas input numbers divided by , ");
        String numbers = scanner.nextLine();
        String[] numbersArr = numbers.split(",");
        int[] numbersnum = new int[numbersArr.length];
        int index = 0;
        for (String s : numbersArr) {
            numbersnum[index++] = Integer.parseInt(s);
        }
        for (int i : numbersnum) {
            System.out.println(i);
        }



    }
}

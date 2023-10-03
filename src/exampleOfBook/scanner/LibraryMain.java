package exampleOfBook.scanner;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();

        boolean isRun = true;
        while (isRun){
            System.out.println("Please input 1 for EXIT");
            System.out.println("Please input 2 for ADD BOOK");
            System.out.println("Please input 3 for SEARCH");
            System.out.println("Please input 4 for ALL BOOK");
            String command = scanner.nextLine();
            switch (command){
                case "1":
                    isRun = false;
                    break;
                case "2":
                    System.out.println("Please input book title!");
                    String title = scanner.nextLine();
                    System.out.println("Please input autor name!");
                    String autorName = scanner.nextLine();
                    System.out.println("Please input price!");
                    int price = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input count!");
                    int count = Integer.parseInt(scanner.nextLine());
                    Book book = new Book(title, autorName, price, count);
                    bookStorage.add(book);
                    System.out.println("Book created!!!");
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case "4":
                    System.out.println("-------------");
                    bookStorage.print();
                    System.out.println("-------------");
                    break;
                default:
                    System.out.println("Try again!");
            }
        }



    }
}

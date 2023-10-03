package exampleOfBook.scanner;

public class Book {

   private String title;
   private String authorName;
   private int price;
   private int count;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Book(String title, String authorName, int price, int count) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.count = count;
    }

    public Book() {
    }
}

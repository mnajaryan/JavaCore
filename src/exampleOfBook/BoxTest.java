package exampleOfBook;

public class BoxTest {

    public static void main(String[] args) {

        Box myBox = new Box(5, 4, 6);
        Box myBox2 = new Box(1, 2, 3);
        myBox.color = "Red";

        int x = myBox2.height;
        int vol = myBox.dept * myBox.height * myBox.width;
        System.out.println(myBox.color + " box vol is : " + vol);
        System.out.println(x);
    }
}

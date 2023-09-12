package exampleOfBook;

public class BoxTest {

    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.width = 5;
        myBox.height = 4;
        myBox.dept = 3;
        myBox.color = "Red";

        int vol = myBox.dept * myBox.height * myBox.width;

        System.out.println(myBox.color + " box vol is : " + vol);
    }
}

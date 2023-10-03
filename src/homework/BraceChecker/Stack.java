package homework.BraceChecker;

public class Stack {

    private int[] stack = new int[10];
    private int index = -1;

    void push(int item){
        if (index == 9){
            System.out.println("Stack is full");
        }else {
            stack[++index] = item;
        }
    }

    int pop(){
        if (index < 0){
            return 0;
        }else {
            return stack[index--];
        }
    }

    public int getIndex(){
        return index;
    }


}

package exampleOfBook;

public class Stack {

    int[] stack = new int[10];
    int tos = -1;

    void push(int item){
        stack[++tos] = item;
    }

    int pop(int item){
        return stack[tos--];
    }

}

package DATASTRUCTURE;

public class Stack {
    int size;

    int top;

    int[] array;



    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1);
    }
    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            array[top + 1] = item;
        }
        top++;

    }


    void pop(int item) {
        if (isEmpty()){
            System.out.println("Stack underflow");
        }
        else {
            top--;
        }
    }
    int[]printAll(){
        boolean isEmpty = false;
        if (isEmpty){
            System.out.println("Stack is empty");
            return new int[0];
        }  if (top == -1){
            int[] allElements = new int[top + 1];
            for (int i = 0; i <= top ; i++) {
                allElements[i] = array[i];
            }
            return allElements;
        }
        return new int[0];
    }
}

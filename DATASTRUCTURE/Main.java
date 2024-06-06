package DATASTRUCTURE;

public class Main {
    public static void main(String[] args) {
        DATASTRUCTURE.Stack myStack = new DATASTRUCTURE.Stack(10);
        myStack.push(2);
        myStack.push(4);
        myStack.push( 6);
        myStack.push(8);
        myStack.pop(7);
        myStack.pop(6);

        int[] allElements = myStack.printAll();
        //for(int i = 0; i<allElements.length; i++){
            //System.out.println(allElements[i]);
       // }
        for (int element: allElements){
         System.out.println(element);
        }

    }
}

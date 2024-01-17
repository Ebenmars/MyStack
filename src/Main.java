public class Main {
    public static void main(String[] args) {
       Stack myStack = new Stack(4);
       myStack.push(3);
        myStack.push(11);
        myStack.push(100);
//        myStack.pop();
        myStack.viewTop();
        myStack.viewHeight();
        myStack.printStack();
    }
}
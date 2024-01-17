public class Stack {

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    private Node top;
    private int height;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(top != null){
            top.next = newNode;
            top = newNode;
        }
        height++;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){

        }
    }



}

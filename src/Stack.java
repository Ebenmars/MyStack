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

        if(height == 0){
           top = newNode;
        }
        else{
           newNode.next = top;
           top = newNode;
        }
        height++;
    }

    public Node pop(){
        //store the value
        Node temp = top;
        //Node poppedNode = null;
        if(height == 0){
            return null;
        }
        else{
            top = top.next;
            temp.next = null;

            //This works
//            Node nextNode = top.next;
//            poppedNode = nextNode;
//            poppedNode = top;
//            top = nextNode;
        }

        height--;
        return temp;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.value);
            if(temp != null){
                System.out.print("-> ");
            }
            temp = temp.next;
        }
    }


    public void viewTop(){
        System.out.println("Top " + top.value);
    }
    public void viewHeight(){
        System.out.println("Height " + height);
    }




}

// In this we will talk about the Circular LinkeList
public class CircularLL{

    private Node head;
    private Node tail;

    public CircularLL(){
        this.head = null;
        this.tail = null;
    }

    // Inserting in circular linkedlist
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    // Deletion of linkedlist in Circular LinkedList
    public void delete(int val){
        Node node = head;
        if (node == null) {
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    // Printing part
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }
            while(node != head);
        }
        System.out.println("Head");
    }

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}

public static void main(String[] args) {
    CircularLL list = new CircularLL();
    list.insert(67);
    list.insert(1);
    list.insert(89);
    list.insert(6);

    list.delete(89);
    list.display();
}
}
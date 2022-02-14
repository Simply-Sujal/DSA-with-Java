class Node{
    // properties
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    // constructor 
    void display(int data , Node next){
        this.data = data;
        next = null;
    }
}

public class NodeFormation{
    public static void main(String[] args) {
        Node n1 = new Node(10);
        System.out.println(n1.data);
        System.out.println(n1.next);

        Node n2 = new Node(20);
        n1.next = n2;
        System.out.println(n2);
        System.out.println(n1.next);
    }
}

class Node<T>{
    // properties of nodes 
    T data;
    Node<T> next;

    // constructor
    Node(T data){
        this.data = data;
        next = null;
    }
}

public class LL {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        Node<Integer> node3 = new Node<Integer>(30);
        node1.next = node2;
        node2.next = node3;
        Node<Integer> head = node1;
        result(head);
        // result(head);
    }


//function to print the LinkedList
public static void result(Node<Integer> head){
    // Node<Integer> temp = head;
    while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }

    System.out.println();
    // head = temp;
    // while (head != null) {
    //     System.out.print(head.data + " ");
    //     head = head.next;
    // }

}
}

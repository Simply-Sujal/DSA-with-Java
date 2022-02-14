
class LL{
    private Node head;
    private Node tail;
    
    private int size;
    public LL(){
        this.size = 0;
    }
    // Inserting a node at the first position
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    // Inserting a node at the last index
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert a node at any particular position
    public void insertAtAnyPos(int value , int index){
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value,temp.next);
        temp.next = newNode;

        size++;
    }

    // delete the first index or the first node of the linkedlist
    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    // delete the last node from the linkedlist
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;

        return val;
    }

    // delete the particular index
    public int deleteParticular(int index){
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();    
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;    
    }

    // this function is to display or to print the linkedlist
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
    // this class is form to create a node
    class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }

    public Node(int value , Node next){
        this.value = value;
        this.next = null;
    }
}

public class LinkedList{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(45);
        list.insertFirst(40);
        list.insertFirst(4);
        list.insertFirst(89);
        list.insertLast(100);

        list.display();
        System.out.println(list.deleteFirst());
        list.insertAtAnyPos(999, 3);
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.deleteParticular(2));
        list.display();
    }
}
// In this we learnt about the Doublylinkedlist

public class DLL{

    private Node head;
    
    // Inserting the node at the very first index or whatever uh say 
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // Inserting the node at the last index
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    // inserting node at any position 
    public void insert(int after , int val){
        Node p = find(after);
        if (p == null) {
            System.out.print("Does not Exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    // this function is all about to print stuff
    public void display(){
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        System.out.println("Print in Reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    // node formation
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val , Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(56);
        list.insertFirst(1);
        list.insertFirst(23);
        list.insertFirst(32);
        list.insertFirst(5);

        list.insertLast(1000);

        list.insert(23, 99);

        list.display();
    }
}
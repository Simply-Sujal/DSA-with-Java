// Doubly LinkedList basic to advance means leetcode easy to hard level questions implemented and most important question coded , interview point of view.
// BY : "Sujal Kr. Timilsina" CSE : 37
// Programming Language used : "Java"
// You Can Follow me on : 
// Linkedin : https://www.linkedin.com/in/sujal-timilsina-a26299197/
// Twitter : https://twitter.com/362Sujal
// Instagram : 

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
    }

    // remove first
    public int RemoveFirst() {
        // edge case
        if (head == null) {
            System.out.println("Doubly LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int removeElement = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return removeElement;
    }

    // remove last
    public int removeLast() {
        // edge case
        if (head == null) {
            System.out.println("Doubly LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail.prev.next = null;
        tail = tail.prev;
        return val;
        // or here you create one temp variable to travael till end to delet the last
        // node but here i used tail pointer to remove the very last node.
    }

    // Reverse the doubly linkedlist
    public void ReverseDLL() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // printing doublyLinkedlist
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        // dll.addLast(10);

        // dll.print();
        // System.out.println(size);

        // System.out.println("The deleted element from the first posiiton : " +
        // dll.RemoveFirst());
        // dll.print();

        // add last
        // dll.print();

        // System.out.println(dll.removeLast());
        // dll.print();
        dll.print();
        dll.ReverseDLL();
        dll.print();

    }
}

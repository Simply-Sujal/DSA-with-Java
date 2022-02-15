
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
        // size += 1;
    }

    // Remove duplicates from the sorted list
    public void duplicates(){
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
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


public class Removeduplicates {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);

        list.display();
        list.duplicates();
        list.display();
    }
}


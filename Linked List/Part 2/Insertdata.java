public class Insertdata{
    
    
    Node head;
    private int size;
    Insertdata(){
        this.size = 0;
    }

class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;   
        size++;    
    }
}

// add - first , last
    public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}

    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    //Printing Part
    public void PrintList(){
        if (head == null) {
            System.out.println("This is Empty LinkedList");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // delete first 
    public void deleteFirst(){
        if(head == null){
            System.out.println("The List is Empty");
        }
        // single line to delete the first node
        size--;
        head = head.next;
    }

    // delete the last node
    public void deleteLast(){
        if(head == null){
            System.out.println("The List is Empty");
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // funtion for size detector
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Insertdata list = new Insertdata();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("LinkedList");

        // list.PrintList();
        // list.addLast("Moring Everyone");
        // list.PrintList();

        // list.addFirst("Hemlo");
        // list.PrintList();

        // list.deleteFirst();
        // list.PrintList();

        list.deleteLast();
        list.PrintList();

        System.out.println(list.getSize());
    }
}
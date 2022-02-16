
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

public class Cycledetection {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(45);
        list.insertLast(68);
        list.insertLast(24);
        list.insertLast(9);
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(2);
        list.insertLast(78);

        list.display();
        
    }
    // Whether the linkedlist has cycle or not 
    // Algorithm:
    // 1. Initialise two pointers, fast and slow to the head of the linked list.
    // 2. Traverse through the linked list until the fast pointer doesn’t reach the end of the linked list.
    // 3. If the fast pointer reaches the end, it means that the linked list doesn’t contain any cycle. Hence, return False.
    // 4. Else, move the slow pointer by one node i.e. slow = slow -> next and fast pointer by two nodes i.e. fast = fast -> next -> next.
    // 5. At any point, if the fast and the slow pointers point to the same node, return True as a loop has been detected.
    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Now the question is to find the length of the cycle 
    public int lengthCount(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate the length
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}

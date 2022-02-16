
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

public class Happynumber {
    public static void main(String[] args) {
        
    }

    // Happy Number problem
    public boolean isHappy(int N){
        int slow = N;
        int fast = N;
        
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
    return false;
    }

    private int findSquare(int number){
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans = ans + rem;
            number = number / 10;
        }
        return ans;
    }
}

import java.util.Scanner;
// In this programme we gonna learn about how to take input and print the linkedlist 
// The time complexity of this programme is O(n^2) , this is not so optimised code so in the next code we will write the optimized code 
class Node<T>{
    // properties
    T data;
    Node<T> next;
    
    // constructor 
    Node(T data){
        this.data = data;
        next = null;
    }
}

public class TakingInputinLL {
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }

    public static void print(Node<Integer> head){
        // Node<Integer> temp = head;
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }


    // Function to take input from the user 
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
            }else{
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = input.nextInt();
            input.close();
        }
        return head;
        
    }
}



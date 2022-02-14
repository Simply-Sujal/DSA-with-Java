
// Most imporatnt qst. how to reverse a linked list by recursively 

import java.util.Scanner;

// class Node<T>{
//     T data;
//     Node<T> next;

//     Node(T data){
//         this.data = data;
//         next = null;
//     }
// }

public class ReverseLL {
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = ReverseRecur(head);
        print(head);
    }

    public static Node<Integer> ReverseRecur(Node<Integer> head){
        // base case 
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> finalHead = ReverseRecur(head.next);
        Node<Integer> temp = finalHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return finalHead;
    }

    // function to print the user input values
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
            // input.close();
        }
        return head;
    }
}

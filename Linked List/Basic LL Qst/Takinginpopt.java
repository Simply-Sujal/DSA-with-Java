
// This is the optimised solution of taking the input via a user . 

import java.util.Scanner;

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

public class Takinginpopt {
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
        Node<Integer> head = null, tail = null;
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }else{
                // Node<Integer> temp = head;
                // while (temp.next != null) {
                //     temp = temp.next;
                // }
                // temp.next = newNode;
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            
            data = input.nextInt();
            input.close();
        }
        return head;
    }
}




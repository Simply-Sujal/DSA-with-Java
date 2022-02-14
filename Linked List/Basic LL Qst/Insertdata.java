import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

public class Insertdata {
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insert(head, 80, 3);
        // head = insert(head, 80, 0);
        print(head);
    }

    // Inserting a data to a linkedList
    public static Node<Integer> insert(Node<Integer> head , int data , int pos){
        Node<Integer> newNode = new Node<Integer>(data);
        // Condtion if we want to insert a number in 0th index or position then ,
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        int i = 0;
        Node<Integer> temp = head;
        while(i < pos - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
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
            input.close();
        }
        return head;
    }

}

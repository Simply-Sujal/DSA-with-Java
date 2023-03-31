
public class StackUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        // isEmpty function
        public boolean isEmpty() {
            return head == null;
        }

        // push function
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                newNode.next = head;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop operation
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        // peek operation : means upper se jhakna
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(50);
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(10);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

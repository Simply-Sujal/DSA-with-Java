import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // push operation
        public void push(int data) {
            deque.addLast(data);
        }

        // pop operation
        public int pop() {
            int val = deque.removeLast();
            return val;
        }

        // peek operation
        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}

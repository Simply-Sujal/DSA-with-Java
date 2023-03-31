import java.util.*;

public class QueueUsingDeq {
    static class Queue {
        Deque<Integer> deq = new LinkedList<>();

        // add operation
        public void add(int data) {
            deq.addLast(data);
        }

        // remove operation
        public int remove() {
            return deq.removeFirst();
        }

        // peek operation
        public int peek() {
            return deq.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}

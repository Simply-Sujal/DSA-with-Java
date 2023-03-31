
import java.util.*;

public class DoubleEndedQ {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);
        System.out.println(deque);
        deque.addLast(40);
        deque.addLast(50);
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

    }
}

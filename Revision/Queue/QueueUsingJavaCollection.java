
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJavaCollection {
    public static void main(String[] args) {
        // here object of queue is not possible because is an interface and creation of
        // an object of an interface cant possible
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> qt = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

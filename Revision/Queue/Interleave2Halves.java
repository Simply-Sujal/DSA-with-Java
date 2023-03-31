import java.util.LinkedList;
import java.util.Queue;

public class Interleave2Halves {
    public static void interLeave(Queue<Integer> q) { // T.C : 0(N)
        Queue<Integer> FirstHalf = new LinkedList<>();
        int sz = q.size();

        for (int i = 0; i < sz / 2; i++) {
            FirstHalf.add(q.remove());
        }

        while (!FirstHalf.isEmpty()) {
            q.add(FirstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);
        // print
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}

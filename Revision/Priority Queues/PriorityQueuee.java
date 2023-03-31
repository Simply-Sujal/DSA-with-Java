import java.util.*;

public class PriorityQueuee {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s1) {
            return this.rank - s1.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        // adding element in O(logn) timecomplexity
        pq.add(new Student("Sujal", 4));
        pq.add(new Student("Varun", 10));
        pq.add(new Student("Keta", 1));
        pq.add(new Student("Duke", 6));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // O(1)
            pq.remove(); // O(logn)
        }
    }
}
import java.util.ArrayList;

public class ClassRoom {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // this is minheap
        // function to add element into the heap
        public void add(int data) { // O(logN)
            // add at the last index
            arr.add(data);

            int x = arr.size() - 1; // this is child index
            int parent = (x - 1) / 2; // this is parent index

            while (arr.get(x) < arr.get(parent)) { // O(logN)
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        // peek element from heap
        public int peek() {
            return arr.get(0);
        }

        // remove element from the heap
        public int remove() {
            int data = arr.get(0);

            // step1 : swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 : delete last
            arr.remove(arr.size() - 1);

            // step 3 :Heapify proceee
            heapify(0);
            return data;

        }

        // heapify process
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIndex = i; // root is the minimum value

            if (left < arr.size() && arr.get(minIndex) > arr.get(left)) {
                minIndex = left;
            }

            if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
                minIndex = right;
            }

            if (minIndex != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);

                heapify(minIndex);
            }
        }

        // empty edge case
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) { // heap sort : O(nlogn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
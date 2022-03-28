public class Main {
    public static void main(String[] args) {
        BinaryHeap bp = new BinaryHeap(8);
        // bp.peek();
        bp.insert(10, "Max");
        bp.insert(5, "Max");
        bp.insert(15, "Max");
        bp.insert(1, "Max");
        bp.insert(9, "Max");
        bp.insert(90, "Max");
        bp.insert(100, "Max");
        bp.levelOrder();
        bp.extractHeapOfBP("Max");
        bp.levelOrder();
    }
}

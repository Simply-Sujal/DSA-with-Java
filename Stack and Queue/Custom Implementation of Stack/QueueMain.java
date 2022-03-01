public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(78);
        queue.insert(100);
        queue.insert(9);
        queue.insert(1);
        queue.insert(45);

        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}

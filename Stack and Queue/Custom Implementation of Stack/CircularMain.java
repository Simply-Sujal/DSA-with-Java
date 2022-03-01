public class CircularMain {
    public static void main(String[] args) throws Exception{
        CircularQueue cq = new CircularQueue(5);
        cq.insert(78);
        cq.insert(100);
        cq.insert(9);
        cq.insert(1);
        cq.insert(45);

        cq.display();
        System.out.println(cq.remove());

        cq.insert(190);
        cq.display();
    }
}

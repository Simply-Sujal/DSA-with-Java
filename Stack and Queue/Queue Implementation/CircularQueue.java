public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;


        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        //enqueue or add
        public static void add(int data){
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }
            // 1st element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue - O(1)
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int result = arr[front];
            // single element condition 
            if (rear == front) {
                rear = front = -1;
            }else{
                front = (front + 1)%size;
            }
            return result;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    } 
}

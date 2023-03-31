package Stack;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    public StackUsingLL() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return (size() == 0); // or head == null
    }

    T top() {
        if (size() == 0) {
            return null;
        }
        return head.data;
    }

    void push(T element) {
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() {
        if (size() == 0) {
            return null;
        }
        T tempData = head.data;
        head = head.next;
        size--;
        return tempData;
    }
}

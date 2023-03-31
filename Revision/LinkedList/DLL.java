public class DLL {

    private Node head;

    // insert in a first position in a Doubly LinkedList
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // displaying the doubly LinkedList and reverse the doubly linkedlist
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    // insert at the end of the doublylinkedlist
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.next = null;
        node.prev = last;
        last = node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // insert at any index or after any given value
    public void inserAfterAnyValue(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exists");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = p;
        }
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        // public Node(int val, Node next, Node prev) {
        // this.val = val;
        // this.next = next;
        // this.prev = prev;
        // }
    }
}

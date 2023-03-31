// Singly LinkedList basic to advance means leetcode easy to hard level questions implemented and most important question coded , interview point of view.
// BY : "Sujal Kr. Timilsina" CSE : 37
// Programming Language used : "Java"
// You Can Follow me on : 
// Linkedin : https://www.linkedin.com/in/sujal-timilsina-a26299197/
// Twitter : https://twitter.com/362Sujal
// Instagram : 

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        // default construtor to take data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int count;

    // addfirst in LL : T.C : O(N)
    public void addFirst(int data) {
        // first create a newNode
        Node newNode = new Node(data);
        count++;
        // if ll is empty or edge case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // linking newNode to the head
        newNode.next = head;
        // now point head to newNode
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        // first create a newNode
        Node newNode = new Node(data);
        count++;
        // if ll is empty or edge case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // printing a ll
    public static void printLL() { // T.C = O(N)
        // edge case if ll is empty
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // adding node at any place
    public void add(int idx, int data) {
        // if i want to add in oth index
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        count++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i == idx-1 ; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // size of a linkedlist
    public static int countNodes() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // remove the very frist node from a ll
    public int removeFirst() {
        // EDGE CASE
        if (count == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (count == 1) {
            int val = head.data;
            count = 0;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        count--;
        return val;
    }

    // remove last from a linkedlist
    public int removeLast() {
        // edge case
        if (count == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (count == 1) {
            int val = head.data;
            head = tail = null;
            count = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < count - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        return val;
    }

    // search a key
    public int Search(int key) { // T.C. : o(n)
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (key == temp.data) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // recursive approach to search a key
    public int recursiveSearch(Node head, int key) { // T.C. : o(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = recursiveSearch(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // Reverse a linkedlist
    public void ReverseLL() { // O(N)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // find and remove the nth node from end
    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // remove first
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // find the middle node of the linkedlist
    public Node findMiddleNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // palindrom or not in linkedlist
    public boolean PalindromeLL() {
        // edge case
        if (head == null || head.next == null) {
            return true;
        }
        // find the middle node
        Node midNode = findMiddleNode(head);

        // reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; // left half head

        // step 3 : left and right part are equal or not
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Detect a loop in linkelist
    public static boolean isCycle() { // Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    // Remove cycle from a linkedlist
    public static void RemoveCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean flag = false; // means there is no cycle present initially
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next = null;
    }

    // merger two sorted
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find min
        Node mid = getMid(head);
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    private Node merge(Node head1, Node head2) {
        Node mergerLL = new Node(-1);
        Node temp = mergerLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergerLL.next;
    }

    // getting mid for merge two sorted
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    // Zig Zag LinkedList
    public void ZigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alt merge or zigzag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(30);
        // ll.addLast(40);
        // ll.addLast(50);
        // ll.add(2, 100);
        // printLL();
        // System.out.println(ll.PalindromeLL());

        // System.out.println("The numbe of node in a ll : " + LinkedList.count);
        // System.out.println("Index where the key found : " + ll.Search(30));
        // System.out.println(ll.recursiveSearch(head, 10));
        // System.out.println(ll.recursiveSearch(head, 1000));
        // System.out.println("The deleted node from the beginning : " +
        // ll.removeFirst());
        // printLL();

        // System.out.println("Deleted node from the last : " + ll.removeLast());
        // printLL();

        // System.out.println("The total number of nodes in a linkedlist is : " +
        // countNodes());

        // ll.ReverseLL();
        // printLL();

        // ll.deleteNthFromEnd(3);
        // printLL();

        // ------- Cycle Detection -------
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);
        // head.next.next.next.next = head;
        // System.out.println(isCycle());

        // -------- remove loop ----------
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // // 1->2->3->4->3
        // System.out.println(isCycle()); // initially there was a cycle present
        // RemoveCycle(); // after removing
        // System.out.println(isCycle()); // there is not cycle present

        // --------- mergesort -----------
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // // ll.addFirst(5);
        // // 5->4->3->2->1

        // ll.printLL();
        // ll.head = ll.mergeSort(ll.head);
        // ll.printLL();
        // O(nlogn)

        // ---------- ZigZag Probelm --------
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        printLL();
        ll.ZigZag();
        printLL();
    }
}
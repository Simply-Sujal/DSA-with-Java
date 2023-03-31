public class Main {
    public static void main(String[] args) {

        // ---------------Singly LinkedList---------------------
        // LL list = new LL();
        // list.insertFirst(5);
        // list.insertFirst(10);
        // list.insertFirst(15);
        // list.insertFirst(20);
        // list.insertFirst(25);
        // // list.insertLast(100);

        // // System.out.println("The deleted value is : " + list.deleteFirst());

        // list.display();
        // // list.deleteLast();
        // // list.display();
        // System.out.println("The deleted value is : " + list.deleteFromAnyIndex(3));
        // list.display();

        // -----------------Doubly LinkedList--------------------
        // DLL list = new DLL();
        // list.insertFirst(5);
        // list.insertFirst(10);
        // list.insertFirst(15);
        // list.insertFirst(20);
        // list.insertFirst(25);
        // // list.insertFirst(30);
        // // list.insertLast(100);
        // list.inserAfterAnyValue(15, 100);
        // list.inserAfterAnyValue(20, 200);

        // list.display();

        // ----------------------Circular LinkedList------------------------
        // CLL list = new CLL();
        // list.insert(10);
        // list.insert(20);
        // list.insert(30);
        // list.insert(40);
        // list.display();
        // list.delete(20);
        // list.display();

        // ---------remove duplicates-----------
        // LL list = new LL();
        // list.insertLast(1);
        // list.insertLast(1);
        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(3);

        // list.display();
        // list.removeDuplicates();
        // list.display();

        // ------- merge two sorted list -----------

        // LL first = new LL();
        // LL second = new LL();

        // first.insertLast(1);
        // first.insertLast(3);
        // first.insertLast(4);

        // second.insertLast(1);
        // second.insertLast(2);
        // second.insertLast(9);
        // second.insertLast(14);

        // LL ans = LL.merge(first, second);
        // ans.display();

        // --------- Cycle detection---------
        LL list = new LL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertLast(60);
        list.insertLast(70);
        list.insertLast(80);

        // list.display();
        // list.hasCycle();

    }
}

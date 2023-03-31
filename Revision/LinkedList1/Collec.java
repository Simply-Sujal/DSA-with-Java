
// Singly LinkedList using Java Collection , BY : "Sujal Kr. Timilsina"
// Language Used : "Java"
import java.util.LinkedList;

public class Collec {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // adding the element in the firts
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        System.out.println(list);

        // adding the element in the last
        list.addLast(100);
        list.addLast(200);
        list.addLast(300);
        System.out.println(list);

        // remove
        list.remove();
        list.remove();
        list.remove();
        System.out.println(list);

        // cloning a list
        list.clone();
        System.out.println(list);

        // There are so javacollection function out there just google it
    }

}

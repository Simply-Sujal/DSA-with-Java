import java.util.HashSet;
// import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(30);
        // System.out.println(hs);

        // hs.remove(20);
        // System.out.println(hs);
        // hs.clear();
        // System.out.println(hs.size());
        // System.out.println(hs.isEmpty());
        // if (hs.contains(20)) {
        // System.out.println("Yes 20 is there");
        // }

        // Itertor to iterate each element in the set
        // Iterator it = hs.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        // using advance loop
        for (Integer key : hs) {
            System.out.print(key + " ");
        }
        System.out.println();

        // LinkedHashMap -> ordered maintain , T.C : O(1)
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        ls.add("Sus");
        ls.add("Varun");
        ls.add("Keta");
        ls.add("Duke");
        System.out.print(ls + " ");
        System.out.println();

        // TreeSet : sorted in ascending order and null value is not allowed
        // insertion and deletion in O(logn)
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Sujal");
        ts.add("Varun");
        ts.add("Keta");
        ts.add("Duke");
        System.out.println(ts);
    }
}

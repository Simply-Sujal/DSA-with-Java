import java.util.HashSet;

public class Hashiiingbasics{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(90);
        hs.add(5);

        System.out.println(hs);

        if (hs.contains(10)) {
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }

        hs.remove(5);
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        hs.clear();
    }
}
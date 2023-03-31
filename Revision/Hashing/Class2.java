import java.util.HashMap;
// import java.util.HashSet;
import java.util.Set;

public class Class2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Inserting into the hashmap : O(1)
        hm.put("India", 100);
        hm.put("China", 190);
        hm.put("Indonesia", 70);
        hm.put("Bhutan", 5);
        hm.put("Pakistan", 50);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys); // get keys in unordered manner

        for (String k : keys) {
            System.out.println("Key is : " + k + " and corresponding values are : " + hm.get(k));
        }
    }
}

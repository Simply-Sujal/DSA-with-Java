import java.util.HashMap;

public class Class1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Inserting into the hashmap : O(1)
        hm.put("India", 100);
        hm.put("China", 190);
        hm.put("Indonesia", 70);
        hm.put("Bhutan", 5);
        hm.put("Pakistan", 50);

        System.out.println(hm);

        // GET : O(1)
        // int population = hm.get("Indonesia");
        // System.out.println(population);

        // if the key is not present in hashmap and we want to get its value then we
        // will get null value
        // System.out.println(hm.get("Ind"));

        // contains key : O(1) , it returns true or false
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("USA"));

        // Remove Key : O(1)
        // System.out.println(hm.remove("China"));
        // System.out.println(hm); // printing after deletion of a key in a hasmap

        // size of a map
        System.out.println(hm.size());

        // isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
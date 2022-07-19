import java.util.HashMap;
import java.util.Set;

public class InBuiltMapUse{
    public static void main(String[] args) {
        
        // here we will see how to use hasmap using collection framework
        // first see how to create a HashMap

        HashMap <String,Integer> hmap = new HashMap<>(); // CREATED HASHMAP
        
        // Insertion
        // hmap.put(key, value); in this way we insert an element in hashmap
        hmap.put("abc", 1); // this is in order O(1)
        hmap.put("def", 5);
        hmap.put("ghi", 10);

        // in order to get the size of hashmap then use the below 
        hmap.put("abc", 2); // we can add the same key , this will replace the value above that means it will not increases the size of hashmap
        System.out.println(hmap.size()); // size means number of key that is present and 0(1)

        // lets check the presence of values in hashmap
        if (hmap.containsKey("abc")) { // complex O(1)
            System.out.println("The seached key is present in hashmap"); 
        }

        if (hmap.containsKey("xyz1")) {
            System.out.println("map has xyz1");
        }

        // now lets know how to get values in hashmap
        int v = hmap.get("abc"); // getting value is O(1)
        System.out.println(v);

        // int v1 = hmap.get("fcg");
        // System.out.println(v1); we will get null pointer exception coz fcg is not present in hashmap

        // so in order to avoid nullpointerexcetion we must first check the pressence of key then only asked for the value 

        int v1 = 0;
        if (hmap.containsKey("dbg")) {
            v1 = hmap.get("dbg");
        }
        System.out.println(v1);


        // remove operations
        // hmap.remove("abc"); order O(1)
        // if (hmap.containsKey("abc")) {
        //     System.out.println("Key is present");
        // }else{
        //     System.out.println("Key abc is removed");
        // }


        // iterate on the hashmap
        Set<String> keys = hmap.keySet(); // for iterating over keys we use set data structure 
        for (String s : keys) { // getting keysets is O(n)
            System.out.println(s);
        }

        // hmap.containsValue(10); order of O(n)
    }
}
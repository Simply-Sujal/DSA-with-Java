import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> { // generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n -> total no. of nodes exists in hashmap
        private int N; // bucket length
        private LinkedList<Node> bucket[]; // N -> buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        // this is hashfunction which will return the actual bucket index
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // searching in a linkedlist for a existing node
        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
            }
            return -1;
        }

        // rehashing
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        // put function
        // Time Complexity : O(lamda) -> O(1)
        public void put(K key, V value) {
            int bi = hashFunction(key); // 0 t0 3 : this will store the bucket index
            int di = SearchInLL(key, bi); // valid ya phir update otherwise -1 for new node

            if (di != -1) {
                Node node = bucket[bi].get(di);
                node.value = value;
            } else {
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lamda = (double) n / N;
            if (lamda > 2.0) {
                rehash();
            }
        }

        // contains key : TimeComplexity : O(1)
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi); // data index

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        // get funtion : T.C. : O(1)
        public V get(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].get(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        // remove function : T.C : O(1)
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].remove(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> key = new ArrayList<>();

            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (Node node : ll) {
                    key.add(node.key);
                }
            }
            return key;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 200);
        hm.put("China", 150);
        hm.put("US", 100);
        hm.put("Pakistan", 40);
        hm.put("Nepal", 10);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}

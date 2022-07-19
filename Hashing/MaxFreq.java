import java.util.HashMap;
import java.util.Map;

// Maximum Frequency Number

public class MaxFreq {
    public static void main(String[] args) {
        int arr[] = {6,3,5,5,5,5,4,1,5};

        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry entry: map.entrySet()) {
            System.out.println("Element | Frequency");
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
    }
}

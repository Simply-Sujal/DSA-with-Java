import java.util.ArrayList;
import java.util.HashMap;

// Qst.1 This question is all about removing the duplicates from the array 

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int arr[]){

        ArrayList <Integer> output = new ArrayList<>();

        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // condtion will check whether the element is present or not 
            if (map.containsKey(arr[i])) {
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i], true);  
        }
        return output;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,2,1,3,1,6,5,8};
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println(output);

    }
}

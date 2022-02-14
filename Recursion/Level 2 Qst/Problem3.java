
// qst.3 If the element is present in array more than one times then how you can tell us the index value of those elements 

import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1,2,54,6,7,7,8,7};
        int target = 7;
        findAllIndex(arr, target, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list= new ArrayList<>();
    static void findAllIndex(int[] arr, int target , int index){
        if(index == arr.length){
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }
}

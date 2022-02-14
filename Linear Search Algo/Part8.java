

// Code For Linear Search 

public class Part8{
    public static void main(String[] args) {
        int[] arr = {23,435,64,4,768,2,9,134,53,8};
        int target = 53;
        System.out.println(searchh(arr, target));

    }

    static int searchh2(int[] arr , int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
            return -1;
        }

    static int searchh(int[] arr , int target){
         if (arr.length == 0) {
             return -1;
         }

         for (int i = 0; i < arr.length; i++) {
            // int element = arr[i];
            while (arr[i] == target) {
                return i;
            }     
         }
        return -1;
    }
}
// Finding the max number in an array 

public class Problem2{
    public static void main(String[] args) {
        int[] arr = {23,3,90,42,6,786,45,100};
        Maximum(arr);
       
        System.out.println(Maximum(arr));
        System.out.println(maximumRnge(arr, 1, 5));


    }

    
    // Maximum number in Range
    static int maximumRnge(int[] arr , int start , int end){
        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }
        int greatest = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        return greatest;
    }

    static int Maximum(int[] arr){
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
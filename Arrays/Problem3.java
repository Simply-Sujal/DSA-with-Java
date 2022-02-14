import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
    
        int[] arr = {12,4,86,100,2,56,23,64,89,25,34};
        // swap(arr, 2, 6);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Reverse an array 
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) { 
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }  

}

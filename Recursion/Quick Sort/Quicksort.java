
// Program for the quick sort Algorithm 

import java.util.Arrays;

public class Quicksort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr , int low , int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2; // i am assuming the mid element is pivot
        int pivot = arr[mid]; // this is the pivot element

        while (start <= end) {
            // also a reason why if its already sorted it will not swap 
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index , please sort the two half now
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
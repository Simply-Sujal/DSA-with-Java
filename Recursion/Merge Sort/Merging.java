// import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,4,3,6,7};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergeSort(int[] input, int start,int end){
        // base case 
        if(start >= end){
            return;
        }

        int mid = start + (end - start)/2;
        //part 1
        mergeSort(input, start, mid);
        //Part 2
        mergeSort(input, mid + 1, end);

        merge(input,start,end);
    }

    static void merge(int[] input, int start,int end){
        int mid = start + (end - start)/2;

        int[] ans = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (input[i] < input[j]) {
                ans[k] = input[i];
                i++;
                k++;
            }
            else{
                ans[k] = input[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            ans[k] = input[i];
            i++;
            k++;
        }

        while (j <= end) {
            ans[k] = input[j];
            j++;
            k++;
        }

        for(int index = 0; index < ans.length; index++){
            input[start + index] = ans[index];
        }
    }
}

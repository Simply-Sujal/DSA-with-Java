
// Celing of a number 

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {4,6,7,9,10,12,14,17,20};
        int target = 11;
        int ans = CelingOfNumber(arr, target);
        System.out.println(ans);

    }

    static int CelingOfNumber(int[] arr , int target){
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;

       
        while (start <= end){
        int mid = start + (end - start)/2;

        if(target < arr[mid]){
            end = mid - 1;
        }
        else if(target > arr[mid]){
            start = mid + 1;
        }
        else{
            return mid;
        }
    }
    return start;
  }
}
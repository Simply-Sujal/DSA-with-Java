

// Ceiling of a number 

public class Problem1{
    public static void main(String[] args) {
        int[] arr = {3,5,7,10,15,18,23,29};
        int target = 17;

        int ans = CeilingOfNumber(arr, target);
        System.out.println(ans);
    }

    static int CeilingOfNumber(int arr[] , int target){

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }
            
            else{
                return mid;
            }
        }
        return start;  // start will give you the ceiling number 
        //return end; end will give you the floor of the number 
    }
}
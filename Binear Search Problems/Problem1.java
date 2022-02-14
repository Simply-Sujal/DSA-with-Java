
// BinarySearch Programme 

public class Problem1{
    public static void main(String[] args) {
        int[] arr = {2,53,67,9,10,23,45,73};
        int target = 45;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
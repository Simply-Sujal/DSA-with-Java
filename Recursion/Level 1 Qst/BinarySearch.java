public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 23, 67};
        int target = 23;
        System.out.println(bs(arr, target, 0, arr.length));        
    }

    static int bs(int[] arr,int target,int start,int end){

        if (start > end) {
            return -1;
        }

        int middle = start + (end - start) / 2;

        if (arr[middle] == target) {
            return middle;
        }

        if (target < arr[middle]) {
            return bs(arr, target, start, middle-1);
        }

        return bs(arr, target,middle+1, end);
    }
}

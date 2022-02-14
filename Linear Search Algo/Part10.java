
// Search in Range 
public class Part10 {
    public static void main(String[] args) {
        int[] arr = {67,24,5,232,67,89,2,66,900,9};
        int target = 89;
        System.out.println(range(arr, target, 2, 9));
    }


    static int range(int[] arr , int target , int start , int end){
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}

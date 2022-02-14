
// In this qst. we have to check whether the array is sorted or not by recursion
public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,9};
        System.out.println(CheckSorted(arr));
    }

    // first approach
    // public static boolean SortedArray(int[] arr){
    //     // base case
    //     if(arr.length <= 1){
    //         return true;
    //     }

    //     int[] newArray = new int[arr.length - 1];
    //     for (int i = 1; i < arr.length; i++) {
    //         newArray[i-1] = arr[i];
    //     }
    //     boolean smallAns = SortedArray(newArray);
        
    //     if (!smallAns) {
    //         return false;
    //     }
    //     if (arr[0] <= arr[1]) {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    
    //   second approach
    // public static boolean SortedArray2(int[] arr){
    //     // base case
    //     if(arr.length <= 1){
    //         return true;
    //     }

    //     if(arr[0] > arr[1])
    //         return false;
        
    //     int[] newArray = new int[arr.length - 1];
    //     for (int i = 1; i < arr.length; i++) {
    //         newArray[i-1] = arr[i];
    //     }

    //     boolean answer = SortedArray2(newArray);
    //     return answer;

    //     // if (answer) {
    //     //     return true;
    //     // }else{
    //     //     return false;
    //     // }
    // }

    // third and best approach to know whether the array is sorted or not   
    private static boolean CheckSorted(int[] arr , int startindex){

        // base case 
        if(startindex >= arr.length - 1){
            return true;
        }

        if(arr[startindex] > arr[startindex + 1]){
            return false;
        }

        boolean smallAns = CheckSorted(arr, startindex + 1);
        return smallAns;
    }

    public static boolean CheckSorted(int[] arr){
        return CheckSorted(arr,0);
    } 
}

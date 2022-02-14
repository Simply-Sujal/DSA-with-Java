// Qst. 1 : Tell us whether the array is sorted or not 

public class Problem1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,78,7,9,10};
        System.out.println(sortedArr(arr, 0));
    }

    static boolean sortedArr(int[] arr , int index){
        // base condtion 
        if(index == arr.length - 1){
            return true;
        }

        // recursion call
        return arr[index] < arr[index + 1] && sortedArr(arr, index+1);
    }
}
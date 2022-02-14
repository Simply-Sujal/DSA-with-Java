
// Code For Linear Search

public class Part1{
    public static void main(String[] args) {
        int[] arr = {12, 324, 54, -12, -23, 4, 8, 1000};
        int target = 23;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
        System.out.println(linearsearch2(arr, target));
        System.out.println(linearsearch3(arr, target));
    }

    //search the target and return true or false
    static boolean linearsearch3(int[] nums , int target){
        if (nums.length == 0) {
            return false;
        }
     
    //run a for loop
    for (int index = 0; index < nums.length; index++) {
        int element = nums[index];
        if (element == target) {
            return true;
        }
    } 

    //this line will execute if none of the return statement above have executed
    //hence the target not found
    return false;
}
    
    // search the target and return element 
    static int linearsearch2(int[] nums , int target){
        if (nums.length == 0) {
            return -1;
        }
     
    //run a for loop
    for (int element : nums) {
        if (element == target) {
            return element;
        }
    }

    //this line will execute if none of the return statement above have executed
    //hence the target not found
    return -1;
}

    // Search in the array : return the index if item found
    // otherwises if item not found return -1

    static int linearsearch(int[] nums , int target){
        if (nums.length == 0) {
            return -1;
        }
     
    //run a for loop
    for (int index = 0; index < nums.length; index++) {
        int element = nums[index];
        if (element == target) {
            return index;
        }
    } 

    //this line will execute if none of the return statement above have executed
    //hence the target not found
    return -1;

    }
}
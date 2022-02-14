
// LeetCode Easy 645. Set Mismatch

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.print(findErrorNums(nums));
    }
    static int[] findErrorNums(int[] nums){
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        // for finding the missing number
        for(int index = 0;index<n;index++){
            if (nums[index] != index + 1) {
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }

    // for swapping number 
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

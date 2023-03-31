import java.util.Stack;

// 2104. Sum of Subarray Ranges
// TimeComplexty : O(n^2) 
public class SumOfSubarrayranges {
    public static int MaxSum(int nums[]) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                ans += max - min;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 4, -2, -3, 4, 1 };
        System.out.println(MaxSum(nums));
    }
}

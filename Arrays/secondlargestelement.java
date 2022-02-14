
// Find the second largest element in an array .

public class secondlargestelement {
    public static void main(String[] args) {
        int[] nums = {3,9,7,8,12,6,15,5,4,10};
        int max1;
        int max2;
        max1 = max2 = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        System.out.print("The Second Largest element is : " + max2);
        
    }

}

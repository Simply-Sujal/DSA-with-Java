public class Removeduplicatesfromsortedarray{
    public static void main(String[] args) {
        int[] arrs = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("The unique elements are : " + removeDuplicates(arrs));
    }


public static int removeDuplicates(int[] nums) {
    int k = 1;
    for(int i = 0; i < nums.length - 1; i++){
        if(nums[i] == nums[i+1]){
            continue;
        }else{
            nums[k++] = nums[i+1];
        }
    }
    return k;
}

}
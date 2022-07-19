public class Removeelementfromunsortedarray {
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                k+=1;
        }
    }
        return k;
    }
}

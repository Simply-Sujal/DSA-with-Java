
// Find numbers with even number of digits 

public class Part13 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,67,896,786,2334,46456,7565,787,55,10};
        System.out.println(findnumbers(nums));
    }

    static int findnumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    //fuction to check whether a number contains even digits or not 
    static boolean even(int num){
        int numberofdigits = digits(num);
        // if (numberofdigits % 2 == 0) {
        //     return true;
        // }
        // return false;

        return numberofdigits % 2 == 0;
    }
 
    //count number of digits in a number
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}

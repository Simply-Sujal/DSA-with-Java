import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        
        int[] nums = {2 , 7 , 6 , 67 , 777};
        System.out.println(Arrays.toString(nums));

        name(nums);
        System.out.println(Arrays.toString(nums));

    }


    static void name(int[] arr){
        arr[0] = 100;
    }
}

// Arrays are mutable in java , it simply means you can change objects but Strings are immutable 
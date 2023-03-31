// Find max and min subarray sum 

public class SubArrays2 {
    public static void MaxMinSubArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                    if (sum > max) {
                        max = sum;
                    }
                    if (min > sum) {
                        min = sum;
                    }
                }
            }
        }
        System.out.println("The maximum subarray sum is : " + max);
        System.out.println("The minimum subarray sum is : " + min);
    }

    public static void main(String[] args) {
        int arr[] = { 400, 400, 180, 20, 121, 563, 234, 190, 123, 121, 220, 39 };
        MaxMinSubArray(arr);
    }
}

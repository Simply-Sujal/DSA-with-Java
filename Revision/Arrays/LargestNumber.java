public class LargestNumber {
    public static int largestNum(int arr[], int n) {
        int large = arr[0];
        int small = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.println("The smallest number in the array is : " + small);
        return large;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 46, 2, 4, 89, 53, 32 };
        int ans = largestNum(arr, 7);
        System.out.println("The largest number in the array is : " + ans);
    }
}

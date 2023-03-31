// Prefix sum logic

public class PrefixSum {
    public static void Prefixsum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // calculate the prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // Tc: 0(N^2)
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maximum sum is : " + maxSum);
    }

    public static void main(String[] args) {
        // int arr[] = { 10, 4, 2, 6, 3 };
        int arr[] = { 400, 400, 180, 20, 121, 563, 234, 190, 123, 121, 220, 39 };
        Prefixsum(arr);
    }
}

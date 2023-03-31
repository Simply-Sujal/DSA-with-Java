// print all the subarray 

public class SubArrays {
    public static void PrintSubArr(int arr[], int n) {
        n = n * (n + 1) / 2; // formulae to get total number of subarrays
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // printing using loop
                    System.out.print(arr[k] + " "); // printing the subarray
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total number of subarrays are : " + n);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = 5;
        PrintSubArr(arr, n);
    }
}

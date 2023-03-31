// in this question we have to return the number of distinct element present in array

import java.util.HashSet;

public class CountingDistinctElement {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        System.out.println(countingDistinct(arr));
    }

    private static int countingDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) { // O(n)
            set.add(arr[i]);
        }
        int ans = set.size();
        return ans;
    }
}

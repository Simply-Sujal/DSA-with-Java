
// Finding minimum number in an array

public class Part11 {
    public static void main(String[] args) {
        int[] arr = {23,4,67,2,9,234,56,9,89};
        System.out.println(minimumNumber(arr));
    }

    static int minimumNumber(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

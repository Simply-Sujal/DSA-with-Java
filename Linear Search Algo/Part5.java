public class Part5 {

    // Assume arraylength != 0
    //return the minimum value in the array
    static int minimum(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12,54,2,646,-12,56,-231,345,35677,1};
        System.out.print(minimum(arr));
    }
}

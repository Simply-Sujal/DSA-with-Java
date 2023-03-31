public class BinarySearch {
    public static int Bs(int arr[], int key, int start, int end) {
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparision
            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key) { // right portion
                start = mid + 1;
            } else { // left portion
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int key = 20;
        int ans = Bs(arr, key, 0, 8);
        System.out.println("The index where key is : " + ans);
    }
}

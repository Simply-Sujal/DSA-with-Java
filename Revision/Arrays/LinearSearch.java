public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // for string searchinng
    public static int linearSearchinStr(String st[], String key1) {
        for (char ch = 0; ch < st.length; ch++) {
            if (st[ch] == key1) {
                return ch;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Time complexity of LinearSearch = O(n)
        // Space Complexity : O(1)

        // int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        // int key = 5;
        // int index = linearSearch(arr, key);
        // if (index == -1) {
        // System.out.println("Index not found");
        // } else {
        // System.out.println("Index found at index : " + index);
        // }

        // string linear search
        String st[] = { "Dosa", "Momos", "Idli", "Maggie" };
        String key1 = "Maggie";
        System.out.println(linearSearchinStr(st, key1));
    }
}

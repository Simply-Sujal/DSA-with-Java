public class Array2 {
    public static void update(int arr[], int a) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        a = 20;
    }

    public static void main(String[] args) {
        int arr[] = { 78, 79, 80 };
        int x = 10;
        update(arr, x);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(x);

    }
}

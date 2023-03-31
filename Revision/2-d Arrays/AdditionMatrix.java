public class AdditionMatrix {
    // Function to add two matrix with same dimension
    public static void Addition(int arr1[][], int arr2[][], int r1, int r2, int c1, int c2) {
        // edge or corner case
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wront Dimension , addition not possible");
            return;
        }
        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        print2dArray(sum);

    }

    // function to print 2-d matrix
    public static void print2dArray(int arr[][]) {
        System.out.println("Resultant 2-d Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        int arr2[][] = { { 8, 3, 4 },
                { 1, 3, 11 },
                { 3, 8, 9 } };

        Addition(arr1, arr2, 3, 3, 3, 3);
    }
}

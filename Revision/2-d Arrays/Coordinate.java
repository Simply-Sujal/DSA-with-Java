import java.util.Scanner;

public class Coordinate {

    // brute force approach
    public static int SumOfCoordinate(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // finding the prefix matrix
    public static void findPrefixMatrix(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;

        // traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }

    // Prefix-sum approach
    // l1 -> first row
    // l2 -> last row
    // r1 -> first col
    // r2 -> last col
    public static int SumOfCoordinate2(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixMatrix(arr);

        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i
            if (r1 >= 1)
                sum += arr[i][r2] - arr[i][r1 - 1];
            else
                sum += arr[i][r2];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of cols : ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Rectangle boundaries l1 , r1 , l2 , r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum is : " + SumOfCoordinate2(matrix, l1, r1, l2, r2));
        sc.close();
    }
}

import java.util.Scanner;

public class TransposeMatrix {

    // function for transpose a matrix using extra space or cretaing new array
    public static int[][] Transpose(int arr1[][], int r, int c) {
        int ans[][] = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr1[j][i];
            }
        }
        System.out.println("Transpose of a matrix : ");
        return ans;
    }

    // function to transpose the array using inplace approach and this will only
    // work in square matrix
    public static void TransposeInPlace(int arr1[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of cols : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " Elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // int ans[][] = Transpose(arr, r, c);
        // print2dArray(ans);

        // inplace transpose function
        TransposeInPlace(arr, r, c);
        print2dArray(arr);
        sc.close();
    }
}

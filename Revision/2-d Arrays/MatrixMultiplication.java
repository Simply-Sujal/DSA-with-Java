import java.util.Scanner;

public class MatrixMultiplication {
    public static void Multiplication(int arr1[][], int arr2[][], int r1, int c1, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }

        int ans[][] = new int[r1][c2];

        for (int i = 0; i < r1; i++) { // row number
            for (int j = 0; j < c1; j++) { // col number
                for (int k = 0; k < c1; k++) {
                    ans[i][j] = arr1[i][k] + arr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2d Array : ");
        print2dArray(ans);
    }

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
        System.out.print("Enter the number of rows for first arr : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of cols for first arr : ");
        int c1 = sc.nextInt();
        System.out.print("Enter the number of rows for second arr : ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of cols for second arr : ");
        int c2 = sc.nextInt();

        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        Multiplication(arr1, arr2, r1, c1, r2, c2);
        sc.close();
    }
}

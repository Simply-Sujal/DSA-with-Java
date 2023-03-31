// Problem 02:Generate a n*n matrix filled with elements 1 to n^2 in spiral order.

import java.util.Scanner;

public class GenerateSpiralM {
    public static int[][] SpiralMat(int n) {
        int ans[][] = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;

        while (current <= n * n) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                ans[topRow][j] = current;
                current++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                ans[i][rightCol] = current;
                current++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                ans[bottomRow][j] = current;
                current++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                ans[i][leftCol] = current;
                current++;
            }
            leftCol++;
        }
        return ans;
    }

    // printing an 2d array
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
        System.out.print("Enter the value for n : ");
        int n = sc.nextInt();

        int ans[][] = SpiralMat(n);
        print2dArray(ans);
        sc.close();
    }
}

import java.util.Scanner;

// Rotate a matrix 90 degree clcokwise

public class RotatedMatrix {
    // roated 90 degree a matrix function
    public static void ClockwiseRotation(int arr[][], int n) {
        // transpose and then reverse element row
        TransposeInPlace(arr, n, n);

        // now reverse each row of matrix
        for (int i = 0; i < n; i++) {
            reverseArray(arr[i]);
        }

    }

    // reversing an array
    private static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // transpose the matrix inPlace
    public static void TransposeInPlace(int arr[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
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
        // Lets take input from the user
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

        ClockwiseRotation(arr, r);
        print2dArray(arr);
        sc.close();
    }
}

import java.util.Scanner;

public class Basictwodarr {
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

        print2dArray(arr);
        sc.close();

        // int arr[][] = {
        // { 1, 3, 5 },
        // { 6, 2, 7 },
        // { 9, 5, 2 }
        // };
        // print2dArray(arr);
    }
}
import java.util.Scanner;

public class Tut1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for row : ");
        int row = input.nextInt();
        System.out.println("Enter the value for col : ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter the value for matrix : ");
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element at : " + i + " row " + j + "col");
                arr[i][j] = input.nextInt();
            }
            // System.out.println("\col");
        }

        System.out.println("The matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
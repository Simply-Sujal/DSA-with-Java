// For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.

import java.util.Scanner;
public class Tut4 {

    public static void display(int[][] arr){
        int nRows = arr.length;
        if (nRows == 0) {
            return;
        }
        int mCols = arr[0].length;

        System.out.println("The sum of row wise : ");
        for (int i = 0; i < nRows; i++) {
            int rowSum = 0;
            for (int j = 0; j < mCols; j++) {
                rowSum += arr[i][j];
            }
            System.out.print(rowSum + " ");
        }
    }

    public static int[][] takingInput(){
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
        }
        input.close();
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = takingInput();
        display(arr);
    }
}

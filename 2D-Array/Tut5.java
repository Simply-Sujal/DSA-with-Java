// Largest coloumn sum

import java.util.Scanner;
public class Tut5 {

    public static void main(String[] args) {
        int[][] arr = takingInput();
        
        System.out.println(largestColSum(arr)); 
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

    public static int largestColSum(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += arr[i][j];
            }
            // System.out.println(sum + " ");
            if (sum > largest) {
                largest = sum;
            }
        }
        return largest;
    }
}

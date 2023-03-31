import java.util.Scanner;

public class SumOfBoundary {

    public static int[][] takingInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value in row : ");
        int row = input.nextInt();
        System.out.println("Enter the value in col : ");
        int col = input.nextInt();
        int arr[][] = new int[row][col];

        System.out.println("Enter the value in matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element at " + i + " " + j + " : " );
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        return arr; 
    }

    public static int sumOfBoundary(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int totalSum = 0;
        int boundarySum = 0;
        int nonboundarySum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    boundarySum = boundarySum + arr[i][j];
                }else{
                    nonboundarySum += arr[i][j];
                }
            }
        }

        totalSum = boundarySum + nonboundarySum;

        return totalSum;
    }
    public static void main(String[] args) {
        int arr[][] = takingInput();
        int ans = sumOfBoundary(arr);
        System.out.println(ans);

    }
}

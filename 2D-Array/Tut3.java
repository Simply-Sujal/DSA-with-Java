import java.util.Scanner;

public class Tut3 {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        display(arr);

    }

    public static void display(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        System.out.println("The overall matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = input.nextInt();
        System.out.println("Enter the number of cols ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element at : " + i + " row " + j + " col ");
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }
        input.close();
        return arr;
    }
}

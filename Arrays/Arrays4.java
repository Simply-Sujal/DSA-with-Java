import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* 
        1 2 3 
        4 5 6
        7 8 9 
        */

        // int[][] arr= new int [3] [3];

        // int[][] arr2D = {
        //        {1 , 2 , 3},  //0th index
        //        {4 , 5 , 6},  //1st index
        //        {7 , 8 , 9}   //2nd index -> arr2D[2] -> {7, 8, 9}
        // };

        int[][] arr = new int[3][2];
        System.out.print(arr.length); // no. of ROWS

        //input

        for(int row = 0; row < arr.length; row++){
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        input.close();


    }
}

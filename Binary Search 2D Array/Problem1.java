
import java.util.Arrays;

public class Problem1{
    public static void main(String[] args) {
        int[][] arr = {
            {10 , 20 , 30 ,40},
            {15 , 25 , 35 , 14},
            {28 , 29 , 37 , 49},
            {33 , 34 , 38 , 50}
        };
        int target = 34;
        System.out.println(Arrays.toString(Search(arr, target)));
    }

    static int[] Search(int[][] matrix , int target){
        int row = 0;
        int colomn = matrix.length - 1;

        while (row < matrix.length && colomn >= 0 ) {
            if (matrix[row][colomn] == target) {
                return new int[] {row,colomn};
            }

            if (matrix[row][colomn] < target) {
                row++;
            }
            else{
                colomn--;
            }
        }
        return new int[] {-1,-1};
    }
}
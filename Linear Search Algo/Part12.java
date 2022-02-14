import java.util.Arrays;

public class Part12 {
    public static void main(String[] args) {
        int[][] arr = {
            {23,5,63,8,},
            {1,56,7},
            {989,2,54},
            {3,5,223,545}
        };
        
            int target = 223;
            int[] ans = searching(arr, target);
            System.out.print(Arrays.toString(ans));
    }

    static int[] searching(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }   
            }
        }
        return new int[]{-1,-1};
    }
}

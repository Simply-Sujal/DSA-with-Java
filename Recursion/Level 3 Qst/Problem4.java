import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,1,3};
        selectionSort(arr, arr.length, 0, 0);
        System.out.print(Arrays.toString(arr));
    }   

    static void selectionSort(int[] arr , int row , int col, int max){
        // base condtion
        if(row == 0){
            return;
        }

        if (col < row) {
            if(arr[col] > arr[max]){
                selectionSort(arr, row, col + 1, col);
            }
            else{
                selectionSort(arr, row, col + 1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;

            selectionSort(arr, row - 1, 0, 0);
        }
    }
}

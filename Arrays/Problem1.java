import java.util.Arrays;

// Swapping of two number 

public class Problem1{
    public static void main(String[] args) {
        int[] arr = {3, 78 ,90, 6, 786, 98};
        Swappingg(arr,2,5);
        System.out.println(Arrays.toString(arr));
    }

    static void Swappingg(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
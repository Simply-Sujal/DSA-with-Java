
// Cyclic Sorting Problem 

public class Important{
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        Sortt(arr);
        System.out.println(arr);
    }

    static void Sortt(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != correct) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr ,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
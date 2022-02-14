
// LeetCode Hard 41. First Missing Positive

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.print(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swapping(arr,i,correct);
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        // case 2 
        return arr.length + 1;

    }

    static void swapping(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

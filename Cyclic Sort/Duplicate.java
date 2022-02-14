
// 287. Find the Duplicate Number , Leetcode Medium Problem 

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = DuplicateNumber(arr);
        System.out.println(ans);

    }

    static int DuplicateNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != i+1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr,i,correct);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

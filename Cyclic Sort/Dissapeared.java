
// LeetCode Problem 
// 448. Find All Numbers Disappeared in an Array


import java.util.ArrayList;
import java.util.List;

public class Dissapeared {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(FindDisaperedNumber(arr));

    }

    static List<Integer> FindDisaperedNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        // just find missing number 
        List<Integer> ans = new ArrayList<Integer>();
        for(int index = 0;index < arr.length;index++){
            if (arr[index] != index+1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }


    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

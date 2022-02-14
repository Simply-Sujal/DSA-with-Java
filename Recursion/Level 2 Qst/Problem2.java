
// Qst.2  Check whether the number which we are alooking for exists or not (Linear Search)
public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1,6,23,67,34,97,233};
        int target = 34;
        System.out.println(FindElement(arr, target, 0));
        System.out.println(Findindex(arr, target, 0));  
        System.out.println(FindindexLast(arr, target, arr.length - 1));      
    }

    static boolean FindElement(int[] arr , int target , int index){
        // base condtion
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || FindElement(arr, target, index+1);
    }

    // if you want the answer in the form where you will get the index value then do this 
    static int Findindex(int[] arr , int target , int index){
        // base condtion
        if(index == arr.length){
            return index;
        }

        if(arr[index] == target){
            return index;
        }
        else{
            return Findindex(arr, target, index+1);
        }
    }

    // find the index from last 
    static int FindindexLast(int[] arr , int target , int index){
        // base condtion
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        else{
            return FindindexLast(arr, target, index-1);
        }
    }
}

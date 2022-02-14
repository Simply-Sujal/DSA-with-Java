public class Part4 {
    public static void main(String[] args) {
        int[] arr = {18, 15, 9, 1, 125, 60, 1213 , 767, 3271, 37641, 13764, 999999, 13665};
        int target = 3271;

        System.out.print(linearsearch(arr, target, 1, 9));
    }

    static int linearsearch(int[] arr , int target , int start , int end){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (target == element) {
                return i;
            }
        }

        return -1;
    }
}

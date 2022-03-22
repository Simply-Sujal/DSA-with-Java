
// Peak index in a Mountain Array 

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,9,1,0};
        int ans = Mountain(arr);
        System.out.println(ans);
    }

    static int Mountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}

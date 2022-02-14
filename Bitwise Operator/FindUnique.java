public class FindUnique{
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(answer(arr));
    }


    static int answer(int[] arr){
        int unique = 0;
        for (int n : arr) {
            unique = unique ^ n; // unique ^= n
        }
        return unique;
    }
}
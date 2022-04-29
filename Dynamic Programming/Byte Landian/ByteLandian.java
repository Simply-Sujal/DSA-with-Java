import java.util.HashMap;
import java.util.Scanner;

public class ByteLandian{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(byteLandian(n));
    }

    public static long byteLandian(Long n, HashMap<Long , Long> memo){
        // base case 
        if (n <= 1) {
            return n;
        }

        if (memo.get(n) != null) {
            return memo.get(n);
        }

        long breakDownValue = byteLandian(n/2, memo) + byteLandian(n/3, memo) + byteLandian(n/4, memo);

        memo.put(n, Math.max(n, breakDownValue));

        return memo.get(n);
    }
}
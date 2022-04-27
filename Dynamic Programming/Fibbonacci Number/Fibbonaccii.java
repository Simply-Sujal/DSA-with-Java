import java.util.Scanner;

public class Fibbonaccii{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the nth number uh want fibbonaci number : ");
        int n = input.nextInt();
        int[] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        // int ans = fibbo(n,dp); // this is for recursive dp 
        // System.out.println(ans);

        int ans1 = fibbI(n); // this one is for iterator dp
        System.out.println(ans1);
        input.close();
    }

    //This is Iterator Dynamic Programming
    public static int fibbI(int n){ // time complex : O(n) and spave complex : O(n) -> best approach 
        // base case 
        if(n == 0 || n == 1){
            return n;
        }
            int dp[] = new int[n+1];
            dp[0] = 0;
            dp[1] = 1;
            // n >= 2
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }

        return dp[n];
    }

    // This is Recursive Dynamic Programming 
    public static int fibbo(int n, int[] dp) { // time complex : O(n) and space complex : O(n) -> it is not much effective coz it uses stack space 
        // base case 
        if (n == 0 || n == 1) {
            return n;
        }

        int ans1;
        int ans2;

        if (dp[n-1] == -1) {
            ans1 = fibbo(n-1, dp); // recursion
            dp[n-1] = ans1; // this is memoization
        }else{
            ans1 = dp[n-1];
        }

        if (dp[n-2] == -1) {
            ans2 = fibbo(n-2, dp); // recursion
            dp[n-2] = ans2; // this is memoization
        }else{
            ans2 = dp[n-2];
        }

        int ans = ans1 + ans2;
        return ans;
    }
}
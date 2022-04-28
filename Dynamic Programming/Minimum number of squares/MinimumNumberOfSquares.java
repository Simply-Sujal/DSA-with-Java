import java.util.Scanner;

public class MinimumNumberOfSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        // this is for recurive approach
        // int recurAns = minSquare(n);
        // System.out.println(recurAns);

        //this is for dp memoization approach 
        // int ans = minSquare(n, dp);
        // System.out.println(ans);

        // this is for iterative approach
        int iterativeAns = minSquareI(n);
        System.out.println(iterativeAns);

        input.close();
    }

    // this is the simple recursive approach 
    public static int minSquare(int n){
        // base case 
        if (n == 0) {
            return 0;
        }

        int minAns = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++) {
            int currentAns = minSquare(n-(i*i));
            if (minAns > currentAns) {
                minAns = currentAns;
            }
        }

        int myAns = 1 + minAns;
        return myAns;
    }


    // this is dp approach with memoization
    public static int minSquare(int n , int dp[]){ // time complex : O(n root(n)) ans space complex : O(n) : In time complex : n is for going linearly one by one i.e for unique calls and root n is time each calls take 
        // base case 
        if (n == 0) {
            return 0;
        }

        int minAns = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++) {
            int currentAns;
            if (dp[n-(i*i)] == -1) {
                currentAns = minSquare(n-(i*i), dp);
                dp[n-(i*i)] = currentAns;
            }else{
                currentAns = dp[n-(i*i)];
            }
            if(minAns > currentAns){
                minAns = currentAns;
            }
        }
        int myAns = 1 + minAns;
        return myAns;
    }

    // this is the iterative way 
    public static int minSquareI(int n){

        int[] dp = new int[n+1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int minAns = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                int currentAns = dp[i-(j*j)];
                if (minAns > currentAns) {
                    minAns = currentAns;
                }
            }
            dp[i] = 1 + minAns;
        }
        return dp[n]; 
    }
}

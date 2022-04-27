import java.util.Scanner;

public class MinSteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // n is the number of steps
        int[] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        // int Recursiveans = minSteps(n);
        // System.out.println(Recursiveans);

        // int dpAns = MinimumSteps(n, dp);
        // System.out.println(dpAns);

        int iteratorAns =  MiniSteps(n);
        System.out.println(iteratorAns);
        input.close();
    }

    // this is the recursive solution
    public static int minSteps(int n){ // Time complex : O(3^n) and space complex : O(n)
        // base case 
        if (n == 1) {
            return 0;
        }

        int ans1 = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;
        int ans3 = Integer.MAX_VALUE;

        ans1 = minSteps(n-1);
    
        if (n % 2 == 0) {
            ans2 = minSteps(n/2);
        }
        
        if (n % 3 == 0) {
            ans3 = minSteps(n/3); 
        }
        
        return 1 + Math.min(ans1, Math.min(ans2, ans3));
    }


    // this is the recursive dynamic programming approach
    public static int MinimumSteps(int n , int dp[]){ // Time complex : O(n) and space complex : O(n)
        // base case 
        if (n == 1) {
            return 0;
        }

        int ans1;
        if (dp[n-1] == -1) {
            ans1 = MinimumSteps(n-1, dp); // recursion
            dp[n-1] = ans1; // memoization
        }else{
            ans1 = dp[n-1];
        }

        int ans2 = Integer.MAX_VALUE;
        if ((n % 2) == 0) {
            if (dp[n/2] == -1) {
                ans2 = MinimumSteps(n/2, dp); // recursion
                dp[n/2] = ans2; // memoization
            }else{
                ans2 = dp[n/2];
            }
        }

        int ans3 = Integer.MAX_VALUE;
        if ((n % 3) == 0) {
            if (dp[n/3] == -1) {
                ans3 = MinimumSteps(n/3, dp); // recursion
                dp[n/3] = ans3; // memoization
            }else{
                ans3 = dp[n/3];
            }
        }

        return 1 + Math.min(ans1, Math.min(ans2, ans3));
    }


    // this is the iterator approach 
    public static int MiniSteps(int n){ // time complex : O(n) and space Complex : O(n)
        // base case  
        if (n == 1) {
            return 0;
        }

        int minSteps[] = new int[n+1];
        minSteps[1] = 0;

        for (int currentStep = 2; currentStep <= n; currentStep++) {
            int subtractOne = Integer.MAX_VALUE;
            int divideByTwo = Integer.MAX_VALUE;
            int divideByThree = Integer.MAX_VALUE;

            subtractOne = MiniSteps(currentStep-1);

            if (currentStep % 2 == 0) {
                divideByTwo = MiniSteps(currentStep/2);
            }

            if (currentStep % 3 == 0) {
                divideByThree = MiniSteps(currentStep / 3);
            }

            minSteps[currentStep] = 1 + Math.min(subtractOne, Math.min(divideByTwo, divideByThree));
        }

        return minSteps[n];
    }
}

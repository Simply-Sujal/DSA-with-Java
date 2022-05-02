
public class KnapSack {
    public static void main(String[] args) {
        int val[] = {200,300,100};
        int wt[] = {20,25,30};
        int W = 50; // this is the capacity of the KnapSack

        // int ans = KnapSackProblem(val, wt, W, 0);
        // System.out.println(ans);

        int ansI = KnapSackI(W, val, wt);
        System.out.println(ansI);

    }

    // Recursive code for 01 KnapSack
    // Time complex : O(3 ^ n)
    // Space Complex : O(N)
    public static int KnapSackProblem(int val[] , int wt[] , int W , int i){
        // base case
        if (i == val.length) {
            return 0;
        }

        int ans;
        if (wt[i] <= W) {
            // including the ith item
            int ans1 = val[i] + KnapSackProblem(val, wt, W - wt[i], i+1);
            // excluding the ith item
            int ans2 = KnapSackProblem(val, wt, W, i+1);

            ans = Math.max(ans1, ans2);
        }else{
            ans = KnapSackProblem(val, wt, W, i+1);
        }

        return ans;
    }

    // iterative approach to solve 01 Knapsack
    public static int KnapSackI(int W , int val[] , int wt[]){
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for(int i = n-1;i >= 0; i--){
            for (int w = 0; w <= W; w++) {
                int ans;
                if(wt[i] <= w){
                    int ans1 = val[i] + dp[i+1][w-wt[i]];
                    int ans2 = dp[i+1][w];
                    ans = Math.max(ans1, ans2);
                }else{
                    ans = dp[i+1][w];
                }
                dp[i][w] = ans;
            }
        }
        return dp[0][W];
    }
}

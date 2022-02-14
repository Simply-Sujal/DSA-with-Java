
// Max Wealth Problem 

public class Part14 {
    public static void main(String[] args) {
     
    }

    static int maximumWealth(int[][] accounts){
        //Person = row 
        //Account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            // now we have sum of accounts of person 
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
    
}

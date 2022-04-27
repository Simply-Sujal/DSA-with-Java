import java.util.Scanner;

public class StairCase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the value of n : ");
        int n = input.nextInt();
        // int ans1 = stairCase(n); // recursive approach
        // System.out.println(ans1);

        int ans2 = stairCase(n);
        System.out.println(ans2); // iterator approach

        input.close();

    }

    // this is the recursive way to solve problem
    public static int stairCase(int n){ // time complex : O(n) and space complex O(n)
        // base case
        if(n == 0)
        return 1;

        if (n == 1 || n == 2) {
            return n;
        }

        return stairCase(n-1) + stairCase(n-2) + stairCase(n-3);
    }

    // this is the iteration dynamic programming 
    public static long StairCasee(int n){ // time comlex : O(n) and O(n)
        long[] ways = new long[n+1]; // this is our dp arraylist of size (n + 1)

        // base case 
        if (n == 0) {
            return 1;
        }

        if (n == 1 || n == 2) {
            return n;
        }

        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];
        }

        return ways[n];
    }
}
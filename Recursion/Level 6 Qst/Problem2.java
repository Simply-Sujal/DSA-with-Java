import java.util.Scanner;

// In this problem we have to sum of n natural number. 
// Recurence relation -> n = n + sum(n-1)       
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = sumOfNaturalNumber(num);
        System.out.println(ans);
        input.close();
    }

    public static int sumOfNaturalNumber(int n){
        // base condtion 
        if (n == 1) {
            return 1;
        }

        return n + sumOfNaturalNumber(n - 1);
    }
}

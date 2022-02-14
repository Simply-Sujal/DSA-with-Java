import java.util.Scanner;

// 7. Define a method to find out if a number is prime or not.

public class Problem7 {
    static boolean prime(int n){
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c*c < n) {
            if (n % c == 0) {
                return false;
            }
            c++ ;
        }
        return c*c > n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.println("Enter any number : ");
        n = input.nextInt();

        boolean result = prime(n);
        System.out.print(result);

        input.close();
    }
}

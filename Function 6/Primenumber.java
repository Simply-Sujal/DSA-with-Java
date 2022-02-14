import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check Prime or not : ");
        int n = input.nextInt();
        boolean answer = prime(n);
        System.out.println(answer);

        input.close();
    }

    static boolean prime(int n){
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c*c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c*c >n;
    }
}

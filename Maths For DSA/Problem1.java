
// Qst.1 Print Prime Number 

public class Problem1{
    public static void main(String[] args) {
        int n = 15;
        for(int i = 1;i<=n;i++){
            System.out.println(i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int n){
        while (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
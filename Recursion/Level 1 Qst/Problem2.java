
// QST. 2  Factorial of a number 

public class Problem2 {
    public static void main(String[] args) {
        System.out.print("The factorial of a number is : " + factorial(5));
    }

    static int factorial(int n){
        if(n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }
}

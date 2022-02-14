import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    printFactorial(n);
    input.close();
    }

    static void printFactorial(int n){
        if (n < 0) {
            System.out.println("Invalid number");
        }
        //loop
        int factorial = 1;
  
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
  
        System.out.println(factorial);
        return;
    }
}

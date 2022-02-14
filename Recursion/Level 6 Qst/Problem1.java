import java.util.Scanner;


// Find the factorial of Number N. Recurence relation -> n! = n * factorial(n-1);
public class Problem1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any number to calculate the factorial : ");
        long num = input.nextLong();
        long ans = Factorial(num);
        System.out.println("The factorial of the number that you have input is : " + ans);

        input.close();
    }

    public static int Factorial(Long n){
        // base condtion 
        if(n == 0){
            return 1;
        }

        long smallans = Factorial(n-1);
        return (int) (n * smallans);
    }
}
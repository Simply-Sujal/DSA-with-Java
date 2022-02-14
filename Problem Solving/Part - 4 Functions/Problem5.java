import java.util.Scanner;

// 5 Define a method that returns the product of two numbers entered by user.

public class Problem5 {
    static int product(int a , int b){
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b;
        System.out.println("Enter the first number : ");
        a = input.nextInt();
        System.out.println("Enter the second number : ");
        b = input.nextInt();

        int multiplication = product(a, b);

        System.out.println("The product of two number is : " + multiplication);

        input.close();
    }
}
